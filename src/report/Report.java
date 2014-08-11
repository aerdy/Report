/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import report.View.Laporan;
import report.View.Utama;

/**
 *
 * @author aerdy
 */
public class Report {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Utama().setVisible(true);
            }
        });
    }
}
