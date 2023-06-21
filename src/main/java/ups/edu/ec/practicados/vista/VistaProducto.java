/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.practicados.vista;

import java.util.Scanner;
import ups.edu.ec.practicados.modelo.Producto;
import ups.edu.ec.practicados.util.ListaEnlazada;

/**
 *
 * @author estem
 */
public class VistaProducto {
    Scanner entrada = new Scanner(System.in);
    
    public Producto create(){
        
        System.out.println("Ingreasar el codigo del prodcucto: ");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese la cantidad disponible: ");
        int cantidadDisponible = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar el nombre del producto: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingresar el precio del producto: ");
        double prcio = entrada.nextDouble();
        
        return new Producto(codigo, prcio, nombre, cantidadDisponible);
    }
    
    public void listar(ListaEnlazada<Producto> listaProductoAux){
        for (int i = 0; i < listaProductoAux.obtenerTamano(); i++) {
            System.out.println(listaProductoAux.obtener(i));
        }
    }
    
    public int eliminar(){
        System.out.println("Ingresar el codigo del producto a eliminar: ");
        return entrada.nextInt();
    }
    
    public void verProducto(Producto producto){
        System.out.println(producto);
    }
    
    public int leer(){
        System.out.println("Ingresar el codigo del producto a buscar: ");
        return entrada.nextInt();
    }
    
    public String comprarProducto(String mensaje){
        entrada.nextLine();
        System.out.println(mensaje);
        return entrada.nextLine();
    }
    
    public void productosDisponibles(ListaEnlazada<Producto> listaAuxProducto){
        System.out.println("======= Productos disponibles =======");
        for (int i = 0; i < listaAuxProducto.obtenerTamano(); i++) {
            System.out.print(listaAuxProducto.obtener(i).getNombre() + "\t");
        }
        System.out.println("");
    }
    
}
