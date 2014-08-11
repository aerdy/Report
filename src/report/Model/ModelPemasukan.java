/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package report.Model;

import java.util.Date;

/**
 *
 * @author aerdy
 */
public class ModelPemasukan {
    Date TanggalMasuk;
    String nama;
    int nominal;
    
    public ModelPemasukan(){
        
    }
    
    public ModelPemasukan(Date Tanggalmasuk,String nama,int nominal){
        this.TanggalMasuk = Tanggalmasuk;
        this.nama = nama;
        this.nominal = nominal;
    }
    
    public Date getTanggalMasuk(){
        return TanggalMasuk;
    }
    public void setTanggalMasuk(Date TanggalMasuk){
        this.TanggalMasuk = TanggalMasuk;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getNomilan(){
     return nominal;   
    }
    public void setNomilan(int nomilan){
        this.nominal = nomilan;
    }
    
    
}
