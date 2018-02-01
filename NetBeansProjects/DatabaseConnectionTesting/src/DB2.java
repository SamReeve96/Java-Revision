/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
import java.sql.*;

class DB2{  
    public static void main(String args[]){  
            try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/homes","root","password");  
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from viewing");  
            while(rs.next())  
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
                con.close();  
                }
                catch(Exception e){ System.out.println(e);}  
    }  
}  
