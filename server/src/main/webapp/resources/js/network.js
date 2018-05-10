
//全局变量
var network;
var nodes;
var edges;
//var protein_name='AT1G55490';
var myVar;
var feitalli_nodes = new Array();
function loader(temp_time)
{
	
	var maxWidth = 496;
    var minWidth = 20;
    var time=new Date().getTime()-temp_time;
	var widthFactor = 0.01*time;
    
    var width = Math.max(minWidth,maxWidth * widthFactor);
    document.getElementById('bar').style.width = width + 'px';
    //document.getElementById('text').innerHTML = Math.round(widthFactor*100) + '%';
    
}


//显示专用函数

function show_all()
{
		nodes.forEach(function(node){
				
				   nodes.update({id:node.id,hidden:false});
				    
				   })
				   
		edges.forEach(function(edge){
					   
						   		edges.update({id:edge.id,hidden:false});	   		
		})
}


//过滤专用函数
function filter_degree()
{
	var degree=$("#filter_degree_value").val();
	nodes.forEach(function(node){
					if(node.degree<degree)
						{
						   nodes.update({id:node.id,hidden:true});
						   edges.forEach(function(edge){
							   if(edge.to==node.id | edge.from==node.id )
								   {
								   		edges.update({id:edge.id,hidden:true});
								   }
						   })
						}		
				})
}




$(function(){



//群体
$("#qunti").change(function(){
	
	if($("#qunti").prop("checked")){
		$("#loadingBar").show();
		$("#Bar").animate({width:'650px',},1500);
		//network.destroy();
		alert("群里正在展现");
		$.ajax({
	    url:'/qunti', 
	    dataType:'json',
	    data:{"out_point":out_point,'type':''},
	    async:true,
	    error:function(xhr,status,error)
	    {	$("#loadingBar").hide();
	    	alert("Due to network reasons, please refresh your browser again");
	    },
	    success:function(result,status,xhr){  
	    	  
	    	  nodes = new vis.DataSet(result.nodes);
              edges = new vis.DataSet(result.edges);
              
              var options = {
              	physics: {
        					stabilization: false,
       	   barnesHut: {
          gravitationalConstant: -80000,
          springConstant: 0.001,
          springLength: 200
        }
      },};
              network.setOptions(options);
              network.setData({nodes:nodes,edges:edges,});
              
              if($("#filter_degree").prop("checked"))
			    {
			     filter_degree();
				}
              //network.startSimulation();
              
              //network.redraw();
              $("#loadingBar").hide();
              
              
              
	    	 }
	 });
		
	}
	else
	{
		
	}
	
	
});


	
//套利
$("#taoli").change(function(){
	
	if($("#taoli").prop("checked")){
		alert("正在解析套利用户");
		
		edges.forEach(function(edge){
			nodes.update({id:edge.to,to:1});
			nodes.update({id:edge.from,from:1});
			
		});
		nodes.forEach(function(node){
			if(node.from==0| node.to==0){
				//nodes.remove(node);
				nodes.update({id:node.id,hidden:true});
				feitalli_nodes.push(node.id);
			}
		});
		edges.forEach(function(edge){
			if(feitalli_nodes.indexOf(edge.from)!=-1 | feitalli_nodes.indexOf(edge.to)!=-1)
			{
				edges.update({id:edge.id,hidden:true});
			}
			
			
		});
		
		
	}
	else
	{
		
		
		nodes.forEach(function(node){
			
				//nodes.remove(node);
				nodes.update({id:node.id,hidden:false});
				
			
		});
		
		
		edges.forEach(function(edge){
			//if(feitalli_nodes.indexOf(edge.from | feitalli_nodes.indexOf)
			edges.update({id:edge.id,hidden:false});
			
		});
	}
});

	
	
	
//Shape and degree
	$("#shape_degree").change(function(){
		var options;
		if($("#shape_degree").prop("checked"))
		  {  alert("正在寻找中心点。。。");
			 nodes.forEach(function(node){
			 	if(node.group=='pb')
			 	{
			 	nodes.update({id:node.id,size:node.degree/10+15});
			 	console.log(node.degree);
			 	}
			 })
			 
		  }
		  else
		 {
			  nodes.forEach(function(node)
				  {
				      nodes.update({id:node.id,size:15})
				  })
			 
	     };
	     
})
		
		

	
//********************** Filter when degree
	
$("#filter_degree").change(function(){
	
	if($("#filter_degree").prop("checked"))
		{
			filter_degree();
		}
	else
		{
			show_all();
		}
})
	
	
//********************** Filter when degree
	
$("#filter_degree_value").change(function(){
		
	show_all();
	if($("#filter_degree").prop("checked"))
	{
		filter_degree()
	}
		

})

})












