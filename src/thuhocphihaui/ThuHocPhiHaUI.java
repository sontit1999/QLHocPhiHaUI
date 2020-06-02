/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuhocphihaui;

import database.Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Son tit
 */
public class ThuHocPhiHaUI {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connect connect = new Connect();
        connect.connectMysQL();
        ResultSet result = connect.queryData("select * from sinhvien");
        try {
            while(result.next()){
                System.out.println("Họ tên:" + result.getString("hoten"));
                System.out.println("Quê:" + result.getString("quequan"));
                System.out.println("=====================================");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThuHocPhiHaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        connect.releaseSql();
    }
    
}
