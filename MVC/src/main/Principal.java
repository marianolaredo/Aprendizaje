
package main;

import controllers.Controlador;
import models.Modelo;
import views.Vista;
//Sumar y restar 2 Numeros por medio de una Interfaz Grafica
//Usando Patron Modelo Vista Controlador
//Principal instancia la clase Vista  la clase Modelo y la clase Controlador
//Hace visible a la Interfaz Grafica.

public class Principal {
    public static void main (String[] args){
        Vista vista_prueba =new Vista();
        Modelo modelo_prueba = new Modelo();
        
        Controlador controlador_prueba = new Controlador(vista_prueba, modelo_prueba);
        
        vista_prueba.setVisible(true);
       
    }
    
}
