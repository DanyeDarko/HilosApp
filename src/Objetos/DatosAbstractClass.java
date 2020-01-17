package Objetos;

public abstract class DatosAbstractClass {
    
 //<editor-fold defaultstate="collapsed" desc="VARIABLES GLOBALES">

 public int[][] arreglo; // ARREGLO DE 100 POCICIONES EN EL QUE SE EFECTUARAN LAS OPERACIONES DE LOS
                          // HILOS
 int numeroAleatorio;
 int x;
 int filas0,filas1;
 //</editor-fold>

public void imprimirArreglo(){
int f,c,fArre;
for(f=0;f<8;f++){
    fArre=f%2;
    for(c=0;c<25;c++){
        System.out.printf("FILA["+fArre+"]"+"["+c+"]: " +getArreglo()[fArre][c]+ " ");
        System.out.print("");
        if(fArre==0){
filas0++;
        }
        else{
filas1++;
        }

    }
}
}


 //<editor-fold defaultstate="collapsed" desc="METODOS DE ENCAPSULAMIENTO">
    /**
     * @return the arreglo
     */
    public int[][] getArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(int[][] arreglo) {
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
