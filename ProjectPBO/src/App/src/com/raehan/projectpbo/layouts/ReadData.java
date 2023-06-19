package App.src.com.raehan.projectpbo.layouts;

import java.sql.ResultSet;
import App.src.com.raehan.projectpbo.config.MyConfig;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ReadData extends javax.swing.JFrame{
    private static java.sql.Statement statement;
    private static ResultSet resultset;
    // READ
    public static DefaultTableModel getDatabase() throws SQLException{
        DefaultTableModel model = new DefaultTableModel();

        try {
            statement = MyConfig.getConnect().createStatement();
            resultset = statement.executeQuery("SELECT * FROM `daftarnama` ORDER BY `daftarnama`.`ID` ASC");
            model.addColumn("ID");
            model.addColumn("Nama");
            model.addColumn("Harga");
            model.addColumn("Jumlah");
            while (resultset.next()) {
                // Ambil nilai dari setiap kolom dalam tabel
                String column1 = resultset.getString("ID");
                String column2 = resultset.getString("Nama");
                String column3 = resultset.getString("Harga");
                String column4 = resultset.getString("Jumlah");
                int ubah_col3_int = Integer.parseInt(column3);
                int ubah_col4_int = Integer.parseInt(column4);
                // Tambahkan baris ke dalam model tabel
                model.addRow(new Object[]{column1, column2,ubah_col3_int,ubah_col4_int});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
}