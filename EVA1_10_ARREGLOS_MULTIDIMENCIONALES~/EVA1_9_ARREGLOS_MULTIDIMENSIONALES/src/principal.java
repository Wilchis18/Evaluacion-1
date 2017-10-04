/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ARREGLOS MULTIDIMENSIONALES ARREGLOS DE ARREGLOS
        //MATRIZ DE 2X2 DIMENSIONES [filas] x [columnas]
        int aiMatriz[][]= new int [2][2]; // hay 4 enteros
        //llenar con valores aleaotorios
        //por filas
        //por columnas
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
              aiMatriz[i][j] = (int)(Math.random()*10)+1; 
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("["+ aiMatriz[i][j]+ "]");     
            }
            System.out.println("");
        }
        for (int[] aiMatriz1 : aiMatriz) {
            
        }
        
        
    }
    
}
