package sistematickets;

//import Controlador.Controler;
import Controlador.Controler;
import Modelo.Cliente;
import Modelo.Ticket;
import Modelo.Logica;
import Vista.Gui;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaTickets {

    public static List <Ticket> listaTicket;
    public static int resultado;
   public static int numFilaInt;

    public static void main(String[] args) {
        
         listaTicket = new ArrayList<>();

        Ticket ticket1 = new Ticket(100, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket(101, 3, 4, 1500, new Date(2023-12-30), new Date(2023-12-30));
        Ticket ticket4 = new Ticket(102, 4, 5, 1500, new Date(2023-12-30), new Date(2023-12-30));

        Ticket ticket3 = new Ticket();
        ticket3.setAsiento(2);
        ticket3.setNumero(103);
        ticket3.setFila(5);
        ticket3.setPrecio(2000);
        ticket3.setFechaCompra(new Date(2023 - 12 - 10));
        ticket3.setFechaValidez(new Date(2023 - 12 - 30));

        listaTicket.add(ticket1);
        listaTicket.add(ticket2);
        listaTicket.add(ticket3);
        listaTicket.add(ticket4);

        Cliente clt = new Cliente();

        clt.setId(1);
        clt.setNombre("Carlos");
        clt.setApellidos("Lopez");
        clt.setDni("98765432");

        Ticket tck = new Ticket();
        Gui vist = new Gui();
        Controler ctl = new Controler(tck, vist);

        vist.setVisible(true);
    
       resultado =  Logica.Sumar(listaTicket);
 }
 public static int getResultado() {
        return resultado;
    }

}
