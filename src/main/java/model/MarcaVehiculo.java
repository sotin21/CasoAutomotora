package model;
public enum MarcaVehiculo {
    TOYOTA("Toyota"), CHEVROLET("Chevrolet"), NISSAN("Nissan"), MAZDA("Mazda");

    private final String marcaVehiculo;


    private MarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    @Override
    public String toString() {
        return marcaVehiculo;
    }
}