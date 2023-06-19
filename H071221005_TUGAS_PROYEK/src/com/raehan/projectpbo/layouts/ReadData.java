package com.raehan.projectpbo.layouts;

import java.sql.ResultSet;
import com.raehan.projectpbo.config.MyConfig;

public class ReadData {
    private static java.sql.Statement statement;
    private static ResultSet resultset;
    // READ
    public static void getDatabase(){
        MyConfig.connection();
        try {
            statement = MyConfig.getConnect().createStatement();
            resultset = statement.executeQuery("SELECT * FROM `daftarnama`");

            while(resultset.next()){
                System.out.println(
                    resultset.getString("ID") + ".) "+
                    resultset.getString("Nama") + " Rp."+
                    resultset.getString("Harga") + ", Stok : " +
                    resultset.getString("Jumlah") + ")"
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}