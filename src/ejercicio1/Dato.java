
package ejercicio1;

import java.util.Random;

public class Dato {
int arreglo[];
int numeroAleatorio;

public Dato(){
    this.arreglo=new int[100];
    
}

public void incremento(int inicio,int fin){
    for(int indice=inicio;indice<fin;indice++){
    arreglo[indice]+=10;    
}
}

public void decremento(int inicio,int fin){
    for(int indice=inicio;indice<fin;indice++){
    arreglo[indice]-=10;    
    }
}

public void multiplicacion(){
    
}

public void division(){
    
}

public void generarNumero(int inicio,int fin){
    Random random = new Random();  //VESTANCIA DE UN OBJETO RANDOM PARA GENERAR NUMEROS 
    for(int indice=inicio;indice<fin;indice++){ // RECORRE EL ARREGLO DESDE UN INICIO Y FINALISA 
                                                // EN UNA VARIABLE RECIBIDA COMO 
                                                //PARAMETRO Y 
    arreglo[indice]=numeroAleatorio = random.nextInt(101);
 
}
}
    /**
     * @return the x
     */



    
}
