package ejemploclases;

import java.sql.DriverManager;

public class Taxi {
    
    //Estado
    private String matricula;
    private String modelo;
    private int potenciaCV;
    private int numeroLicencia;
    

    // Comportamiento 

    
    public Taxi(String matricula, String modelo, int potenciaCV, int numeroLicencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.numeroLicencia = numeroLicencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public void mostrar(){
        
        System.out.println("\tTAXI");
    
        System.out.println("El numero de matricula es:"+this.matricula);
        System.out.println("El modelo es:"+this.modelo);
        System.out.println("La potencia es:"+this.potenciaCV+"(RPM)");
        System.out.println("El numero de licencia es:"+this.numeroLicencia);
    
    }
    
}
