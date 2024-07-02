package model;
import utils.ValidadorCorreo;
import utils.ValidadorRut;

import java.util.ArrayList;

public class Automotora {
    // atributos
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Sede> listaSedes;

    // constructor
    public Automotora() {
        this.listaClientes = new ArrayList<>();
        this.listaVehiculos = new ArrayList<>();
        this.listaSedes = new ArrayList<>();
    }

    // getters y setters
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public ArrayList<Sede> getListaSedes() {
        return listaSedes;
    }

    public void setListaSedes(ArrayList<Sede> listaSedes) {
        this.listaSedes = listaSedes;
    }

    // métodos

    // metodo agregarSede
    public void agregarSede(String nombreSede, String direccionSede) {
        Sede sede = new Sede(nombreSede, direccionSede);
        this.listaSedes.add(sede);
    }

    // metodo buscarCliente
    public Cliente buscarCliente(String rut) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getRutCliente().equals(rut)) {
                return cliente;
            }
        }
        return null;
    }

    // metodo agregarCliente se debe validar el rut y se debe validar que el correo tenga un @ , valida que el cliente no exista en la lista con el metodo buscarCliente
    public boolean agregarCliente(String nombreCliente, String direccionCliente, String numeroTelefonico, String correoCliente, String rutCliente) {
        if (buscarCliente(rutCliente) == null && ValidadorRut.validarRut(rutCliente) && ValidadorCorreo.validarCorreo(correoCliente)){
            Cliente cliente = new Cliente(nombreCliente, direccionCliente, numeroTelefonico, correoCliente, rutCliente);
            this.listaClientes.add(cliente);
            return true;
        } else
            return false;
    }

    // metodo agregarVehiculo
    public void agregarVehiculo(String modelo, MarcaVehiculo marca, ColorVehiculo color, int anio, int precio, int kmRecorridos) {
        Vehiculo vehiculo = new Vehiculo(modelo, marca, color, anio, precio, kmRecorridos);
        this.listaVehiculos.add(vehiculo);
    }

    // metodo buscarVehiculo modelo
    public Vehiculo buscarVehiculoModelo(String modelo) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getModelo().equals(modelo)) {
                return vehiculo;
            }
        }
        return null;
    }

    // metodo buscarVehiculo marca
    public ArrayList<Vehiculo> buscarVehiculoMarca(MarcaVehiculo marca) {
        ArrayList<Vehiculo> vehiculosMarca = new ArrayList<>();
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMarca().equals(marca)) {
                vehiculosMarca.add(vehiculo);
            }
        }
        return vehiculosMarca;
    }

    // metodo buscarVehiculo nombre
    public ArrayList<Vehiculo> buscarVehiculoNombre(String nombre) {
        ArrayList<Vehiculo> vehiculosNombre = new ArrayList<>();
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getModelo().equals(nombre)) {
                vehiculosNombre.add(vehiculo);
            }
        }
        return vehiculosNombre;
    }
}