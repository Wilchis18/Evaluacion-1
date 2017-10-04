/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dany
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Lamando a A");
        A();
        System.out.println("Termino llamada a A");
    }
    
    public static void A(){
        System.out.println("Lamando a B");
        B();
        System.out.println("Termino llamada a B");
    }
    
    public static void B(){
        System.out.println("Llamando a C");
        C();
        System.out.println("Termino llamada a C");
    }

    private static void C() {
         System.out.println("Fin del camino");
    }
    
    
    
}
