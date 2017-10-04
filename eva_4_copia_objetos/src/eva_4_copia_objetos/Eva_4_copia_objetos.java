/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_4_copia_objetos;

/**
 *
 * @author temporal2
 */
public class Eva_4_copia_objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=5;
        System.out.println("i= "+i);
        int iCopia=i;
        System.out.println("Copia de i= "+ iCopia);
        i++;
        System.out.println("i++="+i);
        System.out.println("iCopia ="+ iCopia);
        Numero nVal=new Numero();
        System.out.println("valor de nVal.i="+ nVal.i);
        Numero nCopiaVal=nVal;
        System.out.println("Valor de nCopiaVal.i ="+ nCopiaVal.i);
        System.out.println(nVal);
        System.out.println(nCopiaVal);
        Numero nCopiaReal= new Numero();
        nCopiaReal.i =nVal.i;
        System.out.println("Valor de nVal.i="+nVal.i);
        System.out.println("Valor de nCopiaReal.i=");
        System.out.println(nVal);
        System.out.println(nCopiaReal);
    }
    
}

class Numero{
    public int i=10;
}
