/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ups.edu.ec.practicados;

import ups.edu.ec.practicados.dao.ProductoDAO;
import ups.edu.ec.practicados.modelo.Producto;
import ups.edu.ec.practicados.util.ListaEnlazada;
import ups.edu.ec.practicados.vista.VistaProucto;

/**
 *
 * @author estem
 */
public class PracticaDos {

    public static void main(String[] args) {
        
        ProductoDAO productoDAO = new ProductoDAO();
        VistaProucto vistaProucto = new VistaProucto();
        
        productoDAO.create(new Producto(1, 85, "Doritos", 20));
        productoDAO.create(new Producto(2, 0, "Alo", 20));
        productoDAO.create(new Producto(3, 0, "ProdutoTes", 20));
        productoDAO.create(new Producto(4, 0, "ProductoTres", 20));
        
        productoDAO.comprarProducto("Alo", 19);
        ListaEnlazada<Producto> listaProducto = productoDAO.findAll();
        vistaProucto.productosDisponibles(listaProducto);
        
        vistaProucto.listar(listaProducto);
        
        
        
    }
}
