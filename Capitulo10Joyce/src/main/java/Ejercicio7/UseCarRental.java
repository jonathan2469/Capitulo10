/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author jonat
 */
public class UseCarRental {
    public static void main(String[] args) {
        CarRental car= new CarRental("Octavio",71000,Tamaño.FULL,20);
        LuxuryCarRental car2= new LuxuryCarRental("Octavio",71000,Tamaño.FULL,20);
        
        car.display();
        car2.display();
    }   
}
