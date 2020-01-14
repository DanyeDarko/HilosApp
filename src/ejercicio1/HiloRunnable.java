/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Random;

/**
 *
 * @author ye
 */
class HiloRunnable implements Runnable{

    private Dato d;  //ESTANCIA DE CLASE DATO 
    private int num; // VARIABLE QUE GUARDA EL NUMERO DE HILO 
    int i; //VARIABLE PARA GUARDAR EL INICIO DEL ESPACIO EN EL ARREGLO 
    int f; //VARIABLE PARA GUARDAR EL FINAL DE ESPACIO EN EL ARREGLO
    
    HiloRunnable(Dato d, int num,int inicio,int fin) { 
    this.d=d;
    this.num=num;
    this.i=inicio;
    this.f=fin;
    }

  
    
    public void run() {        
     d.generarNumero(i,f);
     d.incremento(i,f);
        System.out.println("Hilo: " +num+" Utilisando posiciones desde :" +i+",Hasta "+f+"");
    }
    
}