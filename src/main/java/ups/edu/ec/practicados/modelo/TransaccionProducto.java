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

    public TransaccionProducto(double precioTotal, int unidades, int codigo,String nombre) {
        super(codigo, nombre);
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
        StringBuilder toString = new StringBuilder();
        toString.append("======= FACTURA =======").append("\n");
        toString.append("Codigo: ").append(super.getCodigo() +"\n");
        toString.append("Nombre: ").append(super.getNombre()+ "\n" );
        toString.append("Unidades adquiridas: ").append(this.unidades+ "\n");
        toString.append("Precio total: ").append(this.precioTotal+"\n");
        toString.append("Fecha: ").append(this.fechaCompra.get2DigitYearStart()+"\n");
        toString.append("=======================");
        return toString.toString();
    }
    
}
