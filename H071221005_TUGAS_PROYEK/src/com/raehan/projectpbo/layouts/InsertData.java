package com.raehan.projectpbo.layouts;

import java.util.Scanner;

import com.raehan.projectpbo.config.MyConfig;

public class InsertData {
    private static java.sql.Statement statement;
    public static void insertData(){
        int ID;
        String namaBaru;
        long hargaBaru;
        int jumlahBaru;
        Scanner input = new Scanner(System.in);
        System.out.print("ID : ");
        ID = Integer.parseInt(input.nextLine());
        System.out.print("Nama : ");
        namaBaru = input.nextLine();
        System.out.print("Harga : ");
        hargaBaru = Long.parseLong(input.nextLine());
        System.out.print("Jumlah : ");
        jumlahBaru = Integer.parseInt(input.nextLine());
        
        input.close();
        try {
            MyConfig.connection();
            statement = MyConfig.getConnect().createStatement();
            statement.executeUpdate("INSERT INTO `daftarnama` (`ID`, `Nama`, `Harga`, `Jumlah`) VALUES ('"+ID+"', '"+namaBaru+"', '"+hargaBaru+"', '"+jumlahBaru+"')");

            System.out.println("Data berhasil di simpan");

            statement.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        input.close();
}
}
