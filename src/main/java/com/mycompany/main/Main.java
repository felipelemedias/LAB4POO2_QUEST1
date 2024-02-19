/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author fleme
 */
public class Main {
    
    
    public static void main(String ... args) {
        
        Pato pt = new PatoDomestico();
        Ave ptAve = new PatoAveAdapter(pt);
        
        
        Pavao pv = new PavaoAzul();
        Ave pvAve = new PavaoAveAdaptor(pv);
        
        Main main = new Main();
        
        main.habilidadesDaAve(ptAve);
        main.habilidadesDaAve(pvAve);
        
    }
    
    public void habilidadesDaAve(Ave ave) {
        ave.emitirSom();
        ave.voar();
    } 
}
