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
public class TennisGame {
    private String player1;
    private String player2;
    private Integer puntuacion;
    private Integer puntuacion2;
    private String puntuacionFinal;
    private String puntuacionFinal2;
    

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public void setPuntacion1(Integer puntacion1) {
        if (puntacion1 < 0 || puntacion1 > 4){
            this.puntuacion = 0;
            this.puntuacionFinal = "ERROR";
        } else {
            this.puntuacion = puntacion1;
            setPuntfinal1();
        }
    }

    public void setPuntacion2(Integer puntacion2) {
        if (puntacion2 < 0 || puntacion2 > 4){
            this.puntuacion2 = 0;
            this.puntuacionFinal2 = "ERROR";
        } else {
            this.puntuacion2 = puntacion2;
            setPuntfinal2();
        }
    }
    
    private void setPuntfinal1(){
        switch(puntuacion){
            case 0:
                this.puntuacionFinal ="love";
                break;
            case 1:
                this.puntuacionFinal ="15";
                break;
            case 2:
                this.puntuacionFinal ="30";
                break;
            case 3:
                this.puntuacionFinal ="40";
                break;
            case 4:
                this.puntuacionFinal ="game";
                break;
            default:
                break;
        }
    }
    
    private void setPuntfinal2(){
        switch(puntuacion2){
            case 0:
                this.puntuacionFinal2 ="love";
                break;
            case 1:
                this.puntuacionFinal2 ="15";
                break;
            case 2:
                this.puntuacionFinal2 ="30";
                break;
            case 3:
                this.puntuacionFinal2 ="40";
                break;
            case 4:
                this.puntuacionFinal2 ="game";
                break;
            default:
                break;
        }
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public Integer getPuntuacion2() {
        return puntuacion2;
    }

    public String getPuntuacionFinal() {
        return puntuacionFinal;
    }

    public String getPuntuacionFinal2() {
        return puntuacionFinal2;
    }
    
    @Override
    public String toString(){
        return "Player 1: "+getPlayer1()+"\nPlayer 2: "+getPlayer2()+"\nScore: "+ getPuntuacionFinal()+"-"+getPuntuacionFinal2();
    }
    
}
