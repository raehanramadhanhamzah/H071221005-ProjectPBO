package com.raehan.projectpbo.layouts;

import java.sql.SQLException;
import java.util.Scanner;

import com.raehan.projectpbo.config.MyConfig;

public class DeleteData {
    private static java.sql.Statement statement;
    public static void deleteData() {
        MyConfig.connection();
        Scanner input = new Scanner(System.in);
        System.out.print("Input ID yang ingin dihapus : ");
        int ID = Integer.parseInt(input.nextLine());
        try {
            statement = MyConfig.getConnect().createStatement();
            String sql = "DELETE FROM `daftarnama` WHERE `ID` = " + ID + ";";
            statement.executeUpdate(sql);
            System.out.println("Data berhasil dihapus");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        input.close();
    }
}
