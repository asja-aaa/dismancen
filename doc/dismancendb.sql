/*
 Navicat Premium Data Transfer

 Source Server         : asja
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : dismancendb

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 16/05/2021 16:31:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for basic_earthquake
-- ----------------------------
DROP TABLE IF EXISTS `basic_earthquake`;
CREATE TABLE `basic_earthquake`  (
  `info_id` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `city` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `country` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `town` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `village` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `date` datetime(0) NOT NULL,
  `location` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `longitude` float(4, 0) NOT NULL,
  `latitude` float(4, 0) NOT NULL,
  `depth` int(11) NOT NULL,
  `magnitude` float(4, 0) NOT NULL,
  `reporting_unit` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `picture` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`info_id`) USING BTREE,
  UNIQUE INDEX `ba_index`(`date`, `longitude`, `latitude`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 100132 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of basic_earthquake
-- ----------------------------
INSERT INTO `basic_earthquake` VALUES (100037, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '基本震情', '2021-04-21 10:16:57', '北京东城区', 117, 40, 10, 2, '北京地震局', 'bj1.jpg');
INSERT INTO `basic_earthquake` VALUES (100038, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '基本震情', '2021-04-21 11:17:50', '北京东城区', 117, 40, 12, 5, '北京地震局', 'bj2.jpg');
INSERT INTO `basic_earthquake` VALUES (100039, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '基本震情', '2021-04-21 11:19:52', '北京东城区', 117, 40, 15, 7, '北京地震局', 'bj3.jpg');
INSERT INTO `basic_earthquake` VALUES (100040, '山西省', '长治市', '城区', '西街街道办事处', '参府社区居委会', '基本震情', '2021-04-21 21:16:00', '山西省长治市城区', 113, 35, 15, 2, '山西地震局', 'sx1.jpg');
INSERT INTO `basic_earthquake` VALUES (100041, '山西省', '长治市', '城区', '西街街道办事处', '参府社区居委会', '基本震情', '2021-04-22 19:17:00', '山西省长治市城区', 113, 35, 15, 3, '山西地震局', 'sx2.jpg');
INSERT INTO `basic_earthquake` VALUES (100097, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '基本震情', '2021-04-21 10:15:57', '北京东城区', 117, 40, 15, 7, '北京地震局', 'bj4.jpg');
INSERT INTO `basic_earthquake` VALUES (100098, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '基本震情', '2021-04-21 12:15:53', '北京东城区', 117, 40, 13, 6, '北京地震局', 'bj5.jpg');
INSERT INTO `basic_earthquake` VALUES (100099, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '基本震情', '2021-04-21 13:11:22', '北京东城区', 117, 40, 25, 8, '北京地震局', 'bj6.jpg');
INSERT INTO `basic_earthquake` VALUES (100100, '山西省', '长治市', '城区', '西街街道办事处', '参府社区居委会', '基本震情', '2021-04-21 22:16:40', '山西省长治市城区', 113, 35, 10, 5, '山西地震局', 'sx4.jpg');
INSERT INTO `basic_earthquake` VALUES (100101, '山西省', '长治市', '城区', '西街街道办事处', '参府社区居委会', '基本震情', '2021-04-22 19:17:27', '山西省长治市城区', 113, 35, 17, 8, '山西地震局', 'sx3.jpg');

-- ----------------------------
-- Table structure for forecast
-- ----------------------------
DROP TABLE IF EXISTS `forecast`;
CREATE TABLE `forecast`  (
  `info_id` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime(0) NOT NULL,
  `grade` smallint(2) NOT NULL,
  `intensity` smallint(2) NOT NULL,
  `type` smallint(2) NOT NULL,
  `picture` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`info_id`) USING BTREE,
  UNIQUE INDEX `fore_index`(`date`, `grade`, `intensity`, `type`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 100012 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of forecast
-- ----------------------------
INSERT INTO `forecast` VALUES (100007, '2021-04-23 00:00:05', 2, 4, 1, '04236.png');
INSERT INTO `forecast` VALUES (100008, '2021-04-23 00:00:24', 2, 7, 1, '04237.png');
INSERT INTO `forecast` VALUES (100009, '2021-04-23 00:02:29', 6, 8, 1, '04238.png');
INSERT INTO `forecast` VALUES (100010, '2021-04-23 00:11:22', 2, 4, 1, '04239.png');
INSERT INTO `forecast` VALUES (100011, '2021-04-23 00:21:25', 6, 9, 1, '042310.png');

-- ----------------------------
-- Table structure for house_destory
-- ----------------------------
DROP TABLE IF EXISTS `house_destory`;
CREATE TABLE `house_destory`  (
  `info_id` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `city` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `country` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `town` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `village` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `date` datetime(0) NOT NULL,
  `location` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `basically_intact_square` float(4, 0) NOT NULL,
  `damaged_square` float(4, 0) NULL DEFAULT NULL,
  `destroyed_square` float(4, 0) NOT NULL,
  `note` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `reporting_unit` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `earthquake_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`info_id`) USING BTREE,
  UNIQUE INDEX `house_index`(`village`, `date`, `basically_intact_square`, `damaged_square`, `destroyed_square`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of house_destory
-- ----------------------------
INSERT INTO `house_destory` VALUES (100002, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏土木', '2021-04-23 00:00:53', '北京东城区', 12, 3, 21, '严重', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100003, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏土木', '2021-04-23 00:05:55', '北京东城区', 13, 3, 2, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100004, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏土木', '2021-04-23 00:06:50', '北京东城区', 20, 12, 1, '中等', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100005, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏土木', '2021-04-23 00:22:20', '北京东城区', 22, 20, 12, '严重', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100006, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏土木', '2021-04-23 00:22:25', '北京东城区', 22, 22, 12, '严重', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100007, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏砖木', '2021-04-23 00:01:57', '北京东城区', 17, 7, 3, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100008, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏砖木', '2021-04-23 00:22:57', '北京东城区', 24, 3, 2, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100009, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏砖木', '2021-04-23 00:12:57', '北京东城区', 10, 2, 8, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100010, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏砖木', '2021-04-23 00:33:57', '北京东城区', 12, 2, 13, '中等', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100011, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏砖木', '2021-04-23 01:02:57', '北京东城区', 12, 17, 33, '严重', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100012, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏砖混', '2021-04-23 00:00:15', '北京东城区', 17, NULL, 2, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100013, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏砖混', '2021-04-23 00:01:17', '北京东城区', 17, NULL, 5, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100014, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏砖混', '2021-04-23 00:22:17', '北京东城区', 23, NULL, 3, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100015, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏砖混', '2021-04-23 00:24:27', '北京东城区', 21, NULL, 1, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100016, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏砖混', '2021-04-23 01:04:17', '北京东城区', 13, NULL, 75, '严重', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100017, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏框架', '2021-04-23 00:27:27', '北京东城区', 17, NULL, 4, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100018, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏框架', '2021-04-23 00:30:27', '北京东城区', 17, NULL, 2, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100019, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏框架', '2021-04-23 00:25:30', '北京东城区', 12, NULL, 3, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100020, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏框架', '2021-04-23 00:33:27', '北京东城区', 33, NULL, 13, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100021, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏框架', '2021-04-23 03:31:27', '北京东城区', 53, NULL, 13, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100022, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏其他', '2021-04-23 00:02:01', '北京东城区', 23, NULL, 2, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100023, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏其他', '2021-04-23 00:01:03', '北京东城区', 27, NULL, 2, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100024, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏其他', '2021-04-23 00:13:01', '北京东城区', 22, NULL, 7, '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100025, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏其他', '2021-04-23 02:11:01', '北京东城区', 7, NULL, 77, '严重', '北京地震局', '11010100100120210423000000');
INSERT INTO `house_destory` VALUES (100026, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '房屋破坏其他', '2021-04-23 02:15:01', '北京东城区', 36, NULL, 17, '中等', '北京地震局', '11010100100120210423000000');

-- ----------------------------
-- Table structure for life_line
-- ----------------------------
DROP TABLE IF EXISTS `life_line`;
CREATE TABLE `life_line`  (
  `info_id` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `city` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `country` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `town` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `village` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `date` datetime(0) NOT NULL,
  `location` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type` smallint(2) NOT NULL,
  `grade` smallint(2) NOT NULL,
  `picture` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `note` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `reporting_unit` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `earthquake_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`info_id`) USING BTREE,
  UNIQUE INDEX `life_index`(`village`, `date`, `type`, `note`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of life_line
-- ----------------------------
INSERT INTO `life_line` VALUES (100002, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情交通', '2021-04-23 19:44:10', '北京东城区', 3, 2, '4115.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100003, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情交通', '2021-04-23 19:44:20', '北京东城区', 2, 3, '4116.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100004, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情交通', '2021-04-23 19:44:30', '北京东城区', 1, 3, '4118.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100005, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情交通', '2021-04-23 19:44:40', '北京东城区', 2, 4, '4119.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100006, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情供水', '2021-04-23 19:44:57', '北京东城区', 1, 1, '4125.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100007, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情供水', '2021-04-23 19:41:10', '北京东城区', 1, 2, '4126.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100008, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情供水', '2021-04-23 19:40:20', '北京东城区', 1, 3, '4127.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100009, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情供水', '2021-04-23 19:40:30', '北京东城区', 1, 4, '4128.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100010, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情供水', '2021-04-23 19:40:40', '北京东城区', 1, 3, '4129.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100011, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情输油', '2021-04-23 19:45:57', '北京东城区', 4, 3, '4135.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100012, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情输油', '2021-04-23 19:41:10', '北京东城区', 3, 1, '4136.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100013, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情输油', '2021-04-23 19:41:20', '北京东城区', 3, 2, '4137.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100014, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情输油', '2021-04-23 19:41:30', '北京东城区', 3, 3, '4138.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100015, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情输油', '2021-04-23 19:41:40', '北京东城区', 3, 4, '4139.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100016, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情燃气', '2021-04-23 19:46:57', '北京东城区', 3, 2, '4145.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100017, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情燃气', '2021-04-23 19:46:10', '北京东城区', 3, 1, '4146.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100018, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情燃气', '2021-04-23 19:46:20', '北京东城区', 3, 3, '4147.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100019, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情燃气', '2021-04-23 19:46:30', '北京东城区', 2, 1, '4148.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100020, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情燃气', '2021-04-23 19:46:40', '北京东城区', 2, 2, '4149.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100021, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情电力', '2021-04-23 19:48:57', '北京东城区', 1, 2, '4155.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100022, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情电力', '2021-04-23 19:48:10', '北京东城区', 1, 1, '4156.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100023, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情电力', '2021-04-23 19:48:20', '北京东城区', 2, 2, '4157.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100024, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情电力', '2021-04-23 19:48:30', '北京东城区', 2, 1, '4158.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100025, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情电力', '2021-04-23 19:48:40', '北京东城区', 1, 2, '4159.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100026, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情通信', '2021-04-23 19:49:57', '北京东城区', 2, 2, '4175.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100027, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情通信', '2021-04-23 19:43:10', '北京东城区', 1, 1, '4176.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100028, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情通信', '2021-04-23 19:43:20', '北京东城区', 1, 2, '4177.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100029, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情通信', '2021-04-23 19:43:30', '北京东城区', 2, 2, '4178.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100030, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情通信', '2021-04-23 19:43:40', '北京东城区', 2, 1, '4179.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100031, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情水利', '2021-04-23 19:34:57', '北京东城区', 3, 3, '4185.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100032, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情水利', '2021-04-23 19:46:10', '北京东城区', 1, 1, '4186.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100033, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情水利', '2021-04-23 19:46:20', '北京东城区', 1, 2, '4187.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `life_line` VALUES (100034, '北京市', '市辖区', '东城区', '东华门街道办事处', '东厂社区居委会', '生命线工程灾情水利', '2021-04-23 19:46:30', '北京东城区', 1, 3, '4188.png', '轻微', '北京地震局', '11010100100120210423000000');

-- ----------------------------
-- Table structure for peo_loss
-- ----------------------------
DROP TABLE IF EXISTS `peo_loss`;
CREATE TABLE `peo_loss`  (
  `info_id` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `city` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `country` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `town` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `village` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `date` datetime(0) NOT NULL,
  `location` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `number` int(11) NOT NULL,
  `reporting_unit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `earthquake_id` varchar(1288) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`info_id`) USING BTREE,
  UNIQUE INDEX `poeple_index`(`village`, `date`, `number`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of peo_loss
-- ----------------------------
INSERT INTO `peo_loss` VALUES (100002, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员死亡', '2021-03-23 00:57:57', '北京东城区', 1, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100003, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员死亡', '2021-03-23 00:58:57', '北京东城区', 4, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100004, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员死亡', '2021-03-23 01:58:57', '北京东城区', 2, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100005, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员死亡', '2021-03-23 01:59:57', '北京东城区', 3, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100006, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员死亡', '2021-03-23 02:59:57', '北京东城区', 10, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100007, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员受伤', '2021-03-23 00:00:57', '北京东城区', 100, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100008, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员受伤', '2021-03-23 00:20:20', '北京东城区', 42, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100009, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员受伤', '2021-03-23 01:00:57', '北京东城区', 24, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100010, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员受伤', '2021-03-23 01:09:00', '北京东城区', 13, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100011, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员受伤', '2021-03-23 02:00:00', '北京东城区', 10, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100012, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员失踪', '2021-03-23 00:00:07', '北京东城区', 70, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100013, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员失踪', '2021-03-23 00:20:00', '北京东城区', 62, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100014, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员失踪', '2021-03-23 01:00:00', '北京东城区', 36, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100015, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员失踪', '2021-03-23 01:09:07', '北京东城区', 15, '北京地震局', '11010100100120210423000000');
INSERT INTO `peo_loss` VALUES (100016, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区居委会', '人员失踪', '2021-03-23 02:07:00', '北京东城区', 5, '北京地震局', '11010100100120210423000000');

-- ----------------------------
-- Table structure for sec_disaster
-- ----------------------------
DROP TABLE IF EXISTS `sec_disaster`;
CREATE TABLE `sec_disaster`  (
  `info_id` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `city` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `country` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `town` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `village` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `date` datetime(0) NOT NULL,
  `location` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `status` smallint(2) NOT NULL,
  `type` smallint(2) NOT NULL,
  `picture` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `note` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `reporting_unit` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `earthquake_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`info_id`) USING BTREE,
  UNIQUE INDEX `sec_index`(`village`, `date`, `type`, `note`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sec_disaster
-- ----------------------------
INSERT INTO `sec_disaster` VALUES (100002, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害崩塌', '2021-04-23 20:22:00', '北京东城区', 3, 2, '41611.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100003, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害崩塌', '2021-04-23 20:20:00', '北京东城区', 4, 3, '41631.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100004, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害崩塌', '2021-04-23 20:21:32', '北京东城区', 4, 4, '41632.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100005, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害崩塌', '2021-04-23 20:23:22', '北京东城区', 3, 3, '41633.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100006, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害崩塌', '2021-04-23 20:25:40', '北京东城区', 2, 4, '41634.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100007, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害滑坡', '2021-04-23 20:26:00', '北京东城区', 3, 2, '41612.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100008, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害滑坡', '2021-04-23 20:32:00', '北京东城区', 2, 2, '41681.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100009, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害滑坡', '2021-04-23 20:28:00', '北京东城区', 2, 2, '41682.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100010, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害滑坡', '2021-04-23 20:29:00', '北京东城区', 4, 2, '41683.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100011, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害滑坡', '2021-04-23 20:30:00', '北京东城区', 3, 4, '41684.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100012, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害泥石流', '2021-04-23 20:33:00', '北京东城区', 3, 4, '41613.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100013, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害泥石流', '2021-04-23 20:27:30', '北京东城区', 4, 4, '41671.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100014, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害泥石流', '2021-04-23 20:27:40', '北京东城区', 3, 3, '41672.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100015, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害泥石流', '2021-04-23 20:27:50', '北京东城区', 4, 3, '41673.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100016, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害泥石流', '2021-04-23 20:28:30', '北京东城区', 2, 2, '41674.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100017, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害岩溶塌陷', '2021-04-23 20:22:00', '北京东城区', 3, 3, '41614.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100018, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害岩溶塌陷', '2021-04-23 20:38:10', '北京东城区', 2, 2, '41661.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100019, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害岩溶塌陷', '2021-04-23 20:38:20', '北京东城区', 3, 2, '41662.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100020, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害岩溶塌陷', '2021-04-23 20:38:30', '北京东城区', 4, 2, '41663.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100021, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害岩溶塌陷', '2021-04-23 20:39:40', '北京东城区', 4, 3, '41664.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100022, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害地裂缝', '2021-04-23 20:22:00', '北京东城区', 3, 1, '41615.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100023, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害地裂缝', '2021-04-23 20:25:10', '北京东城区', 3, 2, '41651.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100024, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害地裂缝', '2021-04-23 20:25:20', '北京东城区', 3, 3, '41652.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100025, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害地裂缝', '2021-04-23 20:25:30', '北京东城区', 3, 4, '41653.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100026, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害地面沉降', '2021-04-23 20:20:10', '北京东城区', 3, 3, '41641.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100027, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害地面沉降', '2021-04-23 20:20:20', '北京东城区', 3, 4, '41642.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100028, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害地面沉降', '2021-04-23 20:20:30', '北京东城区', 4, 3, '41643.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100029, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害地面沉降', '2021-04-23 20:20:40', '北京东城区', 4, 4, '41644.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100030, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害其他', '2021-04-23 20:19:10', '北京东城区', 4, 3, '41691.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100031, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害其他', '2021-04-23 20:19:20', '北京东城区', 3, 4, '41692.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100032, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害其他', '2021-04-23 20:19:30', '北京东城区', 3, 2, '41693.png', '轻微', '北京地震局', '11010100100120210423000000');
INSERT INTO `sec_disaster` VALUES (100033, '北京市', '市辖区', '东城区', '东华门街道', '多福巷社区委员会', '次生灾害其他', '2021-04-23 20:19:40', '北京东城区', 2, 2, '41694.png', '轻微', '北京地震局', '11010100100120210423000000');

SET FOREIGN_KEY_CHECKS = 1;
