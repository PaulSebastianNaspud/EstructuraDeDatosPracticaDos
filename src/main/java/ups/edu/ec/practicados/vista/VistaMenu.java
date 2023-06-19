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
        System.out.println("1. Arreglo de números");
        System.out.println("2. String sin espacios");
        System.out.println("3. Arreglo de cadenas de texto");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        return opcion;
    }

}
