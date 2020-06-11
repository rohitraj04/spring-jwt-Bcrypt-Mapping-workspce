-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: spring_security_db
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user_jwt`
--

DROP TABLE IF EXISTS `user_jwt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_jwt` (
  `id` bigint NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_jwt`
--

LOCK TABLES `user_jwt` WRITE;
/*!40000 ALTER TABLE `user_jwt` DISABLE KEYS */;
INSERT INTO `user_jwt` VALUES (1,'raj@webx.com','123456','Rohit Raj'),(2,'sonali@webx.com','$2a$10$zrACGi0PMcIgfkXHUn81D.ruDXmypfhzAfM9Ip4YCkVgNv4fE59Ze','Sonali'),(21,'sonalig@gmail.com','$2a$10$V9rQszLXWyvaDwQtqCSkmui.jiA2ZDwYaMx0byfG6PqgAIIsHhm86','Ram'),(11102,'javaM@gmail.com','password','JwtM'),(11103,'javaM@gmail.com','pass1','user1'),(11104,'javaM@gmail.com','$2a$10$wzxww9br.vbFNeS/ZlLihuRYtfO4xedDo8JVxcIiFzUSD.b78fYiq','user3'),(11105,'javaM@gmail.com','$2a$10$DE8IfmoQrQmP6v/Zu01gbuvRe6Chz.xbJhZj68VGqBENjI8MLU0WK','user2'),(11106,'javaM@gmail.com','$2a$10$wzxww9br.vbFNeS/ZlLihuRYtfO4xedDo8JVxcIiFzUSD.b78fYiq','user3'),(11107,'javaM@gmail.com','$2a$10$DE8IfmoQrQmP6v/Zu01gbuvRe6Chz.xbJhZj68VGqBENjI8MLU0WK','user7'),(11108,'javaM@gmail.com','$2a$10$wzxww9br.vbFNeS/ZlLihuRYtfO4xedDo8JVxcIiFzUSD.b78fYiq','user8'),(1109809,'sonali@gmail.com','sg1','Sonali'),(1109909,'sonalig@gmail.com','$2a$10$c6ooIyb7hJ4hMquiRXNt6ODqmqgBfUE0M4jxdahx.wL4qRulAKnN2','Sonali Gupta'),(1111908,'raj@rohit.com','$2a$10$kL88rU6MFlBWgWjX9k5O6esCZfh7NnTbsGovOXQye5nTVVShmRXVO','Raj');
/*!40000 ALTER TABLE `user_jwt` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-12  0:10:37
