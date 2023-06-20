/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.practicados.dao;

import ups.edu.ec.practicados.idao.IProductoDAO;
import ups.edu.ec.practicados.modelo.Producto;
import ups.edu.ec.practicados.modelo.TransaccionProducto;
import ups.edu.ec.practicados.util.ListaEnlazada;
import ups.edu.ec.practicados.util.Pila;

/**
 *
 * @author estem
 */
public class ProductoDAO implements IProductoDAO {
    //la clase "ProductoDAO" simula o remplaza a la clase inventario, transaccion
    
    private ListaEnlazada<Producto> listaInventario;
    private Pila<TransaccionProducto> pilaTransccion;

    public ProductoDAO() {
        this.listaInventario = new ListaEnlazada();
        this.pilaTransccion = new Pila<>();
    }

    @Override
    public void create(Producto producto) {
        listaInventario.agregar(producto);
    }

    @Override
    public Producto read(int codigo) {
        for (int i = 0; i < listaInventario.obtenerTamano(); i++) {
            Producto producto = listaInventario.obtener(i);
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }

    @Override
    public void delete(int codigo) {
        for (int i = 0; i < listaInventario.obtenerTamano(); i++) {
            Producto producto = listaInventario.obtener(i);
            if (producto.getCodigo() == codigo) {
                listaInventario.eliminar(producto);
                break;
            }
        }
    }

    @Override
    public ListaEnlazada<Producto> findAll() {
        return listaInventario;
    }
    
    
    @Override
    public void buyProduct(String nombreProducto, int cantidad) {
        for  (int i = 0; i < listaInventario.obtenerTamano(); i++) {
            Producto producto = listaInventario.obtener(i);
            if (producto.getNombre().compareTo(nombreProducto) == 0 & producto.getCantidadDisponible() - cantidad >= 0 ) {
                listaInventario.obtener(i).setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
                this.nuevaTransaccion(new TransaccionProducto((cantidad * producto.getPrecio()), cantidad, producto.getCodigo(),producto.getPrecio(), producto.getNombre()));
            } 
        }
    }
    
    private void nuevaTransaccion(TransaccionProducto producto) {
        pilaTransccion.agregar(producto);
    }

    @Override
    public Pila<TransaccionProducto> pilaTransaccion() {
        return pilaTransccion;
    }
    
    

}
