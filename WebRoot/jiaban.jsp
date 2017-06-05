<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="include.jsp" %>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>加班申请</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript" src="<%=basePath %>/My97DatePicker/WdatePicker.js"></script>
  
  <body>
  	
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">		
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
				<li class="active">加班申请</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">加班申请</h1>
			</div>
		</div><!--/.row-->
									
		
		
		<div class="row">
			<div class="col-md-8">
				<div class="panel panel-default">
					<div class="panel-heading"><span class="glyphicon glyphicon-envelope"></span>Writing Content</div>
					<div class="panel-body">
						<form class="form-horizontal" action="saveJBAction" method="post">
								<input type="hidden" name="jb.spr" value="<%=session.getAttribute("ename") %>">
    							<input type="hidden" name="jb.sqr" value="<%=session.getAttribute("ename") %>">
							<fieldset>
								<!-- 类别 input-->
								<div class="form-group">
									<label class="col-md-3 control-label" for="kqsj">申请时间</label>
									<div class="col-md-9">
										<input type="text" name="jb.sqrq" value="<%=time %>" class="form-control">
									</div>
								</div>
							
								<!-- 考勤时间 input-->
								<div class="form-group">
									<label class="col-md-3 control-label" for="">加班日期</label>
									<div class="col-md-9">
											<input type="text" name="jb.jbrq" class="form-control" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  /> 
									</div>
								</div>
								
								
								<!-- 考勤时段 body -->
								<div class="form-group">
									<label class="col-md-3 control-label" for="">加班时长</label>
									<div class="col-md-9">
										<input type="text" name="jb.jbsc" class="form-control">个工作日
									</div>
								</div>

								
								<!-- 考勤说明 body -->
								<div class="form-group">
									<label class="col-md-3 control-label" for="">加班原因</label>
									<div class="col-md-9">
								    	<input type="text" name="jb.jbyy" class="form-control">
									</div>
								</div>
								
								
								<!-- 提交 actions -->
								<div class="form-group">
									<div class="col-md-12 widget-right">
										<button type="reset" class="btn btn-default btn-md pull-right">reset</button>
										<button type="submit" class="btn btn-default btn-md pull-right">Submit</button>
									</div>
									
								</div>
								
								
							</fieldset>
						</form>
					</div>
				</div>
				
								
			</div><!--/.col-->
		</div><!--/.row-->
	</div>	<!--/.main-->
		  

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script>
		$('#calendar').datepicker({
		});

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
