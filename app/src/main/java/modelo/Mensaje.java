package modelo;

import java.time.LocalDate;

public class Mensaje {
    private int id;
    private int idEmisor;
    private int idReceptor;
    private String contenido;
    private LocalDate fechaHora;

    Mensaje(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEmisor() {
        return idEmisor;
    }

    public void setIdEmisor(int idEmisor) {
        this.idEmisor = idEmisor;
    }

    public int getIdReceptor() {
        return idReceptor;
    }

    public void setIdReceptor(int idReceptor) {
        this.idReceptor = idReceptor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }
}
