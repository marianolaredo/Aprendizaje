
package pruebatecnicaanfitreatop2;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import pruebatecnicaanfitreatop2.logica.Cliente;
import pruebatecnicaanfitreatop2.logica.Ticket;

public class PruebaTecnicaAnfitreatoP2  {

    public static void main(String[] args) {
        List <Ticket> listaTicket = new ArrayList <>();
        
        //Creo Ticket con el constructor.
        
        Ticket  ticket1 = new Ticket(12, 2, 3, 1500, new Date(), new Date ());

        Ticket ticket2 = new Ticket(13, 2, 4, 1500, new Date(), new Date ());
        
        //Creo ticket con constructor vacio aplico encapsulamiento.
        
        Ticket ticket3 = new Ticket();
        ticket3.setNumero(10);
        ticket3.setFila(5);
        ticket3.setAsiento(5);
        ticket3.setPrecio(2300);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());
        
        //agrego tickets a la lista.

        listaTicket.add(ticket1);
        listaTicket.add(ticket2);
        listaTicket.add(ticket3);
        
        //Suma de precios de tickets.
        
        double suma = 0;
        for(Ticket tick : listaTicket){
            suma = suma + tick.getPrecio();           
        }
        System.out.println("La suma de los Tickets es de: " + suma);
        

        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero de fila que desea ver los tickets");
        int fila = teclado.nextInt();
        boolean bandera = false;
        
               
                for(Ticket tick : listaTicket){
                   if(tick.getFila()== fila) {
                      bandera = true;       
                       System.out.println("Informacion de la fila " +tick.toString());
                      } 
                 }
                if (bandera==false){
                    System.out.println("No se encontraron Tickets en la fila ");
                }
                Cliente cli = new Cliente();
                    cli.setId(1);
                    cli.setApellidos("Ramirez");
                    cli.setNombre("Roberto");
                    cli.setDni("123456789");
                    cli.getListaTicket().add(ticket1);
                   // cli.getListaTicket().add(ticket3); // Puedo asociar 2 ticket distintos al mismo cliente
           }
 }
    

