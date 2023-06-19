package App.src.com.raehan.projectpbo.layouts;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
public class DeleteData {
    public static void deleteData(DefaultTableModel model,int row) {
        try {
            model.removeRow(row);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
