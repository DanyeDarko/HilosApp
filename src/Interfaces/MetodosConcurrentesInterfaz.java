
package Interfaces;

public interface MetodosConcurrentesInterfaz {
    
    
    int[] generarNumeros(); // METODO ABSTRACTO PARA GENERAR NUMEROS ALEATORIOS EN EL ARREGLO 
    void decidirOperacion(int numeroHilo,int inicio,int fin); // DECIDIMOS QUE OPERACION REALISAR CON SU RESPECTIVO RANGO OPERACIONAL
    
    //<editor-fold defaultstate="collapsed" desc="METODOS ABSTRACTOS  DE OPERACIONES DEL HILO">
    void incremento(int i,int f); // METODO ABSTRACTO PARA INCREMENTAR VALORES EN EL ARREGLO DE 100 POCICIONES A BASE DE UN RANGO
    void decremento(int i,int f); // METODO ABSTRACTO PARA DECREMENTAR VALORES EN EL ARREGLO DE 100 POCICIONES A BASE DE UN RANGO
    void multiplica(int i,int f); // METODO ABSTRACTO PARA MULTIPLICAR VALORES EN EL ARREFGLO DE 100 POCICIONES A BASE DE UN RANGO
    void division(int i,int f); // METODO ABSTRACTO PARA DIVIDIR VALORES EN EL ARREFGO DE 100 POCICIONES A BASE DE UN RANGO
   //</editor-fold>    
}
