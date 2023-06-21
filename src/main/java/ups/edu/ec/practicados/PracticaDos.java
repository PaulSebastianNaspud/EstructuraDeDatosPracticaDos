/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ups.edu.ec.practicados;

import ups.edu.ec.practicados.controlador.ControladorProducto;
import ups.edu.ec.practicados.dao.ProductoDAO;
import ups.edu.ec.practicados.idao.IProductoDAO;
import ups.edu.ec.practicados.modelo.Producto;
import ups.edu.ec.practicados.util.ListaEnlazada;
import ups.edu.ec.practicados.vista.VistaMenu;
import ups.edu.ec.practicados.vista.VistaProducto;
import ups.edu.ec.practicados.vista.VistaTransaccionProducto;

/**
 *
 * @author estem
 */
public class PracticaDos {

    public static void main(String[] args) {
        
        VistaProducto vistaProducto = new VistaProducto();
        VistaMenu vistaMenu = new VistaMenu();
        VistaTransaccionProducto vistaTransaccionProducto = null;

        IProductoDAO productoDAO = new ProductoDAO();
        
        ControladorProducto controladorProducto = new ControladorProducto(vistaProducto, vistaMenu, vistaTransaccionProducto, productoDAO);
        
        controladorProducto.iniiciar();
    }
}
