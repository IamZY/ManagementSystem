<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="include.jsp" %>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>审批信息</title>
    
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
				<li class="active">审批信息</li>
			</ol>
			
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">审批信息</h1>
				
			</div>
		</div><!--/.row-->
				
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">审批信息</div>
					<div class="panel-body">
					
					 	<form id="form" action="updateSPAction" method="post">
					 	
						<table data-toggle="table" data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
						    	<th>ID</th>
						    	<th>申请人</th>
						        <th>申请类型</th>
				   				<th>说明</th>
				   				<th>状态</th>
				   				<th>审批</th>
				   				<th>确认</th>
						    </tr>
						    </thead>
						    
						   
							    <s:iterator id="s" value="spList">
					   				<tr>
					   					<td>${s.spno }</td>
					   					<td>${s.sqr }</td>
						   				<td>${s.sqlx }</td>
						   				<td>${s.sm }</td>
						   				<td><a style="color: red">${s.zt }</a></td>
						   				<td>
						   					<select name="sp.zt">
						   						<option value="同意">同意</option>
						   						<option value="不同意">不同意</option>
						   					</select>
						   				</td>
						   				<td><input type="button" value="确认"/></td>
					   				</tr>
					   			</s:iterator>
										    
								</table>
								
								<input type="hidden" id="id" name="sp.spno" />
								<input type="hidden" id="lx" name="sp.sqlx" />
								<input type="hidden" id="" name="" />
								
				   			</form>
				   			
				   			
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
		
		
		
		$(function(){
  			  			
  			$("input:button").click(function(){
  				
  				//var str = $(this).parent().prev().prev().val(); 
						
		
				//console.log(str);	
				
				var data = new Array(6);
				var i = 0;
		
		 			$(this).parent().siblings("td").each(function() {
		
							obj_text = $(this).text();    // 判断单元格下是否有文本框														
							data[i]=obj_text;
							i++;
						});
						
						$("#id").val(data[0]);
						$("#lx").val(data[2]);
						
						$("#form").submit();
						
						
  			
  			});
  			
  		});
		
		
		
		
		
		
		
		
		
		
		
		
	</script>	
  </body>
</html>
