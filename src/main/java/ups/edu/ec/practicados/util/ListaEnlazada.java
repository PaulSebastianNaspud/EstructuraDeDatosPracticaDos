/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.practicados.util;

/**
 *
 * @author estem
 */
public class ListaEnlazada<T> {

    private Nodo<T> cabeza;
    private int size;

    public ListaEnlazada() {
        this.cabeza = null;
        this.size = 0;
    }
    
    public Nodo<T> obtenerUltimo(){
        Nodo<T> actual = cabeza;
        while(actual != null){
            actual = actual.getSiguiente();
        }
        return actual;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        size++;
    }

    public void eliminar(T dato) {
        if (estaVacia()) {
            return;
        }

        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            size--;
            return;
        }

        Nodo<T> nodoActual = cabeza;
        while (nodoActual != null) {
            if (nodoActual.siguiente.dato.equals(dato)) {
                nodoActual.siguiente = nodoActual.siguiente.siguiente;
                size--;
                return;
            }
            nodoActual = nodoActual.siguiente;
        }
    }
    
    public T obtener(int posicion) {
        Nodo<T> nodoActual = cabeza;
        for (int i = 0; i < posicion; i++) {
            nodoActual = nodoActual.siguiente;
        }
        return nodoActual.dato;
    }
    
    public void imprimirLista() {
        Nodo<T> nodoActual = cabeza;
        while ( nodoActual != null) {
            System.out.println(nodoActual.dato);
            nodoActual = nodoActual.siguiente;
        }
    }
    
    public int obtenerTamano() {
        return size;
    }
}
