package ejemploclases;

public class Autobus {
    
    //Estado
    private String matricula;
    private String modelo;
    private int potenciaCV;
    private int numeroPlazas;
    
    
    // Comportamiento 

    public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.numeroPlazas = numeroPlazas;
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

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    
    public void mostrar(){
        
        System.out.println("\n");
        System.out.println("\tAUTOBUS");
    
        System.out.println("El numero de matricula es:"+this.matricula);
        System.out.println("El modelo es:"+this.modelo);
        System.out.println("La potencia es:"+this.potenciaCV+"(RPM)");
        System.out.println("El numero de licencia es:"+this.numeroPlazas);
    
    }
    
    
    
}
