
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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sCaptu=new Scanner(System.in);
        System.out.println("Introduce el nùmero a analizar: ");
        int iSeraPrimo=sCaptu.nextInt();
        int iRes;
        for (int i = 2; i < iSeraPrimo; i++) {
            iRes=iSeraPrimo%i;
            if(iRes==0){
                System.out.println("El numero no es primo");
                break;
            }
        }
        int iRaiz = (int)Math.sqrt(iSeraPrimo);
        for (int i = 2; i < iSeraPrimo; i++) {
            iRes=iSeraPrimo%i;
            if(iRes==0){
                System.out.println("El numero no es primo");
                break;
            }
        }
        
        
    }
    
}
