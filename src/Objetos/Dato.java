
package Objetos;

import java.util.Random;
import Interfaces.MetodosConcurrentesInterfaz;

public class Dato extends DatosAbstractClass implements MetodosConcurrentesInterfaz{ // HEREDA VARIABLES Y METODOS DE 'DatosAbstractClass'  
                                                                                     //  IMPLEMENTA METODOS DE LA INTERFFAZ 'MetodosConcurrentesInterfaz'
public Dato(){
    this.numeroAleatorio=0;
    this.arreglo= generarNumeros();
}

    @Override
    public int[] generarNumeros() {
    Random random = new Random();  //VESTANCIA DE UN OBJETO RANDOM PARA GENERAR NUMEROS
    int[] numerosAux=new int[100];
    for(int indice=0;indice<100;indice++){ // RECORRE EL ARREGLO DESDE UN INICIO Y FINALISA 
                                                // EN UNA VARIABLE RECIBIDA COMO 
                                                //PARAMETRO Y 
    numerosAux[indice]=numeroAleatorio = random.nextInt(101);
 
}    
    return numerosAux.clone();
    }

    
    @Override
    public void incremento(int i, int f) {
       for(int indice=i;indice<f;indice++){
    getArreglo()[indice]+=10; 
    }
    }
    
    @Override
    public void decremento(int i, int f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void multiplica(int i, int f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void division(int i, int f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the x
     */



    
}
