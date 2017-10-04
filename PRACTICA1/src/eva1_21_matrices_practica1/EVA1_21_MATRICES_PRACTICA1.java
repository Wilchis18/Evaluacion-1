
package eva1_21_matrices_practica1;




import java.util.Scanner;


public class EVA1_21_MATRICES_PRACTICA1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n,suma=0,nDif=1;
        boolean igual;
        int edades[];
        Integer numeros[][];
        double media;
        
        System.out.println("Ingrese el numero de alumnos");
        n=sc.nextInt();
        edades=new int[n];
        
        //Se llena el arreglo
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese una edad");
            edades[i]=sc.nextInt();
            igual=false;
            //Cuenta el numero de edades diferentes
            for(int j=0;j<i;j++){
                if(edades[j]==edades[i]){
                    igual=true;
                    break;
                } 
            }
            if(!igual) nDif++;
        }
        numeros=new Integer [nDif][2];
        //Se pone la repeticion de los numeros a 0
        for (int i = 0; i < numeros.length; i++) {
            numeros[i][1]=0;
        }
        
        for (int edade : edades) {
            suma+=edade;
            for (int i = 0; i < numeros.length; i++) {
                if(numeros[i][0]!=null && numeros[i][0]==edade){
                    numeros[i][1]++;
                    break;
                }
                if(i<(numeros.length-1) && numeros[i+1][0]==null) 
                    numeros[i+1][0]=edade;
                
            }
        }
        
        media=(double)suma/(double)n;
        int max=numeros[0][1],indexMax=0;
        
        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i][1]>max){
                max=numeros[i][1];
                indexMax=i;
            }
        }
        
        int moda=numeros[indexMax][0];
        int sumDif=0;
        for (int edade : edades) {
            sumDif+=  (int)(Math.pow((media-edade), 2));
        }
        double varianza=(double)(sumDif)/(double)(n);
        double desviacionEstandar=Math.sqrt(varianza);
        
        
        System.out.println("Media:"+media);
        System.out.println("Moda:"+moda);
        System.out.println("Desviacion estandar:"+desviacionEstandar);
        
    }
    
}
