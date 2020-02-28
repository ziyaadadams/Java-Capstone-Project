/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poised;


public class Customer {
    
    String name;
    int tel;
    String email;
    String address;

    
    

    @Override
    public String toString() {
        return "Customer: " 
                + "\nName: " + name 
                + "\nTelephone: " + tel 
                + "\nEmail: " + email 
                + "\nAddress: " + address;
    }
    
    
}
