<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello Highcharts !</title>

    <%--<script src="${pageContext.request.contextPath}/hc/js/jquery.min.js"></script>--%>
    <%--<script src="${pageContext.request.contextPath}/hc/js/highcharts.js"></script>--%>
    <script src="http://cdn.hcharts.cn/jquery/jquery-1.8.3.min.js"></script>
    <script src="http://cdn.hcharts.cn/highcharts/highcharts.js"></script>
    <script type="text/javascript">
        $(function() {
            $('#container').highcharts({ //图表展示容器，与div的id保持一致
                chart : {
                    type : 'column' //指定图表的类型，默认是折线图（line）
                },
                title : {
                    text : 'My first Highcharts chart' //指定图表标题
                },
                xAxis : {
                    categories : [ 'my', 'first', 'chart' ] //指定x轴分组
                },
                yAxis : {
                    title : {
                        text : 'something' //指定y轴的标题
                    }
                },
                series : [ { //指定数据列
                    name : 'Jane', //数据列名
                    data : [ 1, 0, 4 ] //数据
                }, {
                    name : 'John',
                    data : [ 5, 7, 3 ]
                } ]
            });
        });
    </script>
</head>
<body>
<!-- 定义图表的容器 -->
<div id="container" style="width: 100%; height: 400px;"></div>
</body>
</html>