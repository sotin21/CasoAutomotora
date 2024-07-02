package model;

public class Vehiculo {
    private String modelo;
    private MarcaVehiculo marca;
    private ColorVehiculo color;
    private int anio, precio, kmRecorridos;

    public Vehiculo(String modelo, MarcaVehiculo marca, ColorVehiculo color, int anio, int precio, int kmRecorridos) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.precio = precio;
        this.kmRecorridos = kmRecorridos;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public MarcaVehiculo getMarca() {
        return marca;
    }
    public void setMarca(MarcaVehiculo marca) {
        this.marca = marca;
    }

    public ColorVehiculo getColor() {
        return color;
    }
    public void setColor(ColorVehiculo color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }
    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    // toString
    @Override
    public String toString() {
        return  "Modelo: " + modelo + "\n" +
                "Marca: " + marca + "\n" +
                "Color: " + color + "\n" +
                "Año: " + anio + "\n" +
                "Precio: " + precio + "\n" +
                "Kilómetros recorridos: " + kmRecorridos + "\n";
    }

}