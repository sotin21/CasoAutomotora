package model;

public class Sede {
    private String nombreSede;
    private String direccionSede;

    public Sede(String nombreSede, String direccionSede) {
        this.nombreSede = nombreSede;
        this.direccionSede = direccionSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }
    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccionSede() {
        return direccionSede;
    }
    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
    }

    @Override
    public String toString() {
        return "Sede{" + "nombreSede=" + nombreSede + ", direccionSede=" + direccionSede + '}';
    }
}