
package listatareas;

public class Tarea {
   
    private String nombre;
    private String estado = "pendiente";

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
