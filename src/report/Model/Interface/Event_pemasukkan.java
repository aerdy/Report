/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package report.Model.Interface;

import java.sql.SQLException;
import report.Model.ModelPemasukan;

/**
 *
 * @author aerdy
 */
public interface  Event_pemasukkan {
    public void Connect () throws SQLException;
    public void Disconnect()throws SQLException;
    public void insert (ModelPemasukan db) throws SQLException;
    
}
