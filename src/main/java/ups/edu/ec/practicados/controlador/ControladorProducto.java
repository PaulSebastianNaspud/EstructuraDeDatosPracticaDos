/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.practicados.controlador;

import ups.edu.ec.practicados.idao.IProductoDAO;
import ups.edu.ec.practicados.modelo.Producto;
import ups.edu.ec.practicados.modelo.TransaccionProducto;
import ups.edu.ec.practicados.util.ListaEnlazada;
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

    public void iniiciar() {
        int opcion = -1;
        do {
            opcion = vistaMenu.mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    do {
                        opcion = vistaMenu.mostrarMenuProducto();
                        switch (opcion) {
                            case 1 -> this.crearProducto();
                            case 2 -> this.eliminar();
                            case 3 -> this.buscar();
                            case 4 -> this.listar();
                        }
                    }while (opcion!= 5);
                    break;
                case 2:
                    this.comprarProducto();
                    break;
                case 3: 
                    this.pila();
                default:
                    vistaMenu.mostrarMensaje("Opcion invalida!");
            }
        }while (opcion!=0);

    }

    private void crearProducto() {
        this.producto = vistaProducto.create();
        productoDAO.create(producto);
    }

    private void eliminar() {
        String codigo = vistaProducto.eliminar();
        boolean bandera = productoDAO.delete(Integer.parseInt(codigo));
        vistaProducto.validarOperaciones(bandera, "Persona elminada!", "Persons no encontrada!");
    }

    private void comprarProducto() {
        String cantidad = vistaProducto.comprarProducto("Ingresar la cantidad de prodctos que desea comprar: ");
        String nombre = vistaProducto.comprarProducto("Ingresar el nombre del producto a comprar: ");
        boolean bandera = productoDAO.buyProduct(nombre, Integer.parseInt(cantidad));
        vistaProducto.validarOperaciones(bandera, "Compra exitosa!", "Datos ingresados incorrectos");
    }

    private void buscar() {
        String nombre = vistaProducto.leer();
        producto = productoDAO.read(Integer.parseInt(nombre));
        vistaProducto.verProducto(producto);
    }

    private void listar() {
        vistaProducto.listar(productoDAO.findAll());
    }

    private void pila() {
        vistaTransaccionProducto.imprimirPila(productoDAO.pilaTransaccion());
    }
}
