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
public class DoublesTennisGame extends TennisGame{
    
    private String player1;
    private String player2;

    public void setPlayer2(String player2, String player22) {
        super.setPlayer2(player2); 
        this.player2=player2;
    }

    public void setPlayer1(String player1, String player11) {
        super.setPlayer1(player1); 
        this.player1=player1; 
    }
    
    @Override
    public String toString(){
        return "Equipo 1: "+super.getPlayer1()+" "+ player1+"\nEquipo 2: "+super.getPlayer2()+" "+player2+"\nScore: "+super.getPuntuacionFinal()+"-"+super.getPuntuacionFinal2();
    }
}
