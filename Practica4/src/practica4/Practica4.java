
package practica4;


public class Practica4 {

   
    public static void main(String[] args) {
    double Matriz[][]= new double[5][5];
    double Matriz2[][]= new double[5][5];
    double MatrizResultados[][]= new double[5][5];
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                Matriz[i][j]= (double)(Math.random()*100)+1;
            }    
        }
        for (int i = 0; i < Matriz2.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                Matriz2[i][j]= (double)(Math.random()*100)+1;
            }
        }
        for (double[] ds : Matriz) {
            for (double d : ds) {
                System.out.print("["+d+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        for (double[] ds : Matriz2) {
            for (double d : ds) {
                System.out.print("["+d+"]");
            }    
            System.out.println("");
        }  
        MatrizResultados[0][0]= Matriz[0][0]*Matriz2[0][0];
        MatrizResultados[0][1]= Matriz[0][1]*Matriz2[0][1];
        MatrizResultados[0][2]= Matriz[0][2]*Matriz2[0][2];
        MatrizResultados[0][3]= Matriz[0][3]*Matriz2[0][3];
        MatrizResultados[0][4]= Matriz[0][4]*Matriz2[0][4];
        MatrizResultados[1][0]= Matriz[1][0]*Matriz2[1][0];
        MatrizResultados[1][1]= Matriz[1][1]*Matriz2[1][1];
        MatrizResultados[1][2]= Matriz[1][2]*Matriz2[1][2];
        MatrizResultados[1][3]= Matriz[1][3]*Matriz2[1][3];
        MatrizResultados[1][4]= Matriz[1][4]*Matriz2[1][4];
        MatrizResultados[2][0]= Matriz[2][0]*Matriz2[2][0];
        MatrizResultados[2][1]= Matriz[2][1]*Matriz2[2][1];
        MatrizResultados[2][2]= Matriz[2][2]*Matriz2[2][2];
        MatrizResultados[2][3]= Matriz[2][3]*Matriz2[2][3];
        MatrizResultados[2][4]= Matriz[2][4]*Matriz2[2][4];
        MatrizResultados[3][0]= Matriz[3][0]*Matriz2[3][0];
        MatrizResultados[3][1]= Matriz[3][1]*Matriz2[3][1];
        MatrizResultados[3][2]= Matriz[3][2]*Matriz2[3][2];
        MatrizResultados[3][3]= Matriz[3][3]*Matriz2[3][3];
        MatrizResultados[3][4]= Matriz[3][4]*Matriz2[3][4];
        MatrizResultados[4][0]= Matriz[4][0]*Matriz2[4][0];
        MatrizResultados[4][1]= Matriz[4][1]*Matriz2[4][1];
        MatrizResultados[4][2]= Matriz[4][2]*Matriz2[4][2];
        MatrizResultados[4][3]= Matriz[4][3]*Matriz2[4][3];
        MatrizResultados[4][4]= Matriz[4][4]*Matriz2[4][4]; 
         System.out.println("La Multiplicacion de las Matrices es: ");
        for (int i = 0; i < MatrizResultados.length; i++) {
            for (int j = 0; j <MatrizResultados.length; j++) {
                System.out.println("");
                 
            }
        }
        for (double[] s : MatrizResultados) {
            for (double d : s) {
               
                System.out.print("["+d+"]");
            }
            System.out.println("");
        }
        
    }
   
}
/*0 1 2 3 4
0[][][][][]
1[][][][][]
2[][][][][]
3[][][][][]
4[][][][][]
/*/