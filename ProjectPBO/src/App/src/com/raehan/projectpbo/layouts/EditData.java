package App.src.com.raehan.projectpbo.layouts;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EditData{
    public static void editData(DefaultTableModel model,int row,String nama, int harga, int jumlah){
        try {
            model.setValueAt(nama,row, 1);
            model.setValueAt(harga,row , 2);
            model.setValueAt(jumlah,row, 3);
            JOptionPane.showMessageDialog(null,"Berhasil Diedit !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}