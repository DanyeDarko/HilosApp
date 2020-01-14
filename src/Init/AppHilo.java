
package Init;

import Objetos.Dato;
import Hilos.HiloRunnable;

/**
 *
 * @author ye
 */
public class AppHilo {

    public static void main(String[] args) {
       Dato d = new Dato();
       HiloRunnable hr=new HiloRunnable(d, 1,0,25); //PARAMETROS: d -->CLASE DATO Monitora,
                                                    //1 --->NUMERO DE HILO
                                                    //0----> INICIO DE ARREGLO ,
                                                    //25---> FINAL DE ARREGLO
       HiloRunnable hr2=new HiloRunnable(d, 2, 50,75);            
       hr.run();
       //hr2.run();
       
       for(int indice=0;indice<100;indice++){
        System.out.println("Indice["+indice+"]: " +d.arreglo[indice]);
   
       }
      
}

}