<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath()
            + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <script src="js/jquery-3.4.1.min.js"></script>
    <style>
        div{
            width: 200px;
            height: 200px;
            background-color: pink;
        }
    </style>
</head>
<body>
<script>
    $(function () {
        $("#btn").click(function () {
            $.ajax({
                url:"some.do",
                data:"name=zs",
                type:"get",
                dataType:"json",
                async:"true",
                success:function (data) {
                    alert(data)
                    $("#d1").html(data);
                }
            })
        })
    })
</script>
<div id="d1"></div><br>
<div id="d2">一定可以的</div><br>
<button id="btn">点击按钮</button>
</body>
</html>
