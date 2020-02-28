/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poised;

public class Contractor {
    
    String con_name;
    int con_tel;
    String con_email;
    String con_address;

     

    @Override
    public String toString() {
        return "Contractor: " 
                + "\nName: " + con_name 
                + "\nTelephone: " + con_tel 
                + "\nEmail: " + con_email 
                + "\nAddress: " + con_address;
    }
    
    
    
    
    
    
}
