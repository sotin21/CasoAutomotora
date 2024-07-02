package model;

public class Cliente {
    private String nombreCliente, direccionCliente, numeroTelefonico, correoCliente, rutCliente;
    public Cliente(String nombreCliente, String direccionCliente, String numeroTelefonico, String correoCliente, String rutCliente) {
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.numeroTelefonico = numeroTelefonico;
        this.correoCliente = correoCliente;
        this.rutCliente = rutCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }
    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }
    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }
    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    // toString
    @Override
    public String toString() {
        return "Cliente{" + "nombreCliente=" + nombreCliente + ", direccionCliente=" + direccionCliente + ", numeroTelefonico=" + numeroTelefonico + ", correoCliente=" + correoCliente + ", rutCliente=" + rutCliente + '}';
    }
}