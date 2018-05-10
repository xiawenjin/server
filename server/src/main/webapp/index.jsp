<html>
<body>
<p id="time"></p>
<script>
    function time() {
        var date=new Date();
        var year=date.getYear();
        var month=date.getMonth();
        var day=date.getDate();
        var hour=date.getHours();
        var min=date.getMinutes();
        var sec=date.getSeconds();
        var times=year+1900+"-"+month+"-"+day+" "+hour+":"+min+":"+sec;
        //console.info(times);
        document.getElementById("time").innerText=times;
        setTimeout(time,1000);
    }
   // window.onload=time();
   // setTimeout(time,10);
   // setInterval(time,1000);
</script>


</body>
</html>
