/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_million_dolar_baby;

/**
 *
 * @author temporal2
 */
public class EVA1_19_MILLION_DOLAR_BABY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int  arreglo []=new int [100000000];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*100)+1;
        }
    }
    
}
