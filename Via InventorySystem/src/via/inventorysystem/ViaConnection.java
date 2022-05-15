
package via.inventorysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ViaConnection {
    
    
     
    Connection conn;
 
    public Connection getConn(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ viainventory","root","");
             JOptionPane.showMessageDialog(null, "Database Connection Successful MySQLConnect getconns method");
             return conn;
        } 
           
       
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error in MySQLConnect getconns method"+e);
         
        }
           return conn;
    
  }
}


