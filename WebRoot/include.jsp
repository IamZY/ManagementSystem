<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/bootstrap-table.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">


<%@ taglib prefix ="s" uri="/struts-tags"%>

<script type="text/javascript" src="<%=basePath %>/My97DatePicker/WdatePicker.js"></script> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
     
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
	
	<script type="text/javascript">
			
			$(function(){
			
				var auth = $("input[id='auth']").val();
				//console.log(auth);
				if(auth != "管理员"){
					$("#sjzd").hide();
					$("#tjyg").hide();
					$("#kqjl").hide();
					$("#spxx").hide();
				}
				
				setInterval(function(){   
            		$("#currentTime").text(new Date().toLocaleString());   
        		},1000);   
						
			});
			
	</script>
	

  </head>
  
  <body>
    	<%		
    		
  			java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");    
   			java.util.Date currentTime = new java.util.Date();    
   			String time = simpleDateFormat.format(currentTime).toString(); 

   			String auth = (String)session.getAttribute("auth");
   			//out.println(auth); 
  	 	%>
  
  
  		<input type="hidden" id="auth" value="<%=auth %>">
  		
    	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp"><span>考勤管理系统</span></a>
				<ul class="user-menu">
					<li class="dropdown pull-right">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<span class="glyphicon glyphicon-user"></span><%=session.getAttribute("ename") %>
						<span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#"><span class="glyphicon glyphicon-user"></span>个人资料</a></li>
							<li id="spxx"><a href="SPAction"><span class="glyphicon glyphicon-list-alt"></span>审批信息</a></li>
							<li id="tjyg"><a href="tjygAction"><span class="glyphicon glyphicon-cog"></span>添加员工</a></li>
							<li><a href="login.jsp"><span class="glyphicon glyphicon-log-out"></span>退出</a></li>
						</ul>
						<a id="currentTime" ></a>
						<a style="color: red"><%=auth %></a>
					</li>
				</ul>
			</div>
		</div><!-- /.container-fluid -->
	</nav>
		
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li class="active"><a href="index.jsp"><span class="glyphicon glyphicon-home"></span>主页</a></li>
			<li id="kqjl"><a href="KQAction.action"><span class="glyphicon glyphicon-th"></span>考勤记录</a></li>
			<li><a href="JQAction.action"><span class="glyphicon glyphicon-stats"></span>假期申请</a></li>
			<li><a href="CCAction.action"><span class="glyphicon glyphicon-list-alt"></span>出差申请</a></li>
			<li><a href="jiaban.jsp"><span class="glyphicon glyphicon-pencil"></span>加班申请</a></li>
			<li><a href="tiaoxiu.jsp"><span class="glyphicon glyphicon-info-sign"></span>调休申请</a></li>
			<li id="sjzd"><a href="showSJZDAction.action"><span class="glyphicon glyphicon-dashboard"></span>数据字典</a></li>
			<li class="parent" id="kqcx">
				<a href="findKQAction.action">
					<span class="glyphicon glyphicon-list"></span>考勤查询<span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
				</a>
				<ul class="children collapse" id="sub-item-1">
					<li>
						<a class="" href="showJQAction.action?auth=<%=auth %>&ename=<%=session.getAttribute("ename") %>">
							<span class="glyphicon glyphicon-share-alt"></span>请假查询
						</a>
					</li>
					<li>
						<a class="" href="showCCAction.action?auth=<%=auth %>&ename=<%=session.getAttribute("ename") %>">
							<span class="glyphicon glyphicon-share-alt"></span>出差查询
						</a>
					</li>
					<li>
						<a class="" href="showJBAction.action?auth=<%=auth %>&ename=<%=session.getAttribute("ename") %>">
							<span class="glyphicon glyphicon-share-alt"></span>加班查询
						</a>
					</li>
					<li>
						<a class="" href="showTXAction.action?auth=<%=auth %>&ename=<%=session.getAttribute("ename") %>">
							<span class="glyphicon glyphicon-share-alt"></span>调休查询
						</a>
					</li>
					<li>
						<a class="" href="showKQAction.action">
							<span class="glyphicon glyphicon-share-alt"></span>考勤记录
						</a>
					</li>
				</ul>
			</li>
			
			<li role="presentation" class="divider"></li>
			<li><a href="login.jsp"><span class="glyphicon glyphicon-user"></span> Login Page</a></li>
		</ul>
		<div class="attribution">More Templates <a href="#" target="_blank" title="">计141</a> - Collect from <a href="#" title="" target="_blank">臧阳</a></div>
	</div><!--/.sidebar-->
  </body>
</html>
