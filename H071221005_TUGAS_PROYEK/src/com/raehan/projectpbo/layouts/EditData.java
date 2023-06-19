package com.raehan.projectpbo.layouts;

import java.sql.SQLException;
import java.util.Scanner;

import com.raehan.projectpbo.config.MyConfig;

public class EditData{
    private static java.sql.Statement statement;
    public static void editData(){
        MyConfig.connection();
        Scanner input = new Scanner(System.in);
        System.out.print("Input Untuk Mengubah Jumlah Pada ID 3: ");
        int jumlah = input.nextInt();
        try {
            String query = "UPDATE `daftarnama` SET `Jumlah` = '" + jumlah + "'WHERE `daftarnama`.`ID` = 3;";
            System.out.println("Data Sukses Diubah");
            statement = MyConfig.getConnect().createStatement();
            statement.executeUpdate(query);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        input.close();
    }
}