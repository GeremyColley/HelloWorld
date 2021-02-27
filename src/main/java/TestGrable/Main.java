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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // https://spring.io/guides/gs/gradle/
        Message msg = new Message();
        System.out.println(msg.getMessage("Geremy"));
    }
    
}
