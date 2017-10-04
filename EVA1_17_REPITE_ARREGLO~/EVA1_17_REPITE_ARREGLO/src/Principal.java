
import java.util.Scanner;



public class Principal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=0,tArreglo,num;
        int [] numeros;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo");
        tArreglo=sc.nextInt();
        numeros=new int[tArreglo];
        for (int i = 0; i < tArreglo; i++) {
            System.out.println("Ingrese un numero");
            numeros[i]=sc.nextInt();
        }
        
        System.out.println("Ingrese un numero para buscar");
        num=sc.nextInt();
        for (int numero : numeros) {
            if(numero==num) cont++;
        }
        
        System.out.println("El "+num+" se repite "+cont+" veces");
    }
    
}
