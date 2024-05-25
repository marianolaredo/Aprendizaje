
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Modelo;
import views.Vista;

//Ejecuta las acciones para devolver resultado sobre la GUI
//Toma los datos ingresados en las Cajas de Texto 
// Llama a los metodos asociados a los Botones de la GUI

public class Controlador implements ActionListener {
  //propiedades  
    private Vista view;
    private Modelo model;
    
//Constructor
    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.Boton_suma.addActionListener(this);
        this.view.Boton_resta.addActionListener(this);
       
    }
//metodo de ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        //toma los valores de la CajaN1 y de la CajaN2
        model.setNumero_uno(Integer.parseInt(view.CajaN1.getText()));
        model.setNumero_dos(Integer.parseInt(view.CajaN2.getText()));
        
        //si se toca el boton sumar llama al metodo sumar
        if(e.getSource() == view.Boton_suma){ 
            model.sumar();
            //y muestra el resultado en la CajaRes
        view.CajaRes.setText(String.valueOf(model.getResultado()));
        // si se toca el boton restar llama al metodo restar
        }else if(e.getSource() == view.Boton_resta){
            model.restar();
            //y muestra el resultado en la CajaRes
            view.CajaRes.setText(String.valueOf(model.getResultado()));
       
    }
        
    }
  
    
}
