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

    private ListaEnlazada<Producto> listaProducto;

    public ProductoDAO() {
        this.listaProducto = new ListaEnlazada();
    }

    @Override
    public void create(Producto producto) {
        listaProducto.agregar(producto);
    }

    @Override
    public Producto read(int codigo) {
        for (int i = 0; i < listaProducto.obtenerTamano(); i++) {
            if (listaProducto.obtener(i).getCodigo() == codigo) {
                return listaProducto.obtener(i);
            }
        }
        return null;
    }

    @Override
    public void delete(int codigo) {
        for (int i = 0; i < listaProducto.obtenerTamano(); i++) {
            if (listaProducto.obtener(i).getCodigo() == codigo) {
                listaProducto.eliminar(listaProducto.obtener(i));
                break;
            }
        }
    }

    @Override
    public ListaEnlazada<Producto> findAll() {
        return listaProducto;
    }

    @Override
    public boolean comprarProducto(String nombreProducto, int cantidad) {
        for  (int i = 0; i < listaProducto.obtenerTamano(); i++) {
            if (listaProducto.obtener(i).getNombre().compareTo(nombreProducto) == 0 & listaProducto.obtener(i).getCantidadDisponible() - cantidad >= 0 ) {
                listaProducto.obtener(i).setCantidadDisponible(listaProducto.obtener(i).getCantidadDisponible() - cantidad);
                return true;
            } 
        } return false;
    }

}
