
package eva1_16_buscar_arreglos;

import java.util.Scanner;


public class EVA1_16_BUSCAR_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[];
        int n,numeroBuscar,indice=-1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo");
        n=sc.nextInt();
        numeros=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero");
            numeros[i]=sc.nextInt();
        }
        System.out.println("Ingrese el valor para encontrar");
        numeroBuscar=sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if(numeros[i]==numeroBuscar){
                indice=i;
                break;
            }
        }
        
        if(indice!=-1){
            System.out.println("El numero se encontro en la indice: "+indice);
        }
        else{
            System.out.println("No se encontro el numero");
        }
    }
    
}
