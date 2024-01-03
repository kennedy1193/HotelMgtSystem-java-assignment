/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.*;
import java.util.*;

/**
 *
 * @author buter
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String dbUrl ="jdbc:mysql://localhost:3306/hotel_db";
        String username ="root";
        String password ="";
        try{
            Connection con =DriverManager.getConnection(dbUrl, username, password);
            String sql = "CREATE TABLE hotelMs (clientRoom varchar(5)primary key, firstname varchar(20) , lastname varchar(20))";
             Statement st=con.createStatement();
             int rowAffected = st.executeUpdate(sql);
            if(rowAffected>=1){
                System.out.println("table not created");
            }else{
                System.out.println("table created");
            }
            
             } catch (SQLException ex){
        ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }
    

    }
    

