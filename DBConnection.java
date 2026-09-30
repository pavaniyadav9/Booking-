package com.hallbooking.util; import java.sql.*;
public class DBConnection { private static final String URL="jdbc:mysql://localhost:3306/hallbooking?useSSL=false&serverTimezone=UTC"; private static final String USER="root"; private static final String PASSWORD="your_password"; public static Connection getConnection() throws SQLException{return DriverManager.getConnection(URL,USER,PASSWORD);} }
