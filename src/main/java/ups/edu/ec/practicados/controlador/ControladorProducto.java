/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.practicados.controlador;

import ups.edu.ec.practicados.idao.IProductoDAO;
import ups.edu.ec.practicados.modelo.Producto;
import ups.edu.ec.practicados.modelo.TransaccionProducto;
import ups.edu.ec.practicados.util.ListaEnlazada;
import ups.edu.ec.practicados.util.Pila;
import ups.edu.ec.practicados.vista.VistaMenu;
import ups.edu.ec.practicados.vista.VistaProducto;
import ups.edu.ec.practicados.vista.VistaTransaccionProducto;

/**
 *
 * @author estem
 */
public class ControladorProducto {

    private VistaProducto vistaProducto;
    private VistaMenu vistaMenu;
    private VistaTransaccionProducto vistaTransaccionProducto;

    private IProductoDAO productoDAO;

    private Producto producto;
    private TransaccionProducto transaccionProducto;

    public ControladorProducto(VistaProducto vistaProducto, VistaMenu vistaMenu, VistaTransaccionProducto vistaTransaccionProducto, IProductoDAO productoDAO) {
        this.vistaProducto = vistaProducto;
        this.vistaMenu = vistaMenu;
        this.vistaTransaccionProducto = vistaTransaccionProducto;
        this.productoDAO = productoDAO;
    }

    public void iniciar() {
        int opcion = -1;
        do {
            opcion = vistaMenu.mostrarMenuPrincipal();
            switch (opcion) {
                case 0-> this.vistaMenu.mostrarMensaje("Salio del programa");
                case 1-> this.menuProducto();
                case 2-> this.comprarProducto();
                case 3-> this.pila();
                default -> this.vistaMenu.mostrarMensaje("Opcion invalida!");
            }
        } while (opcion != 0);
    }

    private void menuProducto() {
        int opcionMenuProducto = -1;
        do {
            opcionMenuProducto = vistaMenu.mostrarMenuProducto();
            switch (opcionMenuProducto) {
                case 0-> this.vistaMenu.mostrarMensaje("Regreso al menu principal");
                case 1 -> this.crearProducto();
                case 2 -> this.eliminar();
                case 3 -> this.buscar();
                case 4 -> this.listar();
                default -> this.vistaMenu.mostrarMensaje("Opcion invalida!");
            }
        } while (opcionMenuProducto != 0);
    }

    private void crearProducto() {
        this.producto = vistaProducto.create();
        productoDAO.create(producto);
    }

    private void eliminar() {
        int codigo = vistaProducto.eliminar();
        boolean bandera = productoDAO.delete(codigo);
        vistaMenu.validarOperaciones(bandera, "Persona elminada!", "Persons no encontrada!");
    }

    private void comprarProducto() {
        String cantidadAux = vistaProducto.comprarProducto("Ingresar la cantidad de productos que desea comprar: ");
        int cantidad = Integer.parseInt(cantidadAux);
        String nombre = vistaProducto.comprarProducto("Ingresar el nombre del producto a comprar: ");
        boolean bandera = productoDAO.buyProduct(nombre, cantidad);
        vistaMenu.validarOperaciones(bandera, "Compra exitosa!", "Compra no realizada");
    }

    private void buscar() {
        int codigo = vistaProducto.leer();
        producto = productoDAO.read(codigo);
        vistaProducto.verProducto(producto);
        vistaMenu.validarOperaciones(producto!= null, "Persona encontrada!", "Persona no econtrada!");
    }

    private void listar() {
        vistaProducto.listar(productoDAO.findAll());
    }

    private void pila() {
        Pila<TransaccionProducto> pilaAux = productoDAO.pilaTransaccion();
        vistaTransaccionProducto.imprimirPila(pilaAux);
    }
}
