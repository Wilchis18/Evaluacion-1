
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        double salario;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrea el nombre");
        nombre=sc.nextLine();
        System.out.println("Ingresa la edad");
        edad=sc.nextInt();
        System.out.println("Ingresa el salario");
        salario=sc.nextDouble();
        hacerAlgo(nombre, edad, salario);
    }
    
    /**
     *
     * @param nombre Nombre del usuario
     * @param edad Edad del usuario 
     * @param salario Salario del usuario
     */
    public static void hacerAlgo(String nombre,int edad,double salario){
        System.out.println(nombre+" "+edad+" "+salario);
    }
    
}
