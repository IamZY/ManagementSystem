<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="include.jsp" %>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>数据字典</title>
    
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
				<li class="active">数据字典</li>
				<li><a href="javascript:void(0);" id="add"><span class="glyphicon glyphicon-check"></span></a></li>	
			</ol>
			
		</div><!--/.row-->
		
		<br>
		<div id="addDiv" class="row" style="display: none">
			<div class="col-lg-12">
				<form id="addForm" action="addSJZDAction" method="post">
					类型<input type="text" name="sjzd.lx"/>
					说明<input type="text" name="sjzd.sm"/>
					&nbsp;&nbsp;<a href="javascript:void(0);" id="tj">+</a>
					&nbsp;&nbsp;<a href="javascript:void(0);" id="qx">-</a>
				</form>
			</div>
		</div><!--/.row-->
		
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">数据字典</h1>
			</div>
		</div><!--/.row-->
				
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">数据字典</div>
					<div class="panel-body">
					
					<form id="form" action="updateSJZDAction" method="post">	
							<table data-toggle="table" data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="false" data-sort-name="name" data-sort-order="desc">
							    <thead>
							    <tr>
							    	<th style="display: none">ID</th>
							        <th>类型</th>
					   				<th>说明</th>
					   				<th></th>
					   				<th>操作</th>
							    </tr>
							    </thead>
							    
							    <s:iterator id="s" value="sjzdList">
					   				<tr>
					   					<td style="display: none">${s.sno }</td>
					   					<td>${s.lx }</td>
						   				<td>${s.sm }</td>
					   					<td><a href="delSJZDAction.action?sjzd.sno=${s.sno }"><span class="glyphicon glyphicon-trash"></span></a></td>
					   					<td><input type="button" value="编辑"></td>
					   				</tr>
					   			</s:iterator>
						   
							</table>
						
						<input type="hidden" id="sno" name="sjzd.sno" value="">	
						<input type="hidden" id="lx" name="sjzd.lx" value="">	
						<input type="hidden" id="sm" name="sjzd.sm" value="">	
						
						
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
		
			$("#add").click(function(){
				
				$("#addDiv").show();
				
				$("#tj").click(function(){
					
					$("#addForm").submit();
				
				
				});
				
				
				
				
			
			});
			
			
			$("#qx").click(function(){
				
				$("#addDiv").hide();
			
			
			});
		
		
		
  			  			
  			$("input:button").click(function(){
  				
  				var str = $(this).val()=="编辑"?"确定":"编辑";  
						
		        $(this).val(str);   // 按钮被点击后，在“编辑”和“确定”之间切换

								
				var data = new Array(2);
				var i = 0;
		
		
		        $(this).parent().siblings("td").each(function() {  // 获取当前行的其他单元格
		
		            	obj_text = $(this).find("input:text");    // 判断单元格下是否有文本框
													
																					
						if(obj_text.val()!=null){
							data[i]=obj_text.val();
							
							console.log(i);
							
							if(i==0){
								//console.log("data[0]->"+data[0]);
								$("#sno").val(data[0]);						
							}
							
							if(i==1){
								//console.log("data[1]->"+data[1]);
								$("#lx").val(data[1]);
							}
							
							if(i==2){
								//console.log("data[2]->"+data[2]);
								$("#sm").val(data[2]);
							}
	
													
							if(data[2] != null){
														
								$("#form").submit();
							}
	
						}
						
						
						i++;		
								
								
								
		            	if(!obj_text.length){
		                	$(this).html("<input type='text' value='"+$(this).text()+"'>");	                			                		            	
		            	}   // 如果没有文本框，则添加文本框使之可以编辑
		            	else{
		            	
		            		//确定后...
		                	$(this).html(obj_text.val()); 
		                		                		            	
		            	}   // 如果已经存在文本框，则将其显示为文本框修改的值
		
						
		
		
    				});
  				
  			
  			});
  			
  		});
		
		
		
		
		
		
		
		
	</script>	
  </body>
</html>
