/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Model.Hotel;
import java.sql.*;
import model.*;

/**
 *
 * @author buter
 */
public class ClientDao {
    public String dbUrl ="jdbc:mysql://localhost:3306/hotel_db";
 public String username ="root";
 public String password ="";
 String sql;
 int rowAffected;
 public String insertClient(Hotel clientObj){
 try{
Connection con =DriverManager.getConnection(dbUrl , username , password);
sql = "INSERT INTO hotelMs VALUES(?,?,?)";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, clientObj.getClientRoom());
pst.setString(2 ,clientObj.getFirstname());
pst.setString(3 ,clientObj.getLastname());

rowAffected = pst.executeUpdate();
if(rowAffected>=1){
    return"data successfully inserted ";
}else{
    return"data not inserted";
}

}catch(Exception ex){
 ex.printStackTrace();
}
 return "server error";
}
 public String updateClient(Hotel clientObj) {
 try{
 Connection con = DriverManager.getConnection(dbUrl, username, password);
 sql = "UPDATE hotelMs SET firstName =?,lastName =? WHERE ClientRoom =?";
 
 PreparedStatement pst =con.prepareStatement(sql);
 pst.setString(1, clientObj.getFirstname ());
 pst.setString(2, clientObj.getLastname());
 pst.setString(3,clientObj.getClientRoom());
 
   rowAffected =pst.executeUpdate();
if (rowAffected>=1){
    return"updated";
}
else{
    return"data not updated";
 }
 }catch(Exception ex){
     ex.printStackTrace();
 }
 return "Server Error";
 }


   
public String DeleteClient(Hotel clientObj){
try{
Connection con = DriverManager.getConnection(dbUrl, username, password);
sql = "DELETE FROM hotelMs WHERE ClientRoom =?";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, clientObj.getClientRoom());
int rowAffected=pst.executeUpdate();
if (rowAffected>=1){
return"data deleted";
}else{
return"data not deleted";
}
}catch(Exception ex){
ex.printStackTrace();
}
return "server error";
}}
 /*public List<hotelMs>allStudent(){
        try{
            Connection con =DriverManager.getConnection(dbUrl, username, passwd);
            sql="select * from hotelMs";
            PreparedStatement pst=con.prepareCall(sql);
            ResultSet result=pst.executeQuery();
            List<hotelMs> clientlistlist=new ArrayList<>();
            while(result.next()){
                hotelMs clientObj=new hotelMs();
                clientObj.setClientRoom(result.getString(1));
                clientObj.setFirstname(result.getString("firstName"));
                clientObj.setLastname(result.getString("lastName"));
                clientlist.add(clientObj);
            }
            return clientlist;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}*/

    

