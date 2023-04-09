package modelo;

import java.time.LocalDate;

public class Partido {
     private int id;
     private Localizacion localizacion;
     private LocalDate fechaHora;
     private Usuario jugador1;
     private Usuario jugador2;
     private int puntuacionJugador1;
     private int puntuacionJugador2;
     private String estado;

     Partido(){

     }


     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public Localizacion getLocalizacion() {
          return localizacion;
     }

     public void setLocalizacion(Localizacion localizacion) {
          this.localizacion = localizacion;
     }

     public LocalDate getFechaHora() {
          return fechaHora;
     }

     public void setFechaHora(LocalDate fechaHora) {
          this.fechaHora = fechaHora;
     }

     public Usuario getJugador1() {
          return jugador1;
     }

     public void setJugador1(Usuario jugador1) {
          this.jugador1 = jugador1;
     }

     public Usuario getJugador2() {
          return jugador2;
     }

     public void setJugador2(Usuario jugador2) {
          this.jugador2 = jugador2;
     }

     public int getPuntuacionJugador1() {
          return puntuacionJugador1;
     }

     public void setPuntuacionJugador1(int puntuacionJugador1) {
          this.puntuacionJugador1 = puntuacionJugador1;
     }

     public int getPuntuacionJugador2() {
          return puntuacionJugador2;
     }

     public void setPuntuacionJugador2(int puntuacionJugador2) {
          this.puntuacionJugador2 = puntuacionJugador2;
     }

     public String getEstado() {
          return estado;
     }

     public void setEstado(String estado) {
          this.estado = estado;
     }
}
