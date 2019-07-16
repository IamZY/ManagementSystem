/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : ms

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-27 20:30:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chuchai
-- ----------------------------
DROP TABLE IF EXISTS `chuchai`;
CREATE TABLE `chuchai` (
  `CNO` bigint(20) NOT NULL AUTO_INCREMENT,
  `CCRQ` varchar(20) NOT NULL,
  `CCTS` bigint(20) NOT NULL,
  `TXRY` varchar(20) NOT NULL,
  `MDD` varchar(20) NOT NULL,
  `CXFS` varchar(20) NOT NULL,
  `CCSY` varchar(20) NOT NULL,
  `ZT` varchar(20) NOT NULL,
  `SPR` varchar(20) DEFAULT NULL,
  `SQR` varchar(20) NOT NULL,
  PRIMARY KEY (`CNO`)
) ENGINE=InnoDB AUTO_INCREMENT=1224 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chuchai
-- ----------------------------
INSERT INTO `chuchai` VALUES ('1042', '2017-06-02', '2', '臧阳, 包悦, 苏波', '南京', '飞机', '123', '同意', '臧阳', '臧阳');
INSERT INTO `chuchai` VALUES ('1061', '2017-06-07', '11', '包悦', '南京', '飞机', '123', '同意', '臧阳', '臧阳');
INSERT INTO `chuchai` VALUES ('1062', '2017-06-16', '11', '苏波', '南京', '飞机', '123', '同意', '臧阳', '臧阳');
INSERT INTO `chuchai` VALUES ('1067', '2017-06-15', '2', '包悦', '南京', '飞机', '123', '同意', '臧阳', '臧阳');
INSERT INTO `chuchai` VALUES ('1086', '2017-06-07', '12', '臧阳', '北京', '自驾', '123', '同意', '臧阳', '臧阳');
INSERT INTO `chuchai` VALUES ('1154', '2017-06-21', '11', '张翔, 臧阳', '南京', '飞机', '123', '同意', '包悦', '包悦');
INSERT INTO `chuchai` VALUES ('1163', '2017-06-21', '1', '臧阳, 徐夏俊', '北京', '飞机', '外出工作', '同意', '臧阳', '冯智华');
INSERT INTO `chuchai` VALUES ('1223', '2017-06-22', '2', '张翔, 苏波', '上海', '火车', '出差', '同意', '臧阳', '冯智华');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `EMPNO` varchar(20) NOT NULL,
  `ENAME` varchar(20) DEFAULT NULL,
  `PASSWORD` varchar(20) DEFAULT NULL,
  `DEPT` varchar(20) DEFAULT NULL,
  `AUTH` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`EMPNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1142', '冯智华', '123', '市场部', '员工');
INSERT INTO `employee` VALUES ('1147', 'Java', '123', '董事会', '管理员');
INSERT INTO `employee` VALUES ('1148', '徐夏俊', '123', '人事部', '员工');
INSERT INTO `employee` VALUES ('1151', '张翔', '123', '董事会', '管理员');
INSERT INTO `employee` VALUES ('1181', '苏波', '123', '后勤部', '员工');
INSERT INTO `employee` VALUES ('4654', '包悦', '123', '技术部', '员工');
INSERT INTO `employee` VALUES ('7399', '臧阳', '123', '董事会', '管理员');

-- ----------------------------
-- Table structure for jiaban
-- ----------------------------
DROP TABLE IF EXISTS `jiaban`;
CREATE TABLE `jiaban` (
  `JNO` bigint(20) NOT NULL AUTO_INCREMENT,
  `SQRQ` varchar(20) NOT NULL,
  `JBRQ` varchar(20) NOT NULL,
  `JBSC` double NOT NULL,
  `JBYY` varchar(20) NOT NULL,
  `ZT` varchar(20) NOT NULL,
  `SPR` varchar(20) DEFAULT NULL,
  `SQR` varchar(20) NOT NULL,
  PRIMARY KEY (`JNO`)
) ENGINE=InnoDB AUTO_INCREMENT=1162 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jiaban
-- ----------------------------
INSERT INTO `jiaban` VALUES ('1043', '2017-06-01 07:36:18', '2017-06-16', '2', '123', '同意', '臧阳', '臧阳');
INSERT INTO `jiaban` VALUES ('1044', '2017-06-01 07:56:18', '2017-06-08', '5', '123', '同意', '臧阳', '臧阳');
INSERT INTO `jiaban` VALUES ('1068', '2017-06-01 13:57:26', '2017-06-10', '5', '123', '同意', '臧阳', '臧阳');
INSERT INTO `jiaban` VALUES ('1088', '2017-06-01 21:08:03', '2017-06-09', '5', '123', '同意', '臧阳', '臧阳');
INSERT INTO `jiaban` VALUES ('1155', '2017-06-20 12:51:56', '2017-06-20', '2', '工作未做完', '同意', '包悦', '包悦');
INSERT INTO `jiaban` VALUES ('1156', '2017-06-20 12:53:09', '2017-06-21', '1', '工作未做完', '同意', '包悦', '包悦');
INSERT INTO `jiaban` VALUES ('1160', '2017-06-20 19:32:51', '2017-06-20', '2', '任务未做完', '同意', '臧阳', '包悦');
INSERT INTO `jiaban` VALUES ('1161', '2017-06-20 19:35:33', '2017-06-20', '1', '任务未做完', '同意', '张翔', '冯智华');

-- ----------------------------
-- Table structure for jq
-- ----------------------------
DROP TABLE IF EXISTS `jq`;
CREATE TABLE `jq` (
  `JQNO` bigint(20) NOT NULL AUTO_INCREMENT,
  `KSSJ` varchar(20) NOT NULL,
  `JSSJ` varchar(20) NOT NULL,
  `SC` varchar(20) NOT NULL,
  `JQLX` varchar(20) NOT NULL,
  `JQYY` varchar(20) NOT NULL,
  `ZT` varchar(20) NOT NULL,
  `SPR` varchar(20) DEFAULT NULL,
  `SQR` varchar(20) NOT NULL,
  PRIMARY KEY (`JQNO`)
) ENGINE=InnoDB AUTO_INCREMENT=1241 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jq
-- ----------------------------
INSERT INTO `jq` VALUES ('1041', '2017-06-03', '2017-06-16', '1.17', '病假', '123', '同意', '臧阳', '臧阳');
INSERT INTO `jq` VALUES ('1066', '2017-06-14', '2017-06-15', '1.08', '事假', '123', '同意', '臧阳', '臧阳');
INSERT INTO `jq` VALUES ('1085', '2017-06-02', '2017-06-03', '1.08', '事假', '123', '同意', '臧阳', '臧阳');
INSERT INTO `jq` VALUES ('1120', '2017-06-07', '2017-06-08', '1.00', '产假', '老婆生小孩', '同意', '臧阳', '臧阳');
INSERT INTO `jq` VALUES ('1153', '2017-06-20', '2017-06-21', '1.00', '事假', '有事u', '同意', '包悦', '包悦');
INSERT INTO `jq` VALUES ('1157', '2017-06-20', '2017-06-21', '1.00', '事假', '陪产', '同意', '臧阳', '臧阳');
INSERT INTO `jq` VALUES ('1158', '2017-06-20', '2017-06-21', '1.00', '事假', '312312', '同意', '臧阳', '包悦');
INSERT INTO `jq` VALUES ('1180', '2017-06-21', '2017-06-22', '1.00', '事假', '事假', '不同意', '臧阳', '包悦');
INSERT INTO `jq` VALUES ('1182', '2017-06-21', '2017-06-22', '1.00', '事假', '事假', '同意', '臧阳', '苏波');
INSERT INTO `jq` VALUES ('1224', '2017-06-22', '2017-06-23', '1.00', '带薪休假', '123', '同意', '臧阳', '苏波');
INSERT INTO `jq` VALUES ('1227', '2017-06-22', '2017-06-23', '1.00', '病假', '123', '同意', '臧阳', '包悦');
INSERT INTO `jq` VALUES ('1240', '2018-03-07', '2018-03-10', '3.00', '病假', 'hghghg', '同意', '臧阳', '包悦');

-- ----------------------------
-- Table structure for kqb
-- ----------------------------
DROP TABLE IF EXISTS `kqb`;
CREATE TABLE `kqb` (
  `KQBH` bigint(20) NOT NULL AUTO_INCREMENT,
  `KQSJ` varchar(20) NOT NULL,
  `LB` varchar(20) NOT NULL,
  `YGXM` varchar(20) NOT NULL,
  `KQSD` varchar(20) NOT NULL,
  `KQSM` varchar(20) NOT NULL,
  `JLR` varchar(20) NOT NULL,
  PRIMARY KEY (`KQBH`)
) ENGINE=InnoDB AUTO_INCREMENT=1223 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kqb
-- ----------------------------
INSERT INTO `kqb` VALUES ('1000', '2017-05-03', '早退', 'tom', '上午下班', '123', '臧阳');
INSERT INTO `kqb` VALUES ('1040', '2017-06-02', '早退', 'tom', '上午下班', '123', '臧阳');
INSERT INTO `kqb` VALUES ('1060', '2017-06-02', '漏签卡', '臧阳', '上午下班', '123', '臧阳');
INSERT INTO `kqb` VALUES ('1065', '2017-06-15', '早操未到', '臧阳', '上午上班', '123', '臧阳');
INSERT INTO `kqb` VALUES ('1081', '2017-06-07', '早退', '臧阳', '上午下班', '123', '臧阳');
INSERT INTO `kqb` VALUES ('1082', '2017-06-30', '早退', 'tom', '下午下班', '123', '臧阳');
INSERT INTO `kqb` VALUES ('1083', '2017-06-07', '迟到', '包悦', '下午上班', '123', '臧阳');
INSERT INTO `kqb` VALUES ('1100', '2017-06-01', '迟到', '苏波', '上午上班', '迟到', '臧阳');
INSERT INTO `kqb` VALUES ('1149', '2017-06-20', '早会迟到', '包悦', '上午上班', '123', '臧阳');
INSERT INTO `kqb` VALUES ('1150', '2017-06-20', '会议缺席', '包悦', '上午上班', '123', '臧阳');
INSERT INTO `kqb` VALUES ('1152', '2017-06-20', '早操未到', '张翔', '上午上班', '123', '臧阳');
INSERT INTO `kqb` VALUES ('1183', '2017-06-21', '早退', '徐夏俊', '下午下班', '不明理由早退', '张翔');
INSERT INTO `kqb` VALUES ('1221', '2017-06-22', '迟到', '包悦', '上午上班', '123', '臧阳');
INSERT INTO `kqb` VALUES ('1222', '2017-06-22', '迟到', '包悦', '上午上班', '123', '臧阳');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `info` varchar(255) DEFAULT NULL,
  `priority` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '<div id=\"selenium-highlight\">\r\n</div>\r\n<strong>aaaa</strong>', '1');
INSERT INTO `message` VALUES ('3', '<div id=\"selenium-highlight\">\r\n</div>\r\n<div align=\"center\">\r\n	<h1>\r\n		通知\r\n	</h1>\r\n	<div>\r\n		<br />\r\n		<div align=\"left\">\r\n			本周日下午四点在5号楼511办公室进行全体教职工会议，请勿缺席！\r\n		</div>\r\n	</div>\r\n</div>', '2');
INSERT INTO `message` VALUES ('4', '<div id=\"selenium-highlight\">\r\n</div>\r\n<br />\r\n<p>\r\n	你好：<br />\r\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; 请各位老师下午4点来办公室开会。\r\n</p>', '3');
INSERT INTO `message` VALUES ('5', '<div id=\"selenium-highlight\">\r\n</div>\r\n<br />\r\n<p>\r\n	通知\r\n</p>\r\n<p>\r\n	&nbsp;&nbsp;&nbsp;&nbsp;<br />\r\n&nbsp;&nbsp;&nbsp;&nbsp; 哈哈哈\r\n</p>', '3');
INSERT INTO `message` VALUES ('6', '<div id=\"selenium-highlight\">\r\n</div>\r\ndddd', '3');
INSERT INTO `message` VALUES ('7', '<div id=\"selenium-highlight\">\r\n</div>\r\nrrrrr', '4');
INSERT INTO `message` VALUES ('8', '<div id=\"selenium-highlight\">\r\n</div>\r\ndadadad', '5');
INSERT INTO `message` VALUES ('9', '<div id=\"selenium-highlight\">\r\n</div>\r\n<br />\r\n<div align=\"center\">\r\n	<h1>\r\n		通<strong></strong>知\r\n	</h1>\r\n	<div>\r\n		<br />\r\n<br />\r\n请各位老师下午4点在5号教学楼511办公室召开教师大会，请勿缺席！\r\n	</div>\r\n</div>', '6');

-- ----------------------------
-- Table structure for sjzd
-- ----------------------------
DROP TABLE IF EXISTS `sjzd`;
CREATE TABLE `sjzd` (
  `SNO` bigint(20) NOT NULL AUTO_INCREMENT,
  `LX` varchar(20) NOT NULL,
  `SM` varchar(20) NOT NULL,
  PRIMARY KEY (`SNO`)
) ENGINE=InnoDB AUTO_INCREMENT=1242 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sjzd
-- ----------------------------
INSERT INTO `sjzd` VALUES ('2', '考勤时段', '上午下班');
INSERT INTO `sjzd` VALUES ('3', '考勤时段', '下午上班');
INSERT INTO `sjzd` VALUES ('4', '考勤时段', '下午下班');
INSERT INTO `sjzd` VALUES ('6', '假期类别', '事假');
INSERT INTO `sjzd` VALUES ('7', '假期类别', '产假');
INSERT INTO `sjzd` VALUES ('9', '出行方式', '飞机');
INSERT INTO `sjzd` VALUES ('10', '出行方式', '火车');
INSERT INTO `sjzd` VALUES ('11', '出行方式', '自驾');
INSERT INTO `sjzd` VALUES ('12', '部门', '董事会');
INSERT INTO `sjzd` VALUES ('13', '部门', '后勤部');
INSERT INTO `sjzd` VALUES ('14', '部门', '人事部');
INSERT INTO `sjzd` VALUES ('15', '部门', '市场部');
INSERT INTO `sjzd` VALUES ('16', '权限', '管理员');
INSERT INTO `sjzd` VALUES ('17', '权限', '员工');
INSERT INTO `sjzd` VALUES ('1201', '假期类别', '带薪休假');
INSERT INTO `sjzd` VALUES ('1220', '假期类别', '病假');
INSERT INTO `sjzd` VALUES ('1225', '出行方式', '动车');
INSERT INTO `sjzd` VALUES ('1226', '部门', '技术部');
INSERT INTO `sjzd` VALUES ('1228', '考勤时段', '上午上班');
INSERT INTO `sjzd` VALUES ('1241', '出行方式', '高铁');

-- ----------------------------
-- Table structure for tiaoxiu
-- ----------------------------
DROP TABLE IF EXISTS `tiaoxiu`;
CREATE TABLE `tiaoxiu` (
  `TNO` bigint(20) NOT NULL AUTO_INCREMENT,
  `SQRQ` varchar(20) NOT NULL,
  `WXSC` varchar(20) NOT NULL,
  `TXSC` varchar(20) NOT NULL,
  `TXYY` varchar(20) NOT NULL,
  `ZT` varchar(20) NOT NULL,
  `SPR` varchar(20) DEFAULT NULL,
  `SQR` varchar(20) NOT NULL,
  `KSSJ` varchar(20) DEFAULT NULL,
  `JSSJ` varchar(20) NOT NULL,
  PRIMARY KEY (`TNO`)
) ENGINE=InnoDB AUTO_INCREMENT=1163 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tiaoxiu
-- ----------------------------
INSERT INTO `tiaoxiu` VALUES ('1063', '2017-06-01 13:54:53', '7.0', '2', '123', '同意', '臧阳', '臧阳', '2017-06-02', '2017-06-03');
INSERT INTO `tiaoxiu` VALUES ('1064', '2017-06-01 13:56:02', '5.0', '2', '123', '同意', '臧阳', '臧阳', '2017-06-08', '2017-06-15');
INSERT INTO `tiaoxiu` VALUES ('1089', '2017-06-01 21:13:23', '13.0', '2', '123', '同意', '臧阳', '臧阳', '2017-06-07', '2017-06-09');
INSERT INTO `tiaoxiu` VALUES ('1090', '2017-06-01 21:15:09', '11.0', '2', '家里有事', '同意', '臧阳', '臧阳', '2017-06-07', '2017-06-10');
INSERT INTO `tiaoxiu` VALUES ('1159', '2017-06-20 18:48:13', '3.0', '1', '累', '同意', '臧阳', '包悦', '2017-06-20', '2017-06-21');
INSERT INTO `tiaoxiu` VALUES ('1162', '2017-06-20 19:41:06', '1.0', '0.5', '家里有事', '不同意', '臧阳', '冯智华', '2017-06-20', '2017-06-21');
