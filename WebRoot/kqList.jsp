<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="include.jsp" %>
<html>
  <head>
    
    <title>考勤查询</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    	
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
				<li class="active">考勤查询</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">考勤查询</h1>
			</div>
		</div><!--/.row-->
				
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">考勤信息</div>
					<div class="panel-body">
						<table data-toggle="table" data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
						        <th>员工姓名</th>
				   				<th>请假</th>
				   				<th>出差</th>
				   				<th>加班</th>
				   				<th>调休</th>
				   				<th>迟到</th>
				   				<th>早退</th>
				   				<th>漏打卡</th>
				   				<th>早会未到</th>
				   				<th>早操未到</th>
				   				<th>会议缺席</th>
						    </tr>
						    </thead>
						    
						    <s:iterator id="e" value="empList">
				   				<tr>
				   					<td>${e.ename }</td>
					   				<td>${e.qj }天</td>
					   				<td>${e.cc }天</td>
					   				<td>${e.jb }天</td>
					   				<td>${e.tx }天</td>
					   				<td>${e.cd }次</td>
					   				<td>${e.zt }次</td>
					   				<td>${e.ldk }次</td>
					   				<td>${e.zhwd }次</td>
					   				<td>${e.zcwd }次</td>
					   				<td>${e.hyqx }次</td>
				   				</tr>
				   			</s:iterator>
						    
						    
						</table>
					</div>
				</div>
			</div>
		</div><!--/.row-->	
		
			
		
		
	</div><!--/.main-->

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/bootstrap-table.js"></script>
	<script>
		!function ($) {
			$(document).on("click","ul.nav li.parent > a > span.icon", function(){		  
				$(this).find('em:first').toggleClass("glyphicon-minus");	  
			}); 
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script>	
  </body>
</html>
