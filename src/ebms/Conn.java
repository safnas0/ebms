/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ebms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    
    
    Connection c;
    Statement s;
    Conn() {
        try {
           c = DriverManager.getConnection("jdbc:mysql:///safnassha", "root", "Safnas0503@"); 
           s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    
}
