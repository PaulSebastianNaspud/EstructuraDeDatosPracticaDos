
package ups.edu.ec.practicados.modelo;

/**
 *
 * @author
 */
public class Producto {

    private int codigo;
    private double precio;
    private String nombre;
    private int cantidadDisponible;

    public Producto() {
    }

    public Producto(int codigo, double precio, String nombre, int cantidadDisponible) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        
        toString.append("=========  Producto =========").append("\n");
        toString.append("Cantidad Disponible: ").append(cantidadDisponible).append("\n");
        toString.append("Código: ").append(codigo).append("\n");
        toString.append("Precio: ").append(precio).append("\n");
        toString.append("Nombre: ").append(nombre).append("\n");
        toString.append("=============================");

        return toString.toString();
    }
 
}
