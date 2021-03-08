/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

/**
 *
 * @author jonat
 */
public class LoadedDie extends Die{
    @Override
    public void Lanzar(){
    this.numero = ((int)(Math.random() * 100) % 6 + 2);
    }
}
