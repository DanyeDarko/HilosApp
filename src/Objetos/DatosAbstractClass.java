package Objetos;

//<editor-fold defaultstate="collapsed" desc="LIBRERIAS Y DEPENDENCIAS IMPORTADAS">
import java.util.Random;
import Interfaces.MetodosDatosInterfaz;
//</editor-fold>

public abstract class DatosAbstractClass implements MetodosDatosInterfaz { 
/* CLASE ABSTRACTA  QUE IMPLEMENTA LOS METODOS DE LA INTERFAZ  'MetodosDatosInterfaz' FUNCIONA PARA LA CREACION DE UN NUEVO 
    OBJETO DE TIPO DATO HEREDANDOLE LAS VARIABLES Y LOS METODOS DE ESTA CLASE */
                                                    

    //<editor-fold defaultstate="collapsed" desc="VARIABLES GLOBALES">
    public int[][] arreglo; // ARREGLO DE 100 POCICIONES EN EL QUE SE EFECTUARAN LAS OPERACIONES DE LOS HILOS
    int numeroAleatorio;
    int arregloLongitud;

    //</editor-fold>
    
    public void imprimirArreglo() {
        int renglon, columnas=0, filaArreglo=0, posCol=0, iteradorDimension1 = 0, iteradorDimension2 = 0;
        for (renglon = 0; renglon < ((arregloLongitud / 25) *2); renglon++) { // SI EL LARGO DEL ARREGLO ES DE 100 SE IRAN IMPRIMIENDO DE 25 RENGLONES EN 25 POR LO TANTO HABRA
            //System.out.println("1-.\tComiensa el renglon en:" +renglon+ " TOTAL DE RENGLONES "+(arregloLongitud/25)*2);                                                                          // 8 RENGLONES (100/25=4*2=8) 4 SERAN LOS NUMEROS ORIGINALES [0] Y 4 MAS LOS VARIANTES[1]
          filaArreglo = renglon % 2;
          //  System.out.println("**IMPRIME FILA:"+filaArreglo+"\tRENGLON: "+renglon+"\tVALOR INDICE DE IMRPESION: "+posCol);
             for (columnas = 0; columnas < 25; columnas++) {
                 //System.out.println("2-.\tPUNTERO FILA 0 : "+iteradorDimension1+"\t PUNTERO FILA 1:"+iteradorDimension2+"\tAPUNTADOR ESTA EN "+columnas);
               
                // System.out.print("C="+columnas+"\t")
                
                 filaArreglo = renglon % 2;
                 if (filaArreglo == 0) {                    
                  posCol = iteradorDimension1++;
                   System.out.printf("%3d ", +getArreglo()[filaArreglo][posCol]);
                  //System.out.println("4-.\tAUMENTO EN APUNTADOR DE LA FILA"+filaArreglo+"EL PUNTERO ESTA EN LA  COLUMNA ["+posCol+"]\n");
                 //System.out.print("3-.\tOBTENIENDO VALOR ->>>>>["+getArreglo()[filaArreglo][posCol]+"]  COLUMNA : "+posCol+"\n");
                 } else {
                    posCol = iteradorDimension2++;
                     System.out.printf("%3d ", +getArreglo()[filaArreglo][posCol]);
                 //  System.out.println("4-.\tAUMENTO EN APUNTADOR  DE LA FILA"+filaArreglo+"EL PUNTERO ESTA EN LA  COLUMNA ["+posCol+"] \n");
               //System.out.print("3-.\tOBTENIENDO VALOR ->>>>>["+getArreglo()[filaArreglo][posCol]+"]  COLUMNA : "+iteradorDimension2+"\n");
                 }
             }
            System.out.println("\t");
        }

    }
    
    @Override
    public int[][] generarNumeros() {
        System.out.println("GENERANDO NUMEROS ALEATORIOS...");
        Random random = new Random();  //ESTANCIA DE UN OBJETO RANDOM PARA GENERAR NUMEROS ALEATORIOS
        int[][] numerosAux = new int[2][arregloLongitud]; // CREAMOS UN ARREGLO DE DOS DIMENSIONES CON X NUMERO DE COLUMNAS
        // O POCICIONES PARA ALMACENAR LOS NUMEROS GENERADOS
        for (int indice = 0; indice < arregloLongitud; indice++) { // RECORRE EL ARREGLO Y LO LLENA DE NUMEROS ALEATORIOS DESDE LA POCICION 0 A LA 'X'           0   1  2   3 ...                                
            setNumeroAleatorio(random.nextInt(100) + 1);
            System.out.println("NUMERO : " + indice+ "->>>>[" + indice + "] ");
            //System.out.println("NUMERO : " + getNumeroAleatorio() + "->>>>[" + indice + "] ");
            //numerosAux[0][indice] = getNumeroAleatorio();
            numerosAux[0][indice]=indice;
            numerosAux[1][indice] = 0; // LA FILA 1 SE INICIALISARA EN CEROS PUESTO QUE AUN NO SE REALISAN CAMBIOS NI OPERACIONES           FILA  1 [0][0][0][0]  
        }
        System.out.println("");
        return numerosAux.clone(); // DEVUELVE UNA COPIA EXACTA DEL ARREGLO CON LOS NUMEROS ALEATORIOS
    }

    @Override
    public void decidirOperacion(int numeroHilo, int inicio, int fin) {
        int iteradorPociciones;
        for (iteradorPociciones = inicio; iteradorPociciones < fin; iteradorPociciones++) {
            switch (numeroHilo) {
                case 1:
                    getArreglo()[1][iteradorPociciones] = getArreglo()[0][iteradorPociciones] + 10;
                    break;
                case 2:
                    getArreglo()[1][iteradorPociciones] = getArreglo()[0][iteradorPociciones] - 10;
                    
                    break;
                case 3:
                    getArreglo()[1][iteradorPociciones] = getArreglo()[0][iteradorPociciones] * 10;
                    break;
                case 4:
                    getArreglo()[1][iteradorPociciones] = getArreglo()[0][iteradorPociciones] / 10;
                    break;
            }
        }
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="METODOS DE ENCAPSULAMIENTO">
    /**
     * @return the arreglo
     */
    public int[][] getArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(int[][] arreglo) {
        this.arreglo = arreglo;
    }

    /**
     * @return the numeroAleatorio
     */
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    /**
     * @param numeroAleatorio the numeroAleatorio to set
     */
    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }
    //</editor-fold> 

}
