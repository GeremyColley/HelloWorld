/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGrable;

/**
 *
 * @author geremycolley
 */
public class Message {
    
    private String strMessage = "Hello ";
            
    public String getMessage(String str){
        String buffer = this.strMessage + str;
        return buffer;
    }
            
    public Message(){
    
    }
    
}
