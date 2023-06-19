/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.practicados.controlador;

import ups.edu.ec.practicados.idao.IProductoDAO;
import ups.edu.ec.practicados.modelo.Producto;
import ups.edu.ec.practicados.vista.VistaProducto;

/**
 *
 * @author estem
 */
public class ControladorProducto {
    private VistaProducto vistaProducto;
    private IProductoDAO productoDAO;
    private Producto producto;
    
    public ControladorProducto(VistaProducto vistaProducto, IProductoDAO productoDAO) {
        this.vistaProducto = vistaProducto;
        this.productoDAO = productoDAO;
    }
    
    
    
    
}
