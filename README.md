# ManagementSystem

## 模块分析
 
### 员工表
字段：<br>
&nbsp;&nbsp;&nbsp;员工编号<br>
&nbsp;&nbsp;&nbsp;员工姓名<br>
&nbsp;&nbsp;&nbsp;员工部门<br>
&nbsp;&nbsp;&nbsp;员工密码<br> 
&nbsp;&nbsp;&nbsp;员工权限<br>

 

### 考勤记录
字段：<br>
迟到、早退、漏签卡、早会未到、早操未到、会议缺席：单选<br>
考勤日期：弹出日期窗口选择<br>
员工姓名：来自员工表，下拉选择单选<br>
考勤时段：来自数据字典表（具体内容有：上午上班、上午下班、下午上班、下午下班），下拉选择单选<br>
考勤说明：文字录入<br>
记录人：默认登录人<br>

 

### 假期申请
字段：<br>
请假时限：日期弹出日期窗口选择，时间录入或弹出时钟窗口选择<br>
假期时长：天数、小时录入数字，小时录入时必须小于8<br>
假期类别：来自数据字典表（具体内容有：病假、事假、产假），下拉单选<br>
请假原因：文字录入<br>
 
### 出差申请
字段：<br>
出差日期：弹出日期窗口选择<br>
出差天数：录入数字<br>
同行人员：来自员工表，应能多选<br>
目的地：录入文字<br>
出行方式：来自数据字典表（具体内容有：大巴、飞机、火车、自驾），下拉单选<br>
出差事由：录入文字<br>

 
### 加班申请

字段：<br>
申请日期：默认系统当前日期<br>
加班日期：弹出日期窗口选择<br>
加班时长：录入数字，小数点一位<br>
加班原因：录入文字<br>

 
### 调休申请

字段：<br>
申请日期：默认系统当前日期<br>
调休时间：弹出日期窗口选择<br>
未休时长：系统自动计算，不可修改，计算方法是：所有加班时长 － 所有调休时长；其中加班时长来自加班申请。<br>
调休时长：录入数字，小数点一位<br>
调休原因：录入文字<br>
 
### 考勤申请
界面中外出次数、签卡次数不需要统计，对应的页面也不需要。第一页是考勤汇总，其他页面显示某个员工的明细信息，比如点击请假这一页，自动显示第1页所选员工在时间段内请假的明细记录。统计请假时长时，按每天8小时换算成天。
<br>
### 数据字典
类型：出行方式、假期类别<br>
说明：汽车、火车….<br>
 
## 数据库
### employee 表

属性	数据类型	说明<br>
Eno	Number(4)	编号<br>
Ename	Varchar2(20)	员工姓名<br>
Password	Varchar2(20)	密码<br>
Dept	Varchar2(20)	部门<br>
Tq	Varchar2(20)	管理员或员工<br>


### kqb 表
属性	数据类型	说明<br>
Kqbh	Number	记录编号<br>
Kqsj	Varchar2(20)	考勤时间<br>
Lb	Varchar2(20)	类别<br>
Ygxm	Varchar2(20)	员工姓名<br>
Kqsd	Varchar2(20)	考勤时段<br>
Kqsm	Varchar2(20)	说明<br>
jlr	Varchar2(20)	记录人<br>
### jq表
属性	数据类型	说明<br>
jqno	Number(4)	编号<br>
Kssj	Varchar2(20)	开始时间<br>
Jssj	Varchar2(20)	结束时间<br>
Sc	Varchar2(20)	时长<br>
Jqlx	Varchar2(20)	类型<br>
Jqyy	Varchar2(20)	请假原因<br>
Zt	Varchar2(20)	状态<br>
Sqr	Varchar2(20)	申请人<br>
Spr	Varchar2(20)	审批人<br>


### Jiaban 表
属性	数据类型	说明<br>
Jno	Number(4)	编号<br>
Sqrq	Varchar2(20)	申请日期<br>
Jbrq	Varchar2(20)	加班日期<br>
jbsc	Varchar2(20)	加班时长<br>
jbyy	Varchar2(20)	加班原因<br>
Zt	Varchar2(20)	状态<br>
Spr	Varchar2(20)	审批人<br>
Sqr	Varchar2(20)	申请人<br>

### chuchai 表
属性	数据类型	说明<br>
Cno	Varchar2(20)	编号<br>
ccrq	Varchar2(20)	出差日期<br>
ccts	Varchar2(20)	出差天数<br>
txry	Varchar2(20)	同行人员<br>
mdd	Varchar2(20)	目的地<br>
cxfs	Varchar2(20)	出差方式<br>
ccsy	Varchar2(20)	出差原因<br>
zt	Varchar2(20)	状态<br>
sqr	Varchar2(20)	申请人<br>
spr	Varchar2(20)	审批人<br>

### sjzd 表
属性	数据类型	说明<br>
Sno	Varchar2(20)	编号<br>
Lx	Varchar2(20)	类型<br>
Sm	Varchar2(20)	说明<br>


### Tiaoxiu 表
属性	数据类型	说明<br>
Tno	number	编号<br>
sqrq	Varchar2(20)	申请日期<br>
wxsc	Varchar2(20)	未休时长<br>
txsc	Varchar2(20)	调休时长<br>
txyy	Varchar2(20)	调休原因<br>
Zt	Varchar2(20)	状态<br>
Spr	Varchar2(20)	申请人<br>
Sqr	Varchar2(20)	审批人<br>
Kssj	Varchar2(20)	开始时间<br>
jssj	Varchar2(20)	结束时间<br>


## 相关资料
### ssh框架

SSH是 struts+spring+hibernate的一个集成框架，是目前比较流行的一种Web应用程序开源框架。
集成SSH框架的系统从职责上分为四层：表示层、业务逻辑层、数据持久层和域模块层，以帮助开发人员在短期内搭建结构清晰、可复用性好、维护方便的Web应用程序。其中使用Struts作为系统的整体基础架构，负责MVC的分离，在Struts框架的模型部分，控制业务跳转，利用Hibernate框架对持久层提供支持，Spring做管理，管理struts和hibernate。具体做法是：用面向对象的分析方法根据需求提出一些模型，将这些模型实现为基本的Java对象，然后编写基本的DAO(Data Access Objects)接口，并给出Hibernate的DAO实现，采用Hibernate架构实现的DAO类来实现Java类与数据库之间的转换和访问，最后由Spring做管理，管理struts和hibernate。
<br>
### jQuery
jQuery是一个快速、简洁的JavaScript框架，是继Prototype之后又一个优秀的JavaScript代码库（或JavaScript框架）。jQuery设计的宗旨是“write Less，Do More”，即倡导写更少的代码，做更多的事情。它封装JavaScript常用的功能代码，提供一种简便的JavaScript设计模式，优化HTML文档操作、事件处理、动画设计和Ajax交互。
jQuery的核心特性可以总结为：具有独特的链式语法和短小清晰的多功能接口；具有高效灵活的css选择器，并且可对CSS选择器进行扩展；拥有便捷的插件扩展机制和丰富的插件。jQuery兼容各种主流浏览器，如IE 6.0+、FF 1.5+、Safari 2.0+、Opera 9.0+等。




