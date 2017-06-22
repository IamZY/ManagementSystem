<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Amaze UI Admin index Examples</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <script src="http://cdn.bootcss.com/echarts/3.3.2/echarts.min.js"></script>
    <link rel="stylesheet" href="assets/css/amazeui.min.css" />
    <link rel="stylesheet" href="assets/css/amazeui.datatables.min.css" />
    <link rel="stylesheet" href="assets/css/app.css">


    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
	<link rel="stylesheet" type="text/css" href="css/xcConfirm.css"/>
		<script src="js/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/xcConfirm.js" type="text/javascript" charset="utf-8"></script>
		<style type="text/css">
			.sgBtn{width: 135px; height: 35px; line-height: 35px; margin-left: 10px; margin-top: 10px; text-align: center; background-color: #0095D9; color: #FFFFFF; float: left; border-radius: 5px;}
		</style>


	<script type="text/javascript">
			$(function(){


		    $("input:button").click(function() {
		
		        str = $(this).val()=="编辑"?"确定":"编辑";  
		
		        $(this).val(str);   // 按钮被点击后，在“编辑”和“确定”之间切换
		
		        $(this).parent().siblings("td").each(function() {  // 获取当前行的其他单元格
		
		            obj_text = $(this).find("input:text");    // 判断单元格下是否有文本框
		
		            if(!obj_text.length)   // 如果没有文本框，则添加文本框使之可以编辑
		
		                $(this).html("<input type='text' value='"+$(this).text()+"'>");
		
		            else   // 如果已经存在文本框，则将其显示为文本框修改的值
		
		                $(this).html(obj_text.val()); 


    });

}); 
			

			});
		</script>


</head>



<body data-type="widgets">
   
   <table border="1px" width="400px" height="300px">

    <tr><td>1</td><td>2</td><td><input type="button" value="编辑"></td></tr>

    <tr><td>2</td><td>5</td><td><input type="button" value="编辑"></td></tr>

    <tr><td>3</td><td>8</td><td><input type="button" value="编辑"></td></tr>

    <tr><td>4</td><td>2</td><td><input type="button" value="编辑"></td></tr>

</table>
   
   
   
    <script src="http://cdn.bootcss.com/amazeui/2.7.2/js/amazeui.min.js"></script>
    <script src="assets/js/amazeui.datatables.min.js"></script>
    <script src="assets/js/dataTables.responsive.min.js"></script>
    <script src="assets/js/app.js"></script>

	
	

</body>



</html>
