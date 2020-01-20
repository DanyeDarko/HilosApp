package Objetos;

//<editor-fold defaultstate="collapsed" desc="LIBRERIAS Y PAQUETES IMPORTADOS">
import java.util.Random;  // IMPORTA LA CLASE RANDOM DE LA LIBRERIA D EUTILIDADES JAVA
import Interfaces.MetodosDatosInterfaz; 
//</editor-fold>

public class Dato extends DatosAbstractClass // HERENCIA DE LA CLASE 'DatosAbstractClass' HEREDA METODOS Y VARIABLES
{

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR DE LA CLASE DATO">
    public Dato(int x) {
        this.numeroAleatorio = 0; // INICIALISA numeroAleatorio en 0 
        this.arregloLongitud=x; //HASTA DONDE SE RECORRERA EL AREGLO O DE CUANTAS COLUMNAS ESTA ESPECIFICA CUANTOS NUMEROS SE GENERAN 
        this.arreglo = generarNumeros(); // INICIALISA EL ARREGLO DE NUMEROS CON LA GENERACION DE 100 NUMEROS ALEATORIOS DEL 1 AL 100 
                                         //EN LA FILA [0] DEL ARREGLO SE CREARAN ESTOS NUMEROS MIENTRAS EN LA FILA [1] SE RELLENARA DE CEROS
                                        //YA QUE AQUI SE IMPRIMIRAN LAS DIFERENCIAS Y CAMBIOS DURANTE LAS OPERACIONES    
    }
    //</editor-fold>
    
}
