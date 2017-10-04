/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_matrices_edades;

import java.util.Scanner;

/**
 *
 * @author dany
 */
public class EVA1_14_MATRICES_EDADES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nGrupo;
        Scanner sc = new Scanner(System.in);
        int grupos[][];
        int alumnos,suma; //variables para los for
        
        System.out.println("Ingrese el número de grupos");
        nGrupo=sc.nextInt();
        grupos = new int[nGrupo][];
        for (int grupo = 0; grupo < nGrupo; grupo++) {
            System.out.println("Ingrese el número de alumnos de grupo #"
                    +(grupo+1));
            alumnos = sc.nextInt();
            grupos[grupo]=new int[alumnos];
            for (int alumno = 0; alumno < alumnos; alumno++) {
                System.out.println("Ingrese una edad");
                grupos[grupo][alumno]=sc.nextInt();
            }
        }
        
        double promedios[] = new double[nGrupo];
        for (int grupo = 0; grupo < nGrupo; grupo++) {
            suma=0;
            for (int alumno = 0; alumno < grupos[grupo].length; alumno++) {
                suma+=grupos[grupo][alumno];
            }
            promedios[grupo]=(double)(suma)/(double)(grupos[grupo].length);
        }
        
        for (int grupo = 0; grupo < promedios.length; grupo++) {
            System.out.println("Promedio del grupo #"+(grupo+1)+"= "+promedios[grupo]);
        }
       
        
    }
    
}
