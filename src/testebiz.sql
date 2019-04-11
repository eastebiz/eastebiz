/*
 Navicat Premium Data Transfer

 Source Server         : testebiz
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : testebiz

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 30/03/2019 10:16:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `AdminName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `CreateTime` datetime NULL DEFAULT NULL,
  `UpdateTime` datetime NULL DEFAULT NULL,
  `Password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'zhengbo', '2019-03-29 14:12:26', '2019-03-29 14:12:29', '123456');

-- ----------------------------
-- Table structure for ebizcompany
-- ----------------------------
DROP TABLE IF EXISTS `ebizcompany`;
CREATE TABLE `ebizcompany`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `CompanyName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `OwerName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Email` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Status` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Permision` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Balance` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Mote` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `UNote` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `PayTimeInfor` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Address` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Address1Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Address1Value` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Address2Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Address2Value` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Address3Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Address3Value` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `PhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `UserManual` varchar(10000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `CreateTime` datetime NULL DEFAULT NULL,
  `UpdateTime` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `CompanyName`(`CompanyName`) USING BTREE,
  UNIQUE INDEX `OwerName`(`OwerName`) USING BTREE,
  UNIQUE INDEX `Email`(`Email`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ebizcompany
-- ----------------------------
INSERT INTO `ebizcompany` VALUES (1, 'yinxiang', 'yinxiang', '999666', 'yinxiang', '66', '89', '33', '44', '55', '5', '湖北', '湖北', '武汉', '湖北', '黄冈', '湖北', '蕲春', '88888', '89524', '2019-03-06 00:00:00', '2019-03-28 17:37:19');
INSERT INTO `ebizcompany` VALUES (2, 'yin', 'yin', '999666', '5658', NULL, '2656', NULL, NULL, NULL, NULL, '1891', '184', '129', '', '', '', '', '26118', NULL, '2019-03-23 14:29:18', '2019-03-29 12:04:12');
INSERT INTO `ebizcompany` VALUES (3, '谷峰', '郑博', '123456', '976103733@163.com', NULL, '666', NULL, NULL, NULL, NULL, '南京', '1', 'a', '2', 'b', '3', 'c', '17536029607', '1111', '2019-03-29 11:06:29', '2019-03-29 11:18:10');

-- ----------------------------
-- Table structure for ebizrelationoperations
-- ----------------------------
DROP TABLE IF EXISTS `ebizrelationoperations`;
CREATE TABLE `ebizrelationoperations`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `CompanyName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `UserName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `addStatus` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ebizrelationoperations
-- ----------------------------
INSERT INTO `ebizrelationoperations` VALUES (12, 'yin', 'yinxiang', 'delete');
INSERT INTO `ebizrelationoperations` VALUES (13, 'yin', '殷翔', 'delete');
INSERT INTO `ebizrelationoperations` VALUES (14, 'yinxiang', '殷翔', 'delete');
INSERT INTO `ebizrelationoperations` VALUES (15, 'yinxiang', 'yinxiang', 'delete');
INSERT INTO `ebizrelationoperations` VALUES (16, '谷峰', 'yinxiang', 'delete');
INSERT INTO `ebizrelationoperations` VALUES (17, '谷峰', 'zb', 'delete');

-- ----------------------------
-- Table structure for ebizstatus
-- ----------------------------
DROP TABLE IF EXISTS `ebizstatus`;
CREATE TABLE `ebizstatus`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `CompanyId` int(8) NOT NULL COMMENT '公司ID',
  `UserId` int(8) NOT NULL COMMENT '用户ID',
  `Status` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '0，未激活；1激活',
  `StarLevel` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '星级',
  `UserPersonalLimit` int(8) NULL DEFAULT NULL COMMENT '限制护士上货的数量',
  `UserMnote` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '医生对护士的评价',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ebizstatus
-- ----------------------------
INSERT INTO `ebizstatus` VALUES (14, 2, 2, 'Active', NULL, NULL, NULL);
INSERT INTO `ebizstatus` VALUES (15, 2, 1, 'Active', NULL, NULL, NULL);
INSERT INTO `ebizstatus` VALUES (16, 1, 2, 'Active', '二星', NULL, '');
INSERT INTO `ebizstatus` VALUES (17, 1, 1, 'AddUnActive', '四星', NULL, '');
INSERT INTO `ebizstatus` VALUES (18, 3, 1, 'Active', NULL, NULL, NULL);
INSERT INTO `ebizstatus` VALUES (19, 3, 3, 'Active', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for ebizuser
-- ----------------------------
DROP TABLE IF EXISTS `ebizuser`;
CREATE TABLE `ebizuser`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `FirstName` varchar(400) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `LastName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Email` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `PhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CreateTime` datetime NOT NULL,
  `UpdateTime` datetime NULL DEFAULT NULL,
  `Mnote` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户状态  已激活或未激活   active  unactive',
  `UserType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医生or 护士   doctor   user',
  `Permissions` varchar(5000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Balance` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Introducer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ebizuser
-- ----------------------------
INSERT INTO `ebizuser` VALUES (1, 'yinxiang', 'yin', 'xiang', '666666', '4242', '25424', '242', '2019-03-05 00:00:00', '2019-03-29 11:14:20', '155', '1', '1', '1', '1', '242');
INSERT INTO `ebizuser` VALUES (2, '殷翔', 'yin', 'xiang', '888888', '56', '561', '165', '2019-03-23 14:33:52', '2019-03-27 16:04:44', NULL, NULL, NULL, NULL, NULL, '1541');
INSERT INTO `ebizuser` VALUES (3, 'zb', 'z', 'b', '123', '976103733@qq.com', '189612760629', '南京', '2019-03-29 11:16:24', '2019-03-29 11:17:05', NULL, NULL, NULL, NULL, NULL, 'rxx');

-- ----------------------------
-- Table structure for packagelist
-- ----------------------------
DROP TABLE IF EXISTS `packagelist`;
CREATE TABLE `packagelist`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `CreateTime` datetime NULL DEFAULT NULL,
  `UpdateTime` datetime NULL DEFAULT NULL,
  `CompanyName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `TrackingNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `StoreName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `UserName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ShippingAddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Email` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `PhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Receiver` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Recipient` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Mnote` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Unote` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `PackageQuantity` int(8) NOT NULL,
  `HomeBasePrice` double(10, 2) NOT NULL,
  `HomePromotQuantity` int(8) NOT NULL,
  `HomePromotPrice` double(10, 2) NOT NULL,
  `WareHouseBasePrice` double(10, 2) NOT NULL,
  `WareHousePromotQuantity` int(11) NOT NULL,
  `WareHousePromotPrice` double(10, 2) NOT NULL,
  `CreditCardNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Status` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `CheckStatus` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Checker` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `LabelStatus` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Labeler` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `PayStatus` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Payer` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ProductId` int(8) NOT NULL,
  `UserId` int(8) NOT NULL,
  `CompanyId` int(8) NOT NULL,
  `AddressStatus` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `SubmitPrice` double(10, 2) NULL DEFAULT NULL,
  `Model` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ProductName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `Brand` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of packagelist
-- ----------------------------
INSERT INTO `packagelist` VALUES (1, '2019-02-12 11:28:59', '2019-03-20 11:29:04', 'gf', '1111', NULL, '殷翔', 'aaaa', NULL, '222', 'ee', 'eee', NULL, NULL, 5, 100.00, 6, 200.00, 111.00, 111, 11111.00, NULL, 'UnMatch  Model', 'no', NULL, 'no', NULL, 'no', NULL, 1, 2, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `packagelist` VALUES (2, '2019-02-12 11:28:59', '2019-03-20 11:29:04', 'gf', '1111', NULL, '殷翔', 'aaaa', NULL, '222', 'ee', 'eee', NULL, NULL, 5, 0.00, 6, 0.00, 0.00, 111, 0.00, '', 'UnComfirmShipped', 'no', NULL, 'no', NULL, 'Paying', NULL, 1, 3, 1, NULL, 0.00, '', '', '');
INSERT INTO `packagelist` VALUES (3, '2019-02-12 11:28:59', '2019-03-25 16:24:52', 'xiugai', '123456', '', '殷翔', '南京', '976103733@qq.com', '8432375', '收件人', '签收人', 'mnote', 'unote', 5, 100.00, 5, 110.00, 200.00, 5, 210.00, '信用卡和', 'UnShipped', '', NULL, '未发label', NULL, '未付款', NULL, 1, 2, 2, 'home', 133.00, 'model', 'dell', '品牌');
INSERT INTO `packagelist` VALUES (4, '2019-02-12 11:28:59', '2019-03-25 16:24:52', 'xiugai', '123456', '', '殷翔', '南京', '976103733@qq.com', '8432375', '收件人', '签收人', 'mnote', 'unote', 5, 100.00, 5, 110.00, 200.00, 5, 210.00, '信用卡和', 'Shipped', '', NULL, '未发label', NULL, '未付款', NULL, 1, 2, 2, 'home', 133.00, 'model', 'dell', '品牌');
INSERT INTO `packagelist` VALUES (5, '2019-02-12 11:28:59', '2019-03-25 16:24:52', 'xiugai', '123456', '', '殷翔', '南京', '976103733@qq.com', '8432375', '收件人', '签收人', 'mnote', 'unote', 5, 100.00, 5, 110.00, 200.00, 5, 210.00, '信用卡和', 'InStock', 'Checking', 'yin', '未发label', NULL, '未付款', NULL, 1, 2, 2, 'home', 133.00, 'model', 'dell', '品牌');
INSERT INTO `packagelist` VALUES (6, '2019-02-12 11:28:59', '2019-03-25 16:24:52', 'xiugai', '123456', '', '殷翔', '南京', '976103733@qq.com', '8432375', '收件人', '签收人', 'mnote', 'unote', 5, 100.00, 5, 110.00, 200.00, 5, 210.00, '信用卡和', 'UnPaied', 'Checking', 'yin', '未发label', NULL, '未付款', NULL, 1, 2, 2, 'home', 133.00, 'model', 'dell', '品牌');
INSERT INTO `packagelist` VALUES (7, '2019-02-12 11:28:59', '2019-03-25 16:24:52', 'xiugai', '123456', '', '殷翔', '南京', '976103733@qq.com', '8432375', '收件人', '签收人', 'mnote', 'unote', 5, 100.00, 5, 110.00, 200.00, 5, 210.00, '信用卡和', 'UnComfirmUnShipped', 'Checking', 'yin', '未发label', NULL, '未付款', NULL, 1, 2, 2, 'home', 133.00, 'model', 'dell', '品牌');
INSERT INTO `packagelist` VALUES (8, '2019-02-12 11:28:59', '2019-03-25 16:24:52', 'xiugai', '123456', '', '殷翔', '南京', '976103733@qq.com', '8432375', '收件人', '签收人', 'mnote', 'unote', 5, 100.00, 5, 110.00, 200.00, 5, 210.00, '信用卡和', 'UnMatch Model', 'Checked', 'yin', '未发label', NULL, '未付款', NULL, 1, 2, 2, 'home', 133.00, 'model', 'dell', '品牌');
INSERT INTO `packagelist` VALUES (9, '2019-02-12 11:28:59', '2019-03-25 16:24:52', 'xiugai', '123456', '', '殷翔', '南京', '976103733@qq.com', '8432375', '收件人', '签收人', 'mnote', 'unote', 5, 100.00, 5, 110.00, 200.00, 5, 210.00, '信用卡和', 'UnMatch Number', 'Checked', 'yin', '未发label', NULL, '未付款', NULL, 1, 2, 2, 'home', 133.00, 'model', 'dell', '品牌');
INSERT INTO `packagelist` VALUES (10, '2019-03-20 17:34:10', '2019-03-20 17:34:10', 'baizhi', '123456', '', '殷翔', '南京', '976103733@qq.com', '8432375', '收件人', '签收人', 'mnote', 'unote', 5, 0.00, 5, 0.00, 0.00, 5, 0.00, '信用卡和', 'UnMatch Number', 'Checked', 'yin', 'SendingLabel', 'bb', 'Paied', NULL, 2, 1, 2, 'home', 133.00, 'model', 'dell', '品牌');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `CompanyName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Model` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品型号(唯一)',
  `ProductName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Condition` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新旧程度(全新或者二手)',
  `UPC` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ASIN` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SKU` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Brand` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌(戴尔,联想等)',
  `Weight` double(10, 2) NULL DEFAULT NULL,
  `Length` double(10, 2) NULL DEFAULT NULL,
  `Width` double(10, 2) NULL DEFAULT NULL,
  `Height` double(10, 2) NULL DEFAULT NULL,
  `HomeBasePrice` double(10, 2) NULL DEFAULT NULL COMMENT '下货到护士家里的基础价格',
  `HomePromotQuantity` int(8) NULL DEFAULT NULL COMMENT '下货到护士家里的促销数量',
  `HomePromotPrice` double(10, 2) NULL DEFAULT NULL COMMENT '下货到护士家里的促销价格',
  `WareHouseBasePrice` double(10, 2) NULL DEFAULT NULL COMMENT '下货到仓库的基础价格',
  `WareHousePromotQuantity` int(8) NULL DEFAULT NULL COMMENT '下货到仓库的促销数量	',
  `WareHousePromotPrice` double(10, 2) NULL DEFAULT NULL COMMENT '下货到仓库的促销价格	',
  `Status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品状态,(Active,Unactive,LiveDeal)',
  `Tickets` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '该产品的总放票数',
  `LimitPerPerson` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '每个护士领票限制,与ebizuser中PersonalLimit比较,以后者为准',
  `URI` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Mnote` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司(医生)对产品的备注',
  `CreatedTime` datetime NULL DEFAULT NULL,
  `UpdateTime` datetime NULL DEFAULT NULL,
  `EbizcompanyId` int(8) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, '2', '2', '88888', '6', '5', '6', '99999999', '99999', 9.00, 10.00, 11.00, 12.00, 20.00, 14, 15.00, 16.00, 17, 18.00, '0', '20', '21', 'aaaaa', '23', NULL, '2019-03-19 19:24:48', 1);
INSERT INTO `product` VALUES (2, '1', '2', '3', '4', '5', '6', '7', '8', 9.00, 10.00, 11.00, 12.00, 13.00, 14, 15.00, 16.00, 17, 18.00, 'Active', '20', '21', '22', '23', NULL, NULL, 1);
INSERT INTO `product` VALUES (3, '1', '2', '3', '4', '5', '6', '7', '8', 9.00, 10.00, 11.00, 12.00, 13.00, 14, 15.00, 16.00, 17, 18.00, 'Active', '20', '21', '22', '23', NULL, NULL, 1);
INSERT INTO `product` VALUES (4, '1', '2', '3', '4', '5', '6', '7', '8', 9.00, 10.00, 11.00, 12.00, 13.00, 14, 15.00, 16.00, 17, 18.00, 'Deleted', '20', '21', '22', '23', '2019-03-07 18:23:56', '2019-03-26 19:04:08', 1);
INSERT INTO `product` VALUES (5, '1', '2', '3', '4', '5', '6', '7', '8', 9.00, 10.00, 11.00, 12.00, 13.00, 14, 15.00, 16.00, 17, 18.00, '19', '20', '21', '22', '23', '2019-03-08 11:02:14', NULL, 2);
INSERT INTO `product` VALUES (6, '1', '2', '3', '4', '5', '6', '7', '8', 9.00, 10.00, 11.00, 12.00, 13.00, 14, 15.00, 16.00, 17, 18.00, 'Active', '20', '21', '22', '23', '2019-03-08 11:02:27', NULL, 3);
INSERT INTO `product` VALUES (7, '1', '2', '3', '4', '5', '6', '7', '8', 9.00, 10.00, 11.00, 12.00, 13.00, 14, 15.00, 16.00, 17, 18.00, '19', '2', '21', '22', '23', '2019-03-08 11:02:38', NULL, 3);
INSERT INTO `product` VALUES (8, '1', '2', '笔记本', '4', '5', '6', '7', '8', 9.00, 10.00, 11.00, 12.00, 13.00, 14, 15.00, 16.00, 17, 18.00, '19', '20', '21', '22', '23', '2019-03-08 12:01:23', NULL, 3);
INSERT INTO `product` VALUES (9, 'yinxiang', '889', 'dada', NULL, '24242', '242', '242424', '242', 1.20, 2.20, 3.30, 1.10, 2.00, 5, 6.00, 56.20, 5, 63.00, 'Active', 'hjghj', 'kkh', 'gfdgdg', '242', '2019-03-19 18:35:33', NULL, 1);
INSERT INTO `product` VALUES (10, 'yinxiang', '354', '242', NULL, '242', '24', '242', '2424', 0.20, 0.30, 0.50, 0.50, 0.30, 3, 0.10, 0.20, 2, 0.20, 'Active', '24', '24', '242424242', '.45', '2019-03-19 19:30:48', '2019-03-26 19:05:55', 1);
INSERT INTO `product` VALUES (11, 'yinxiang', '23423', '2727', NULL, '242', '27527', '242', '242', 2.00, 4.00, 5.00, 5.00, 5.00, 1, 7.00, 8.00, 8, 9.00, 'LiveDeal', '28', '8', '2427', '5', '2019-03-20 13:52:28', '2019-03-26 19:04:22', 1);
INSERT INTO `product` VALUES (12, 'yin', '2424', '34', NULL, '434', '31', '33', '343', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Active', '100', '20', '', '', '2019-03-27 16:19:01', '2019-03-28 19:07:15', 2);
INSERT INTO `product` VALUES (13, '谷峰', 'abc', 'dell', NULL, '', '', '', 'dell', NULL, NULL, NULL, NULL, 100.00, 5, 110.00, 100.00, 4, 110.00, 'Active', '200', '10', 'http://www.blueoceanglobe.com/customer/#/register_seller', 'delldi', '2019-03-29 11:10:26', NULL, 3);

SET FOREIGN_KEY_CHECKS = 1;
