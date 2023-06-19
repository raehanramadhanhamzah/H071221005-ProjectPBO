package com.raehan.projectpbo.config;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConfig {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_daftarnama";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
    
    private static Connection connect;

    public static Connection getConnect() {
        return connect;
    }

    public static void setConnect(Connection connect) {
        MyConfig.connect = connect;
    }

    public static void connection(){
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connection: Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection: Gagal");
        }
    }
}
