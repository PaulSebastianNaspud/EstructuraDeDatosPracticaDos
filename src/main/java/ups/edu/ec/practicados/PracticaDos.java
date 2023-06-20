/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ups.edu.ec.practicados;

import ups.edu.ec.practicados.dao.ProductoDAO;
import ups.edu.ec.practicados.modelo.Producto;
import ups.edu.ec.practicados.util.ListaEnlazada;
import ups.edu.ec.practicados.vista.VistaProducto;

/**
 *
 * @author estem
 */
public class PracticaDos {

    public static void main(String[] args) {
        
        ProductoDAO productoDAO = new ProductoDAO();
        VistaProducto vistaProucto = new VistaProducto();
        
        productoDAO.create(new Producto(1, 85, "Doritos", 20));
        productoDAO.create(new Producto(2, 0, "Rufles", 20));
        productoDAO.create(new Producto(3, 0, "Chitos", 20));
        productoDAO.create(new Producto(4, 0, "Katabun", 20));
        
        
        productoDAO.buyProduct("Doritos", 4);
        
        ListaEnlazada<Producto> listaProducto = productoDAO.findAll();
        vistaProucto.listar(listaProducto);
        System.out.println("===============");
        System.out.println(productoDAO.pilaTransaccion());
        
        
    }
}
