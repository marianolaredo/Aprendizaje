package Modelo;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private int numero;
    private int fila;
    private int asiento;
    private int precio;
    private Date fechaCompra;
    private Date fechaValidez;

    public Ticket() {
    }

    public Ticket(int numero, int fila, int asiento, int precio, Date fechaCompra, Date fechaValidez) {
        this.numero = numero;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
       
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaValidez() {
        return fechaValidez;
    }

    public void setFechaValidez(Date fechaValidez) {
        this.fechaValidez = fechaValidez;
    }
    

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", fila=" + fila + ", asiento=" + asiento + ", precio=" + precio + ", fechaCompra=" + fechaCompra + ", fechaValidez=" + fechaValidez; 
    }

}
