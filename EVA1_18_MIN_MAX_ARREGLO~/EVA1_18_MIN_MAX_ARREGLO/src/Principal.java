
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        int tArreglo,min,max;
        int [] numeros;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo");
        tArreglo=sc.nextInt();
        numeros=new int[tArreglo];
        for (int i = 0; i < tArreglo; i++) {
            System.out.println("Ingrese un numero");
            numeros[i]=sc.nextInt();
        }
        
        min=numeros[0];
        max=numeros[0];
        for (int i = 0; i < tArreglo; i++) {
            if(numeros[i]<min) min=numeros[i];
            if(numeros[i]>max) max=numeros[i];
        }
        
        System.out.println("Míninmo: "+min);
        System.out.println("Máximo: "+max);
    }
    
}
