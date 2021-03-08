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
public class Alien {
    protected Integer eyeNumber;
    protected String name;
    protected Float evil;

    public Alien(String name, Integer eyeNumber, Float evil) {
        
        this.name = name;
        this.eyeNumber = eyeNumber;
        this.evil = evil;
    }

    @Override
    public String toString() {
        return "Alien{" + "eyeNumber=" + eyeNumber + ", name=" + name + ", evil=" + evil + '}';
    }
    
    
}
