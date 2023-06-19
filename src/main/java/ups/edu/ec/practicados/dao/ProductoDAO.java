/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.practicados.dao;

import ups.edu.ec.practicados.idao.IProductoDAO;
import ups.edu.ec.practicados.modelo.Producto;
import ups.edu.ec.practicados.util.ListaEnlazada;

/**
 *
 * @author estem
 */
public class ProductoDAO implements IProductoDAO {

    private ListaEnlazada<Producto> inventarioDeProducto;

    public ProductoDAO() {
        this.inventarioDeProducto = new ListaEnlazada();
    }

    @Override
    public void create(Producto producto) {
        inventarioDeProducto.agregar(producto);
    }

    @Override
    public Producto read(int codigo) {
        for (int i = 0; i < inventarioDeProducto.obtenerTamano(); i++) {
            if (inventarioDeProducto.obtener(i).getCodigo() == codigo) {
                return inventarioDeProducto.obtener(i);
            }
        }
        return null;
    }

    @Override
    public void delete(int codigo) {
        for (int i = 0; i < inventarioDeProducto.obtenerTamano(); i++) {
            if (inventarioDeProducto.obtener(i).getCodigo() == codigo) {
                inventarioDeProducto.eliminar(inventarioDeProducto.obtener(i));
                break;
            }
        }
    }

    @Override
    public ListaEnlazada<Producto> findAll() {
        return inventarioDeProducto;
    }

    @Override
    public boolean comprarProducto(String nombreProducto, int cantidad) {
        for  (int i = 0; i < inventarioDeProducto.obtenerTamano(); i++) {
            if (inventarioDeProducto.obtener(i).getNombre().compareTo(nombreProducto) == 0 & inventarioDeProducto.obtener(i).getCantidadDisponible() - cantidad >= 0 ) {
                inventarioDeProducto.obtener(i).setCantidadDisponible(inventarioDeProducto.obtener(i).getCantidadDisponible() - cantidad);
                return true;
            } 
        } return false;
    }

}
