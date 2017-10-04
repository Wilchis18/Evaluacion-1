/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_static;

/**
 *
 * @author dany
 */
public class EVA1_2_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClasePrueba p1 =new MiClasePrueba();
        
        p1.imprimirMensaje();
        System.out.println(""+p1.sNom);
        
        MiClasePrueba2.imprimirMensaje();
        //System.out.println(""+MiClasePrueba2.sNom);
        MiClasePrueba2.sNom="Jose Daniel Renteria Silva";
        System.out.println(""+MiClasePrueba2.sNom);
    }
    
}

class MiClasePrueba{
    public String sNom="Daniel";
    public void imprimirMensaje(){
        System.out.println("Hola mundo!");
    }
}

class MiClasePrueba2{
    public static String sNom="Daniel";
    public static void imprimirMensaje(){
        System.out.println("Hola mundo!");
    }
}
