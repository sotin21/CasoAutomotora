package main;
import model.Automotora;
import gui.VentanaMenuBienvenida;

public class Main {
    public static void main(String[] args) {
        Automotora automotora = new Automotora();
        VentanaMenuBienvenida ventana = new VentanaMenuBienvenida(automotora);
        ventana.setVisible(true);

    }
}
