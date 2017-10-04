/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_arreglos2;

import java.util.Scanner;

/**
 *
 * @author wilchis
 */
public class EVA1_6_ARREGLOS2 {

    /**
     * @param args the command line arguments
     */
    public static final int TAMA_ARRE=5;
    public static void main(String[] args) {
        // TODO code application logic here
        int aiEdad[];
        aiEdad= new int[TAMA_ARRE];
        Scanner sCaptu= new Scanner(System.in);
        for(int i=0; i <aiEdad.length; i++){
            System.out.println("Introduce una edad: ");
            aiEdad[i]=sCaptu.nextInt();
            
        }
        for(int x: aiEdad){
            System.out.println("Edades "+ x);
        }
        //crear duplicado
        int aiCopiaEdad[];
       /* aiCopiaEdad=aiEdad;*/ //no crear un duplicado
       aiCopiaEdad= new int[TAMA_ARRE];
       for (int i=0; i<TAMA_ARRE; i++){
           aiCopiaEdad[i]=aiEdad[i];
       }
       for(int x: aiCopiaEdad){
           System.out.println(" Copia Edad= "+ x);
       }
        System.out.println(aiCopiaEdad);
        System.out.println(aiEdad);
              
    }
    
    
    
}
