/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ups.edu.ec.practicados.idao;

import ups.edu.ec.practicados.modelo.Producto;
import ups.edu.ec.practicados.modelo.TransaccionProducto;
import ups.edu.ec.practicados.util.ListaEnlazada;
import ups.edu.ec.practicados.util.Pila;

/**
 *
 * @author estem
 */
public interface IProductoDAO {
    
    public void create(Producto producto);
    public Producto read(int codigo);
    public boolean delete(int codigo);
    public ListaEnlazada<Producto> findAll();
    public boolean buyProduct(String nombreProducto, int cantidad);
    
    public Pila<TransaccionProducto> pilaTransaccion();    
}
