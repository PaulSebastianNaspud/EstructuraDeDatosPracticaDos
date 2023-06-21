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
    private int size;

    public Pila() {
        pilaGenerico = new Stack<>();
        this.size = 0 ;
    }

    public void agregar(T generico) {
        pilaGenerico.push(generico);
        size++;
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

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return pilaGenerico.toString();
    }

}
