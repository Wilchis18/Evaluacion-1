
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Preguntar cuantas edades
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Cuantas edades se van a capturar");
        int iCant = sCaptu.nextInt(); //CANTIDAD A CAPTURAR
        //INICIALIZAR EL ARREGLO
        int aiEdades[]= new int [iCant];
        //Capturar
        for (int i = 0; i < iCant ; i++) {
            System.out.println("introduce la edad");
            aiEdades[i]= sCaptu.nextInt();
            
        }
        // CAPTURAR EL PROMEDIO DE EDADES
        int iAcum = 0;
        for (int iVal : aiEdades) {
            iAcum = iAcum + iVal;
        }
        double dProm = iAcum/iCant;
        System.out.println("El promedio es: "+(iAcum/iCant));
    }
    
}
