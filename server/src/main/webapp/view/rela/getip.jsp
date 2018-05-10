<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="icon" HREF="biologo1.jpg">
    <title>Traditional Chinese Medicine Integrated Database</title>
    <link href="${pageContext.request.contextPath}/resources/css/vis.min.css" rel="stylesheet" type="text/css" />

    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.js"></script>
    <script type="text/javascript" src="/resources/js/vis.js"></script>
    <script type="text/javascript" src="/resources/js/network.js"></script>

    <style>
        #mynetwork {
            width: 100%;
            height: 100%;
            border: 1px solid lightgray;
        }
        #loadingBar {
            position:absolute;
            top:0px;
            left:0px;
            width: 902px;
            height: 902px;
            background-color:rgba(200,200,200,0.8);
            -webkit-transition: all 0.5s ease;
            -moz-transition: all 0.5s ease;
            -ms-transition: all 0.5s ease;
            -o-transition: all 0.5s ease;
            transition: all 0.5s ease;
            opacity:1;
        }
        #wrapper {
            position:relative;
            width:900px;
            height:900px;
        }

        #text {
            position:absolute;
            top:8px;
            left:530px;
            width:30px;
            height:50px;
            margin:auto auto auto auto;
            font-size:22px;
            color: #000000;
        }

        div.outerBorder {
            position:relative;
            top:400px;
            width:600px;
            height:44px;
            margin:auto auto auto auto;
            border:8px solid rgba(0,0,0,0.1);
            background: rgb(252,252,252); /* Old browsers */
            background: -moz-linear-gradient(top,  rgba(252,252,252,1) 0%, rgba(237,237,237,1) 100%); /* FF3.6+ */
            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(252,252,252,1)), color-stop(100%,rgba(237,237,237,1))); /* Chrome,Safari4+ */
            background: -webkit-linear-gradient(top,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* Chrome10+,Safari5.1+ */
            background: -o-linear-gradient(top,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* Opera 11.10+ */
            background: -ms-linear-gradient(top,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* IE10+ */
            background: linear-gradient(to bottom,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* W3C */
            filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#fcfcfc', endColorstr='#ededed',GradientType=0 ); /* IE6-9 */
            border-radius:72px;
            box-shadow: 0px 0px 10px rgba(0,0,0,0.2);
        }
        #border {
            position:absolute;
            top:10px;
            left:10px;
            width:500px;
            height:23px;
            margin:auto auto auto auto;
            box-shadow: 0px 0px 4px rgba(0,0,0,0.2);
            border-radius:10px;
        }
        #bar {
            position:absolute;
            top:0px;
            left:0px;
            width:20px;
            height:20px;
            margin:auto auto auto auto;
            border-radius:11px;
            border:2px solid rgba(30,30,30,0.05);
            background: rgb(0, 173, 246); /* Old browsers */
            box-shadow: 2px 0px 4px rgba(0,0,0,0.4);
        }
    </style>
</head>

<body style="height:100%">

<div id="wrapper1" style="height:100%">

    <div id="loadingBar"  style="height:100%;width:75%">
        <div class="outerBorder">
            <div id="text">waiting</div>
            <div id="border">
                <div id="bar"></div>
            </div>
        </div>
    </div>

    <div id="mynetwork" style="width:75%;float:left; border:2.5px solid #d3d3d3; ">

    </div>
</div>

<div id=""  style="height:100%;width:24%;float:left; border:2.5px solid #d3d3d3;overflow:scroll;position:fixed;right:1px;">

    <fieldset style="background-color:#e4e9f0">
        <legend>Notice:</legend>

        <p style="font-size:14px;text-align:justify;">Due to the RCC (rich-club connectivity) phenomena within the biological molecular network, sometimes we couldn't show all the interactions related to the query elements for the identifiability and clarity, in these cases, we sort and filter related nodes by degrees within different categories. The user could always use the following link to get all the direct interactions information related to the query proteins.

        </p>
        <p><a id="direct_interaction" target="_blank" style="color:red;font-weight:900;">Detailed Interaction Information</a></p>
    </fieldset>


    <fieldset style="background-color:#e4e9f0">
        <legend>Vertics:</legend>
        <input type="checkbox" id="shape_degree" autocomplete="off">size by degree<br>
        <input type="checkbox" id="filter_degree" autocomplete="off">Filter when degree &lt;
        <select id='filter_degree_value' >
            <option value=0 >0</option>
            <option value=2 >2</option>
            <option value=3>3</option>
            <option value=4>4</option>
            <option value=5>5</option>
            <option value=10>10</option>
            <option value=15>15</option>
            <option value=20>20</option>
        </select>
    </fieldset>


    <fieldset style="background-color:#e4e9f0">
        <legend>Legend:</legend>

       <%-- <img alt="" src="/tcmid/static/img/20161024213058.png" style="width:100%;height:100%">--%>

    </fieldset>

    <fieldset style="background-color:#e4e9f0">
        <legend>Network Layout  &　physics </legend>
        <div id="network_config"></div>
        <br/>
    </fieldset>

</div>

<script>
    //获取参数

    var ingredient_id=645;

    $.ajax({
        url:'/relation/getRe',
        dataType:'json',
        data:{"id":ingredient_id},
        async:true,
        error:function(xhr,status,error){
            $("#loadingBar").hide();
            alert("Due to network reasons, please refresh your browser again");
        },
        success:function(result,status,xhr){

            //alert(result);
            //console.log(result);
            $("#loadingBar").hide();

            //获取屏幕的高度
            var screen_height=(window.screen.availHeight)-60;

            //alert(screen_height);
            $("#mynetwork").css({'height':screen_height});

            //clearInterval(myVar);
            nodes = new vis.DataSet(result.nodes);


            edges = new vis.DataSet(result.edges);

            var container = document.getElementById('mynetwork');
            var data = {
                nodes: nodes,
                edges: edges
            };
            var options = {

                edges:{
                        color: {
                            color:'#97C2FC',
                            highlight:'#f403f4',
                            hover: 'green',

                            opacity:1.0
                        },
                    },

                nodes:{
                        shape:'dot',
                        size:15,
                        color: {
                            border: '#2B7CE9',
                            background: '#97C2FC',
                            highlight: {
                                border: '#2B7CE9',
                                background: '#f403f4'
                            },
                            hover: {
                                border: '#2B7CE9',
                                background: '#f403f4'
                            }
                        },

                    },


                groups:{
                    ii:{color:{background:'red'}, borderWidth:1,shape:'triangle'},
                    t:{color:{background:'blue'}, borderWidth:1,shape:'dot'},
                    oi:{color:{background:'yellow'}, borderWidth:1,shape:'triangle'},
                },
                interaction:{
                        navigationButtons: true,
                        keyboard: true,
                        hover:true
                    },

                configure: {
                    enabled: true,
                    filter:function (option, path){
                        //console.log(path);

                        if (path.indexOf('physics') !== -1){
                            return true;
                        }
                        if (path.indexOf('arrows') !== -1 ) {
                            return true;
                        }
                        if (path.indexOf('dashes') !== -1 || option=="dashes") {
                            return true;
                        }
                        if (path.indexOf('smooth') !== -1 ) {
                            return true;
                        }
                        if (path.indexOf('nodes') !== -1 && path.indexOf('font') !== -1) {
                            return true;
                        }
                        return false;
                    },

                    //filter: 'nodes,edges',
                    container: document.getElementById('network_config'),
                    showButton: false
                }
            };

            network = new vis.Network(container, data, options);

            //alert("eee");

            $("#direct_interaction").attr("href","/relation/getRe?id="+ingredient_id);

            network.on("doubleClick", function (params){

                var node_name=params.nodes[0];
                var node_data = nodes.get(node_name);
                console.log(node_data);

                if(node_data.group=='t'){
                    var tmp=node_data.title.split("<br/>");
                    tmp[1]=tmp[1].replace('Uniprot:', '');
                    //alert(tmp[1]+"  Uniprot");
                    window.open("http://www.uniprot.org/uniprot/"+tmp[1]);
                }else{
                    var tmp=node_data.title.split("<br/>");
                    tmp[0]=tmp[0].replace('Stitch Id:CID', '');
                    if(tmp[1]!="NA"){
                        window.open("https://pubchem.ncbi.nlm.nih.gov/compound/"+tmp[0]);
                    }
                }

            });

            network.on("hoverNode", function (params){

                var node_id=params['node'];
                var node_data = nodes.get(node_id);
                if(node_data['title']==null){
                    $.ajax({
                        url:'/tcmid/title_network',
                        dataType:'json',
                        data:{"id":node_data.id,'group':node_data.group},
                        success:function(result,status,xhr){
                            nodes.update({id:node_id,title:result})
                        }
                    })
                }
            })
            $("#loadingBar").hide();
        }
    })

    $("#bar").animate({
        width:'650px',
    },1500);

</script>

</body>
</html>
