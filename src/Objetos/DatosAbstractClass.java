package Objetos;

public abstract class DatosAbstractClass {
    
 //<editor-fold defaultstate="collapsed" desc="VARIABLES GLOBALES">

 public int arreglo[]; // ARREGLO DE 100 POCICIONES EN EL QUE SE EFECTUARAN LAS OPERACIONES DE LOS HILOS
 int numeroAleatorio;
 //</editor-fold>
 //<editor-fold defaultstate="collapsed" desc="METODOS DE ENCAPSULAMIENTO">
    /**
     * @return the arreglo
     */
    public int[] getArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    /**
     * @return the numeroAleatorio
     */
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    /**
     * @param numeroAleatorio the numeroAleatorio to set
     */
    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }
 //</editor-fold> 
    
}
