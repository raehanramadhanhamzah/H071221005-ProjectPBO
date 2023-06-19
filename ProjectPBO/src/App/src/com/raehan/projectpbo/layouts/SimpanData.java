package App.src.com.raehan.projectpbo.layouts;

import App.src.com.raehan.projectpbo.config.MyConfig;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SimpanData extends javax.swing.JFrame{

    private static Statement statement;
    
    public static void simpanData(JTable jTable,DefaultTableModel model)throws SQLException{
        try {
            // Membuat pernyataan SQL untuk menghapus semua data
            String sql = "DELETE FROM daftarnama";

            // Membuat objek Statement
            statement = MyConfig.getConnect().createStatement();

            // Mengeksekusi pernyataan SQL
            statement.executeUpdate(sql);
            // Menutup statement dan koneksi
            statement.close();
            // Mendapatkan data dari JTable
            int rowCount = jTable.getRowCount();
            int columnCount = jTable.getColumnCount();

            String sql2 = "INSERT INTO daftarnama (ID, Nama, Harga,Jumlah) VALUES (?,?,?,?)";
            PreparedStatement statement1 = MyConfig.getConnect().prepareStatement(sql2);
            // Melakukan iterasi pada setiap baris data di JTable
            for (int row = 0; row < rowCount; row++) {
                // Membuat pernyataan SQL untuk memasukkan data
                    Object value1 = jTable.getValueAt(row, 0);
                    Object value2 = jTable.getValueAt(row, 1);
                    Object value3 = jTable.getValueAt(row, 2);
                    Object value4 = jTable.getValueAt(row, 3);
                    statement1.setObject(1, value1);
                    statement1.setObject(2, value2);
                    statement1.setObject(3, value3);
                    statement1.setObject(4, value4);
                    
                    statement1.executeUpdate();
                }
                statement1.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}