/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package report.Model.Interface;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import report.Model.ModelPemasukan;

/**
 *
 * @author aerdy
 */
public class EventImplement_Pemasukkan implements Event_pemasukkan{

     private String dbHost="jdbc:mysql://localhost:3306/keuangan_UPK";
    private String dbUser="root";
    private String dbPass="";
    private Connection conn;
    
    public EventImplement_Pemasukkan(){
         try {
                try {
                    
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (Exception e) {
            }
                
                } catch (Exception e) {
                }
    }
    public EventImplement_Pemasukkan(Connection conn){
        this.conn = conn;
    }
    
    @Override
    public void Connect() throws SQLException {
         this.conn = (Connection) DriverManager.getConnection(dbHost,dbUser,dbPass);
    }

    @Override
    public void Disconnect() throws SQLException {
                this.conn.close();
    }

    @Override
    public void insert(ModelPemasukan db) throws SQLException {
        String sql = "insert into pemasukkan (tanggal,nama,nominal) values(?,?,?);";
        java.sql.PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setDate(1,new java.sql.Date(db.getTanggalMasuk().getTime()));
        ps.setString(2,db.getNama());
        ps.setInt(3,db.getNomilan());
        ps.executeUpdate();
       
    }

   
    
}
