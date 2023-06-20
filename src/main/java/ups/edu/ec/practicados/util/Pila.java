/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.practicados.util;

import java.util.Stack;
import ups.edu.ec.practicados.modelo.Producto;

/**
 *
 * @author estem
 */
public class Pila<T> {

    private Stack<T> pilaGenerico;

    public Pila() {
        pilaGenerico = new Stack<>();
    }

    public void agregar(T generico) {
        pilaGenerico.push(generico);
    }

    public T procesar() {
        T genericoProcesado = pilaGenerico.pop();
        return genericoProcesado;
    }

    public T[] procesarArray() {
        T[] arregloGenerico = (T[]) new Object[pilaGenerico.size()];
        pilaGenerico.toArray(arregloGenerico);
        return arregloGenerico;
    }

    public boolean estaVacia() {
        return pilaGenerico.isEmpty();
    }

    @Override
    public String toString() {
        return "{" + pilaGenerico + '}';
    }

}
