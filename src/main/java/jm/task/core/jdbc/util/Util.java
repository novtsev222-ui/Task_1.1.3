//package jm.task.core.jdbc.util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Util {
//    private final static String DB_URL = "jdbc:mysql://localhost:3306/mydbtest_2";
//    private final static String DB_USER = "root";
//    private final static String DB_PASSWORD = "root";
//    private final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
//
//
//
//    public static Connection getConnection() {
//        Connection connection = null;
//
//        try {
//            Class.forName(DB_DRIVER);
//            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//            System.out.println("connection OK");
//        } catch (ClassNotFoundException | SQLException e ) {
//            e.printStackTrace();
//            System.out.println("connection ERROR");
//
//
//        }
//        return connection;
//    }
//// реализуйте настройку соеденения с БД
//}
