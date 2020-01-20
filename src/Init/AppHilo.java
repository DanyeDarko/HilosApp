package Init;

//<editor-fold defaultstate="collapsed" desc="LIBRERIAS Y DEPENDENCIAS IMPORTADAS">
import Objetos.Dato;
import Hilos.*;
import com.sun.org.apache.bcel.internal.generic.FCONST;
//</editor-fold>

public class AppHilo {

    public static void main(String[] args) {

        //<editor-fold defaultstate="collapsed" desc="VARIABLES E INSTANCIAS DE OBJETOS PRINCIPALES">
        Dato d = new Dato(100); // CREACION DE UN NUEVO OBJETO DE TIPO DATO(NUEVA ESTANCIA DE CLASE) PARA
        // SINCRONISAR LA CLASE CON DOS HILOS

        int iteradorArreglos; // VARIABLE UTIL PARA RECORRER EL ARREGLO Y EFECTUAR LLENADO Y DESPLIEGE DE HILOS
        //</editor-fold>

        System.out.println("*******ARREGLO ORIGINAL********");
        d.imprimirArreglo(); // IMPRIMIMOS EL ARREGLO ORIGINAL 

        //<editor-fold defaultstate="collapsed" desc="CREACION DE ARREGLO DE HILOS DE LA CLASE THREAD">
        HiloThread arregloHiloThread[] = new HiloThread[4]; // CREAMOS UNA NUEVA ESTANCIA DE UNA AREGLO DE OBJETOS 
        //DE TIPO HILOTHREAD  DE 4 POCICIONES ES DECIR 4 HILOS

        for (iteradorArreglos = 0; iteradorArreglos < 2; iteradorArreglos++) { // PARTIMOS DE LLENAR CADA POCICION
            //DEL ARREGLO CON UN HILO NUEVO 
            arregloHiloThread[iteradorArreglos] = new HiloThread(d, (iteradorArreglos + 1));
            /* CADA HILO RECIBE COMO PARAMETRO
                                                                                             d : CLASE MONITORA DE TIPO DATO
                                                                                             numhilo : IDENTIFICARA LA OPERACION AA REALIZAR POR CADA HILO 1 -SUMA 2-RESTA ...
                                                                                             inicio:DESDE DONDE COMENSARA A EFECTUARSE LA OPERACION DEL HILO OMITIRLO LO IGUALA A CERO
                                                                                             final: HASTA DONDE SE EFECTUA LA OPERACION SI SE OMITE ES IGUAL A 100 */
            arregloHiloThread[iteradorArreglos].start(); // DESPLEGAMOS LOS HILOS     
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="PONER EN SECUENCIA LOS HILOS ">
        for (iteradorArreglos = 0; iteradorArreglos < 2; iteradorArreglos++) {
            try {
                arregloHiloThread[iteradorArreglos].join(); // QUEDA A LA ESPERA DE QUE TERMINE UN HILO PARA EJECUTARSE EL SIGUIENTE
            } catch (Exception NullPointerException) { // SI ALGO SUCEDE CACHA LA EXEPCION 
                System.out.println("ERROR AL ESPERAR LA EJECUCION DEL SIGUEINTE HILO");
            }
        }
        //</editor-fold>
        
        System.out.println("*******ARREGLO AFECTADO********");
        d.imprimirArreglo(); // VISUALISAMOS COMO FUE AFECTADO EL ARREGLO DESPUES DE DESPLEGAR LOS HILOS Y UNIRLOS
    }
}
