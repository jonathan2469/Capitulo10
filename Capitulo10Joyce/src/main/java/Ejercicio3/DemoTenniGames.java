/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author jonat
 */
public class DemoTenniGames {
    
    public static void main(String[] args) {
        TennisGame juego1= new TennisGame();
        DoublesTennisGame juego2= new DoublesTennisGame();
        
        juego1.setPlayer1("Pedro");
        juego1.setPlayer2("Jorge");
        juego1.setPuntacion1(5);
        juego1.setPuntacion2(6);
        
        juego2.setPlayer1("Carlos","Tadeo");
        juego2.setPlayer2("Maria","Maria");
        juego2.setPuntacion1(0);
        juego2.setPuntacion2(2);
        
        System.out.println(juego1.toString());
        System.out.println(juego2.toString());
    }
}
