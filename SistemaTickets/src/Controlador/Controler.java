package Controlador;

import Modelo.Cliente;
import Modelo.Logica;
import Modelo.Ticket;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import Vista.Gui;
import sistematickets.SistemaTickets;



   public class Controler implements ActionListener  {

    private Ticket tick;
    private Cliente Cli;
    private final  Gui ver;
    
    public List<Ticket> listaTicket;
    public SistemaTickets resultado;
    //public static int numFilaInt;
    

    public Controler(Ticket tick, Gui ver) {
        this.tick = tick;
         this.ver = ver;
        ver.BotonSuma.addActionListener(this);
        ver.BotonFilasVendidas.addActionListener(this);

    }

    @Override
public void actionPerformed(ActionEvent e) {
    
        if (e.getSource() == ver.BotonSuma) {

            ver.CajaSumaTick.setText(String.valueOf(SistemaTickets.getResultado()));
        }

        
        if (e.getSource() == ver.BotonFilasVendidas){
                    String numFila = ver.Fila.getText() ;        
                    int numFilaInt = Integer.parseInt(numFila);
        String respuesta = Logica.FilasVend(numFilaInt);
       
    ver.InfoFila.setText( String.valueOf(respuesta));
        }
   }

}



