<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/26
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://cdn.hcharts.cn/jquery/jquery-1.8.3.min.js"></script>
<script src="http://cdn.hcharts.cn/highcharts/highcharts.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="container" style="width: 550px; height: 400px; margin: 0 auto"></div>

<script type="text/javascript">
    var chart;
    $(function () {

        $(document).ready(function() {
            chart = new Highcharts.Chart({
                chart: {
                    renderTo: 'container',
                    plotBackgroundColor: null,
                    plotBorderWidth: null,
                    plotShadow: false
                },title: {
                    text: '教师绩效分析图'
                },
                tooltip: {
                    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
                },
                plotOptions: {
                    pie: {
                        allowPointSelect: true,
                        cursor: 'pointer',
                        dataLabels: {
                            enabled: true,
                            color: '#000000',
                            connectorColor: '#000000',
                            format: '<b>{point.name}</b>: {point.percentage:.1f} %'
                        },
                        showInLegend: true
                    }
                },
                series: [{
                    type: 'pie',
                    name: '所占比例',
                }]
            });
        });
        //调用查询，加载数据
        chaxun();
    });
    function chaxun(){
        var arr = [];
        var param = $('#groupS').val();
        if($('#departmentS').val()!="全部"){
            param += "&department="+$('#departmentS').val();
        }
        if($('#typeS').val()!="全部"){
            param += "&type="+$('#typeS').val();
        }
        $.ajax({
            type:'get',
            url:'/SX2/WorkloadAnalysis/getData?group='+param,//请求数据的地址
            beforeSend:function(XMLHttpRequest){
                $('#loading').show();
                $('#contentDIV').hide();
                $('#loading').html("<img src='<%=path%>/image/loading.gif' />");
            },
            success: function(data){
                $('#contentDIV').show();
                $('#loading').hide();

                $(data.data).each(function(index,item){
                    arr.push([item.name,item.num]);
                });
                chart.series[0].setData(arr);//数据填充到highcharts上面
            },
            error:function(e){
                alert("不好意思，请要访问的图标跑到火星去了。。。。");
            }
        });
    };
</script>
</body>
</html>
