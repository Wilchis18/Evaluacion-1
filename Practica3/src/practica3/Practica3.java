
package practica3;

import java.util.Scanner;


public class Practica3 {

    
    public static void main(String[] args) {
    int Matriz[][]= new int [5][5];
    //Scanner sCaptu=new Scanner(System.in);
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
              Matriz[i][j] = (int)(Math.random()*100)+1;
                //System.out.print(Matriz[i][j]);
            }
            
        }
        for (int[] is : Matriz) {
            for (int i : is) {
                System.out.print("["+i+"]");
            }
            System.out.println("");
               
        }
        System.out.println("");
        int filas=0;
        int columnas=0;
        int NuevoArreglo[][]= new int[5][5];
        for (int i = Matriz.length-1; i >0 ; i--) {
            for (int j = Matriz.length-1; j > 0; j--) {
             NuevoArreglo[columnas][filas]= Matriz[i][j];
            columnas++;   
            }
            filas++;
        }
        System.out.println("El arreglo invertido es: ");
        for (int[] is : NuevoArreglo) {
            for (int i : is) {
                System.out.print("["+i+"]");
            }
            System.out.println("");
        }
        
    }
    
        
}
