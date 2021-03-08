/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

/**
 *
 * @author jonat
 */
public class CreateAliens {
    public static void main(String[] args) {
        Alien alien = new Alien("Rafa",3,4.5f);
        Martian martian = new Martian ();
        Jupiterian jupiterian = new Jupiterian ();
    
        System.out.println(alien.toString());
        System.out.println(martian.toString());
        System.out.println(jupiterian.toString());
    }
    
}
