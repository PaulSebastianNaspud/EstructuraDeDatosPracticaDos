/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.practicados.modelo;

import java.text.SimpleDateFormat;


/**
 *
 * @author estem
 */
public class TransaccionProducto extends Producto{
    
    private double precioTotal;
    private int unidades;
    private SimpleDateFormat fechaCompra;

    public TransaccionProducto() {
    }

    public TransaccionProducto(double precioTotal, int unidades, int codigo, double precio, String nombre) {
        super(codigo, precio, nombre);
        this.precioTotal = precioTotal;
        this.unidades = unidades;
        this.fechaCompra = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "TransaccionProducto{" + "precioTotal=" + precioTotal + ", unidades=" + unidades + ", fechaCompra=" + fechaCompra.get2DigitYearStart() + '}';
    }
    
}
