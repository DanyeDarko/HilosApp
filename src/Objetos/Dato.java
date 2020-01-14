
package Objetos;

//<editor-fold defaultstate="collapsed" desc="LIBRERIAS Y PAQUETES IMPORTADOS">
import java.util.Random;  // IMPORTA LA CLASE RANDOM DE LA LIBRERIA D EUTILIDADES JAVA
import Interfaces.MetodosConcurrentesInterfaz; // IMPORTA LA INTERFAZ DEL PAQUETE INTERFACES EN SRC
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR DE LA CLASE DATO">
public class Dato 
extends DatosAbstractClass // HERENCIA DE LA CLASE 'DatosAbstractClass' 
implements MetodosConcurrentesInterfaz{  // IMPLEMENTACION DE LOS  METODOS ABSTRACTOS DE LA INTERFAZ  'MetodosConcurrentesInterfaz'
                                                                                     
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR DE LA CLASE DATO">
    public Dato(){
     this.numeroAleatorio=0; // INICIALISA numeroAleatorio en 0 
     this.arreglo= generarNumeros(); // INICIALISA EL ARREGLO DE NUMEROS CON LA GENERACION DE 100 NUMEROS ALEATORIOS DEL 1 AL 100
     //</editor-fold>
    }

    
    @Override
    public int[] generarNumeros() {
     Random random = new Random();  //ESTANCIA DE UN OBJETO RANDOM PARA GENERAR NUMEROS ALEATORIOS
     int[] numerosAux=new int[100]; // CREAMOS UN ARREGLO DE 100 POCICIONES PARA ALMACENAR LOS NUMEROS GENERADOS
     for(int indice=0;indice<10;indice++){ // RECORRE EL ARREGLO Y LO LLENA DE NUMEROS ALEATORIOS DESDE LA POCICION 0 A LA 100                                              
         numerosAux[indice]=numeroAleatorio = random.nextInt(100)+1; //POR CADA INDICE GENERADO DEL 1 AL 100 ,SE CREA UN NUMERO ALEATORIO ENTRE 1 Y 100
     }    
     return numerosAux.clone(); // DEVUELVE UNA COPIA EXACTA DEL ARREGLO CON LOS NUMEROS ALEATORIOS
    }

    //<editor-fold defaultstate="collapsed" desc="METODOS OPERACIONALES PARA EL ARREGLO DE 100 POCICIONES">
    @Override
    public void incremento(int i, int f) { // METODO QUE INCREMENTA EL VALOR DE LOS ELEMENTOS DEL ARREGLO EN UN RANGO DE POCICIONES
     for(int indice=i;indice<f;indice++){ // EL INDICE TIENE UN INICIO Y FIN BRINDADO POR EL USUARIO ,SE RECIBE EL PARAMETRO EN LA CREACION DEL HILO
         getArreglo()[indice]+=10; //OBTIENE EL ARREGLO Y EN LA POCICION DEL INDICE LO INCREMENTA MAS 10
     }
    }
    
    @Override
    public void decremento(int i, int f) { // METODO QUE DECREMENTA EL VALOR DE LOS ELEMENTOS DEL ARREGLO EN UN RANGO DE POCICIONES
     for(int indice=i;indice<f;indice++){ // EL INDICE TIENE UN INICIO Y FIN BRINDADO POR EL USUARIO ,SE RECIBE EL PARAMETRO EN LA CREACION DEL HILO
         getArreglo()[indice]-=10; //OBTIENE EL ARREGLO Y EN LA POCICION DEL INDICE LO DECREMENTA MENOS 10
     }
    }
    
    
    @Override
    public void multiplica(int i, int f) {  // METODO QUE MULTIPLICA EL VALOR DE LOS ELEMENTOS DEL ARREGLO EN UN RANGO DE POCICIONES
     for(int indice=i;indice<f;indice++){ // EL INDICE TIENE UN INICIO Y FIN BRINDADO POR EL USUARIO ,SE RECIBE EL PARAMETRO EN LA CREACION DEL HILO
         getArreglo()[indice]*=10; //OBTIENE EL ARREGLO Y EN LA POCICION DEL INDICE LO MULTIPLICA POR 10
     }
    }

    @Override
    public void division(int i, int f) {  // METODO QUE DIVIDE EL VALOR DE LOS ELEMENTOS DEL ARREGLO EN UN RANGO DE POCICIONES
     for(int indice=i;indice<f;indice++){ // EL INDICE TIENE UN INICIO Y FIN BRINDADO POR EL USUARIO ,SE RECIBE EL PARAMETRO EN LA CREACION DEL HILO
         getArreglo()[indice]/=10; //OBTIENE EL ARREGLO Y EN LA POCICION DEL INDICE LO DIVIDE ENTRE 10
     }  
    }
    //</editor-fold>



    
}
