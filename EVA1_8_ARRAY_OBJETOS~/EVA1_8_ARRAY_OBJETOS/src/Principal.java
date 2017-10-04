/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    alumno aaDatosAlumno[];
    aaDatosAlumno= new alumno[10];
    for (int i= 0; i< aaDatosAlumno.length; i++);{
        aaDatosAlumno[i]= new alumno("Erick", "16550579", 0);
    }
    
        for (alumno aaDatosAlumno1 : aaDatosAlumno) {
            System.out.println("Nombre"+ aaDatosAlumno1.getsNom());
            System.out.println("Matricula"+ aaDatosAlumno1.getsMatri());
            System.out.println("Carrera"+ aaDatosAlumno1.getiCar());
            
        }
    //crear nuevo arreglo, instanciar cada posicion, para cada posicion del arreglo con datos, copiar atributos del objeto en el nuevo arreglo
        
        
    }
    
}
class alumno  {
    private String sNom;
    private String sMatri;
    private int iCar;
    public alumno (String sNombre, String sMatricula, int iCarrera){
    sNom = sNombre;
    sMatri = sMatricula;
    iCar= iCarrera;
}

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsMatri() {
        return sMatri;
    }

    public void setsMatri(String sMatri) {
        this.sMatri = sMatri;
    }

    public int getiCar() {
        return iCar;
    }

    public void setiCar(int iCar) {
        this.iCar = iCar;
    }
    
}