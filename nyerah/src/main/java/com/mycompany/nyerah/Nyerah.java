/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nyerah;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author lolljisdhfjkg
 */
public class Nyerah {
    public static Connection Go(){
 try {
            MysqlDataSource m = new MysqlDataSource();
            m.setDatabaseName("mahasiswa");
            m.setUser("root"); 
            m.setPassword(""); 
            m.setServerName("localhost"); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            Connection k = m.getConnection();
            System.out.println("Sukses!");
            
            return k;
        } catch (SQLException e) {
            System.err.println("Error: "+e.getMessage());
        }
        
        return null;
    }
   // public static void main(String[] args) {
     //   System.out.println("Hello World!");
    //}
}
