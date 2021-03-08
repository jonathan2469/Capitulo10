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
public class TestLoadedDie {
    public static void main(String[] args) {
        
        Die dado = new Die();
        Die dado2 = new Die();
        LoadedDie dadotruqueado = new LoadedDie();
        Integer contador = 0;
        Integer contador2 = 0;
        Integer vecesganadas1 = 0;
        Integer vecesganadas2 = 0;
        
        do {
            dado.Lanzar();
            dado2.Lanzar();
            
            
            if (dado.numero > dado2.numero) {
                vecesganadas1 ++;
            }
            
            contador ++;
        } while (contador >= 1000);
        
        System.out.println(vecesganadas1);
        
        do {
            
            dado.Lanzar();
            dadotruqueado.Lanzar();
            
            
            if (dado.numero > dadotruqueado.numero) {
                vecesganadas2 ++;
            }
            
        } while (contador2 >= 1000); 
        
        System.out.println(vecesganadas2);
        
    }
}
