/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author buter
 */
public class Hotel {
     private String clientRoom;
    private String firstname;
    private String lastname;

    public Hotel() {
    }

    public Hotel(String clientRoom, String firstname, String lastname) {
        this.clientRoom = clientRoom;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getClientRoom() {
        return clientRoom;
    }

    public void setClientRoom(String clientRoom) {
        this.clientRoom = clientRoom;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
