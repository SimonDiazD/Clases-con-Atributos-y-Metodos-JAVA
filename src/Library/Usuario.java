package Library;

public class Usuario extends Persona {
    private String numeroDeUsuario;
    private String correoElectronico;

    public Usuario(String nombre, String direccion, String telefono, String numeroDeUsuario, String correoElectronico) {
        super(nombre, direccion, telefono);
        this.numeroDeUsuario = numeroDeUsuario;
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroDeUsuario() {
        return numeroDeUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setNumeroDeUsuario(String numeroDeUsuario) {
        this.numeroDeUsuario = numeroDeUsuario;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Usuario: " + numeroDeUsuario + ", Correo Electrónico: " + correoElectronico;
    }
}
