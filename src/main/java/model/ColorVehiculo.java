package model;

public enum ColorVehiculo {
    ROJO("Rojo"), AZUL("Azul"), VERDE("Verde"), AMARILLO("Amarillo"), BLANCO("Blanco");

    private final String colorVehiculo;

    private ColorVehiculo(String colorVehiculo){
        this.colorVehiculo = colorVehiculo;
    }

    public String getColorVehiculo(){
        return colorVehiculo;
    }

    @Override
    public String toString(){
        return colorVehiculo;
    }
}
