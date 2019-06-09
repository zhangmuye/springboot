/*
Navicat MySQL Data Transfer

Source Server         : sql_2
Source Server Version : 50718
Source Host           : cdb-1eywnq2o.bj.tencentcdb.com:10066
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2019-06-08 22:29:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_goods
-- ----------------------------
DROP TABLE IF EXISTS `tb_goods`;
CREATE TABLE `tb_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `no` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_goods
-- ----------------------------
INSERT INTO `tb_goods` VALUES ('2', 'xp_01', '格力XT01', '中国新加坡', '空调');
INSERT INTO `tb_goods` VALUES ('3', 'xp_02', '海尔G180', '中国青岛', '洗衣机');
INSERT INTO `tb_goods` VALUES ('4', 'xp_03', '三星UAM', '中国北京', '电商');
INSERT INTO `tb_goods` VALUES ('5', 'xp_04', '美的23RT', '中国广州', '热水器');
INSERT INTO `tb_goods` VALUES ('6', 'xp_05', '联想T80', '中国北京', '电脑');
