package Modelo;

import static sistematickets.SistemaTickets.listaTicket;
 //import Modelo.Ticket;
import java.util.List;
//import sistematickets.SistemaTickets;




public class Logica  {
   
public static int Sumar(List<Ticket> listaTicket){
    int sum = 0;
    try{
    for (Ticket tic : listaTicket  ) {
                sum = sum + tic.getPrecio();
    }
    }catch (Exception e) {
        System.err.println("Ocurrio una excepcion" + e.getMessage());
    }
    return sum;
}

public static String FilasVend(int numFilaInt){
   String ticketFila = ("");
     
try{
    for(Ticket tic : listaTicket){
        if(tic.getFila() ==  numFilaInt ){
           
       ticketFila = tic.toString();
        }
    } 
}catch (Exception e) {
    System.err.println("Ocurrio una excepcion" + e.getMessage());
}

return ticketFila;   

}

}
    
  

