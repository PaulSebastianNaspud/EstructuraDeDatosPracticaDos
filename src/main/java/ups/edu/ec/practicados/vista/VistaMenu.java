/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.practicados.vista;

import java.util.Scanner;

/**
 *
 * @author estem
 */
public class VistaMenu {
    Scanner entrada = new Scanner(System.in);
    
    public int mostrarMenuPrincipal() {
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. Ingresar al menu del producto");
        System.out.println("2. Realizar compras");
        System.out.println("3. Ver registro de compras");
        System.out.println("0. Salir");
        
        System.out.print("Ingrese una opción: ");
        return entrada.nextInt();
    }
    
    public int mostrarMenuProducto(){
        System.out.println("===== MENU PRODUCTO =====");
        System.out.println("1. Ingresar un nuevo producto");
        System.out.println("2. Eliminar un producto");
        System.out.println("3. Buscar un producto");
        System.out.println("4. Listar todos los productos");
        System.out.println("5. Salir");
        
        System.out.print("Ingrese una opción: ");
        return entrada.nextInt();
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

}
