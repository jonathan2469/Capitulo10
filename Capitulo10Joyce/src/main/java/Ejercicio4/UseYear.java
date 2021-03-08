/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author jonat
 */
public class UseYear {
    public static void main(String[] args) {
        Year anio= new Year();
        LeapYear anio2= new LeapYear();
        
        System.out.println(anio.getDays());
        anio.daysElapsed(4, 4);
        System.out.println(anio2.getDays());
        anio2.daysElapsed(4, 4);
    }
}
