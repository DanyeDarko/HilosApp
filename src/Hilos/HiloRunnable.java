package Hilos;
//<editor-fold defaultstate="collapsed" desc="LIBRERIAS E IMPORTACIONES DE OBJETOS">
import Objetos.Dato;
import java.util.Random;
//</editor-fold>

public class HiloRunnable implements Runnable{
    
    //<editor-fold defaultstate="collapsed" desc="VARIABLES GLOBALES">
    private Dato d;  //ESTANCIA DE CLASE DATO 
    private int num; // VARIABLE QUE GUARDA EL NUMERO DE HILO 
    int i; //VARIABLE PARA GUARDAR EL INICIO DEL ESPACIO EN EL ARREGLO 
    int f; //VARIABLE PARA GUARDAR EL FINAL DE ESPACIO EN EL ARREGLO
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES DE HILO ">
    public HiloRunnable(Dato d, int num,int inicio,int fin) {  // (CLASE MONITORA , NUMERO DE HILO, INICIO DE RANGO,FIN DE RANGO)
    this.d=d; // INICIALISAMOS LA ESTANCIA DEL OBJETO CON EL RECIBIDO COMO PARAMETRO DESDE EL MAIN PARA SINCRONISAR DATOS ENTRE HILOS
    this.num=num; // DEFINIMOS EL NUMERO DE HILO 
    this.i=inicio; // DEFINIMOS 'i' COMO EL PRINCIPIO DEL RANGO 'INICIO' 
    this.f=fin; // DEFINIMOS 'f' COMO EL FINAL DEL RANGO 'FIN'
    }
    
    // ***** CONSTRUCTOR OPCIONAL A FALTA DE PARAMETROS DE RANGO 
    public HiloRunnable(Dato d, int num) {  // (CLASE MONITORA , NUMERO DE HILO) 
    this.d=d;
    this.num=num;
    this.i=0; // SI NO SE RECIBEN PARAMETROS DE INICIO COMIENSA DESDE LA POCICION [ 0 ]
    this.f=100; // SI NO SE RECIBEN PARAMETROS DE FINAL ,TERMINA EN LA POCICIO [ 100 ]
    }
    //</editor-fold>
    
    public void run() {        
     d.decidirOperacion(num, i, f);  // EVALUA EL NUMERO DE HILO PARA PODER REALISAR LA OPERACION CORRESPONDIENTE 
                                     // VER CLASE DATO PARA DETALLES DEL METODO DE DECICION DE OPERACION 
    }  
}