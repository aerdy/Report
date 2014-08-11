/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package report.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aerdy
 */
public class Koneksi {
    Connection connection;
    String url = "jdbc:mysql://localhost:3306/keuangan_UPK";
    String user = "root";
    String pass = "";
    private Statement statement;

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
        return connection;
    }
    
    public ResultSet exQuer(String sql){
        ResultSet rs = null;
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    public int row(ResultSet rs){
        int jumlah = 0;
        try {
            while (rs.next()) {
                jumlah +=1;
            }
        } catch (Exception ex) {

        }
        return jumlah;
    }

    public final void tampilTabel(JTable table, String[]kepala, String sql){
        ResultSet rs = exQuer(sql);
        int jumlahRow = row(exQuer(sql));
        int baris = 0;
        table.setModel(new DefaultTableModel(kepala, jumlahRow));
        try {
            while (rs.next()) {
                for(int i = 0; i<kepala.length; i++){
                    table.setValueAt(rs.getString(i+1), baris, i);
                }
                baris++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    
}
