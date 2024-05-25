
package pruebatecnicaanfitreatop2.logica;

import java.util.List;


public class Cliente {
    private int id;
    private String dni;
    private String nombre;
    private String apellidos;
    private List<Ticket> listaTicket;

    public Cliente() {
    }

    public Cliente(int id, String dni, String nombre, String apellidos, List<Ticket> listaTicket) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.listaTicket = listaTicket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Ticket> getListaTicket() {
        return listaTicket;
    }

    public void setListaTicket(List<Ticket> listaTicket) {
        this.listaTicket = listaTicket;
    }
    
    
    
    
}
