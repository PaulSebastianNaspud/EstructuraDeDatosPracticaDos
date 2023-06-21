/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classess.java to edit this template
 */
package ups.edu.ec.practicados.vista;

import ups.edu.ec.practicados.modelo.TransaccionProducto;
import ups.edu.ec.practicados.util.Pila;

/**
 *
 * @author estem
 */
public class VistaTransaccionProducto {

    public void imprimirPila(Pila<TransaccionProducto> pilaTransaccionProducto) {
        while (!pilaTransaccionProducto.estaVacia()) {
            TransaccionProducto transaccionProductoProcesado = pilaTransaccionProducto.procesar();

            System.out.println("Prosesando la transaccion de la pila \n\t Sale -->" + transaccionProductoProcesado);
        }
    }

}
