package modelo;

public class Usuario {

    private int id;
    private String nombreUsuario;
    private String correoElectronico;
    private String contrasenia;
    private String perfil;

    Usuario(){

    }

    public int getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
