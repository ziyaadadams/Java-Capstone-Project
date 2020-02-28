/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poised;


public class Architect {
    
    String arc_name;
    int arc_tel;
    String arc_email;
    String arc_address;


    @Override
    public String toString() {
        return "Architect: " 
                + "\nName: " + arc_name 
                + "\nTelephone: " + arc_tel 
                + "\nEmail: " + arc_email 
                + "\nAddress: " + arc_address;
    }
    
    
    
    
}
