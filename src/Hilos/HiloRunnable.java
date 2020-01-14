package Hilos;
import Objetos.Dato;
import java.util.Random;

public class HiloRunnable implements Runnable{

    private Dato d;  //ESTANCIA DE CLASE DATO 
    private int num; // VARIABLE QUE GUARDA EL NUMERO DE HILO 
    int i; //VARIABLE PARA GUARDAR EL INICIO DEL ESPACIO EN EL ARREGLO 
    int f; //VARIABLE PARA GUARDAR EL FINAL DE ESPACIO EN EL ARREGLO
    
    public HiloRunnable(Dato d, int num,int inicio,int fin) { 
    this.d=d;
    this.num=num;
    this.i=inicio;
    this.f=fin;
    }
    
    public HiloRunnable(Dato d, int num) { 
    this.d=d;
    this.num=num;
    this.i=0;
    this.f=100;
    }
  
    
    public void run() {        
     d.incremento(i,f);
        System.out.println("Hilo: " +num+" Utilisando posiciones desde :" +i+",Hasta "+f+"");
    }
    
}