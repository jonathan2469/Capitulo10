/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author jonat
 */
public class DemoHorses {
    
    public static void main(String[] args) {
        RaceHorse caballo= new RaceHorse();
        caballo.setColor("Cafe");
        caballo.setNacimiento(29,10,2000);
        caballo.setNombre("Pancho");
        caballo.setCarreras(25);
        
        System.out.println(caballo.getNombre()+caballo.getColor()+caballo.getNacimiento()+caballo.getCarreras());
    }
}
