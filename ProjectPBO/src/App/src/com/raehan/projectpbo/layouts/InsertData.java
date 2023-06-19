package App.src.com.raehan.projectpbo.layouts;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InsertData {
    public static void insertData(DefaultTableModel model , int id,String nama,int harga,int jumlah) throws SQLException{
        try{
        model.addRow(new Object[] {id,nama,harga,jumlah});
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
}
