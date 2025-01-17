package com.mycompany.quini;
import java.util.Arrays;

public class Quini {
  private static final int MAX = 45;
    private static final int MIN = 0;
    private static final int CANT = 6;

    public static int numeros[] = new int[CANT];
    
    

    public static int[] generarApuesta() {
        
        for (int i = 0; i <= CANT - 1; i++) {
            
           int valor = (int)generaNumeros(MIN, MAX);
            
            if( repetido(numeros,  valor) == false){

            numeros[i] = valor;
            }
               }
               Arrays.sort(numeros);
        return numeros;
    }

    
    public static boolean repetido(int [] a, int b){
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] == b){
                return true;
            }
        }
        return false;
    }
     
    public static double generaNumeros(int a, int b) {

        return Math.floor(Math.random() * (MAX - MIN + 1) + MIN);

    }

    public static void main(String[] args) {
        System.out.println("El numero aleatorio es " + generaNumeros(MIN, MAX));

       for(int k = 1; k < 5; k++){
        int apuesta[] = generarApuesta();
        System.out.println("Los numeros a apostar son " + Arrays.toString(apuesta));

       }
            
      int[] valores = LectorSqlApuestas.resultadosPasados();
        System.out.println(Arrays.toString(valores) + " Numeros de la jugada elegida ");

    }  

 
}
