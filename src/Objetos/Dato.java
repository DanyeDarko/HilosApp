package Objetos;

//<editor-fold defaultstate="collapsed" desc="LIBRERIAS Y PAQUETES IMPORTADOS">
import java.util.Random;  // IMPORTA LA CLASE RANDOM DE LA LIBRERIA D EUTILIDADES JAVA
import Interfaces.MetodosConcurrentesInterfaz; // IMPORTA LA INTERFAZ DEL PAQUETE INTERFACES EN SRC
//</editor-fold>

public class Dato extends DatosAbstractClass // HERENCIA DE LA CLASE 'DatosAbstractClass' 
implements MetodosConcurrentesInterfaz {  // IMPLEMENTACION DE LOS  METODOS ABSTRACTOS DE LA INTERFAZ  'MetodosConcurrentesInterfaz'

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR DE LA CLASE DATO">
    public Dato(int x) {
        this.numeroAleatorio = 0; // INICIALISA numeroAleatorio en 0 
        this.x=x; //HASTA DONDE SE RECORRERA EL AREGLO O DE CUANTAS COLUMNAS ESTA ESPECIFICA CUANTOS NUMEROS SE GENERAN 
        this.arreglo = generarNumeros(); // INICIALISA EL ARREGLO DE NUMEROS CON LA GENERACION DE 100 NUMEROS ALEATORIOS DEL 1 AL 100 
                                         //EN LA FILA [0] DEL ARREGLO SE CREARAN ESTOS NUMEROS MIENTRAS EN LA FILA [1] SE RELLENARA DE CEROS
                                        //YA QUE AQUI SE IMPRIMIRAN LAS DIFERENCIAS Y CAMBIOS DURANTE LAS OPERACIONES    
    }
    //</editor-fold>
    
    
    @Override
    public int[][] generarNumeros() {
        Random random = new Random();  //ESTANCIA DE UN OBJETO RANDOM PARA GENERAR NUMEROS ALEATORIOS
        int[][] numerosAux = new int[2][x]; // CREAMOS UN ARREGLO DE DOS DIMENSIONES CON X NUMERO DE COLUMNAS
                                            // O POCICIONES PARA ALMACENAR LOS NUMEROS GENERADOS
        for (int indice = 0; indice < x; indice++) { // RECORRE EL ARREGLO Y LO LLENA DE NUMEROS ALEATORIOS DESDE LA POCICION 0 A LA 'X'           0   1  2   3 ...                                
            numerosAux[0][indice]=numeroAleatorio= random.nextInt(100)+1;// NUMEROS SERIADOS ALEATORIOS DEL 1 AL CIEN QUE SE INSERTARAN EN FILA 0 [54][2][12][32] 
            numerosAux[1][indice]=0; // LA FILA 1 SE INICIALISARA EN CEROS PUESTO QUE AUN NO SE REALISAN CAMBIOS NI OPERACIONES           FILA  1 [0][0][0][0]  
         }
      
        return numerosAux.clone(); // DEVUELVE UNA COPIA EXACTA DEL ARREGLO CON LOS NUMEROS ALEATORIOS
    }

    public void decidirOperacion(int numeroHilo, int inicio, int fin) { //SEGUN EL NUMERO DE HILO ES COMO A EFECTUAR LA OPERACION 
        int iteradorPociciones; 
        for(iteradorPociciones=inicio;iteradorPociciones<fin;iteradorPociciones++)
        switch(numeroHilo){
              case 1:
              getArreglo()[1][iteradorPociciones] = getArreglo()[0][iteradorPociciones]+10;
              break;
              case 2:
              getArreglo()[1][iteradorPociciones] = getArreglo()[0][iteradorPociciones]+10;
              break;
              case 3:
              getArreglo()[1][iteradorPociciones] = getArreglo()[0][iteradorPociciones]+10;
              break;
              case 4:
              getArreglo()[1][iteradorPociciones] = getArreglo()[0][iteradorPociciones]+10;
              break;
          }      
    }

   
    //<editor-fold defaultstate="collapsed" desc="METODOS OPERACIONALES PARA EL ARREGLO DE 100 POCICIONES">
   
    //</editor-fold>
    
}
