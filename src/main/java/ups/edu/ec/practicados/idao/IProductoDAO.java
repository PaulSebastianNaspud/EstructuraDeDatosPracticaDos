/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ups.edu.ec.practicados.idao;

import ups.edu.ec.practicados.modelo.Producto;
import ups.edu.ec.practicados.util.ListaEnlazada;

/**
 *
 * @author estem
 */
public interface IProductoDAO {
    
    public void create(Producto producto);
    public Producto read(int codigo);
    public void delete(int codigo);
    public ListaEnlazada<Producto> findAll();
    
    public boolean comprarProducto(String nombreProducto, int cantidad);
    
}
