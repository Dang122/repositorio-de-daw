
package listatareas;

/**
 *
 * @author Daniel Alejandro Aranguren Arellano
 */
public class ListaTareas {
    
    
    private Tarea[] tareas; //Creamos el array el de tareas
    private int numerodeTareas=0; //Creamos un contador para saber el numeros de tareas

    public ListaTareas(int numero) { //Creamos un constructor donde le decimos cuantas tarea queremos hacer
        this.tareas = new Tarea[numero];
    }
    
    public void agregarTarea(String nombre) {
        Tarea tarea = new Tarea(nombre);
        tareas[numerodeTareas] = tarea;
        numerodeTareas++;
    }
    
  
    public void eliminarTarea(int indice) {
            for (int i = indice; i < numerodeTareas - 1; i++) {
                tareas[i] = tareas[i + 1]; //Lo que hacemos es que sobreescribimos sobre la que queremos eliminar
            }
            numerodeTareas--; //Restamos el contador 
    }
   

    public void completarTarea(int indice) {
            tareas[indice].setEstado("completada"); //Cambiamos el estado de la tarea 
    }

    public void mostrarTareas() {
        for (int i = 0; i < numerodeTareas; i++) {
            System.out.println((i+1)+". "+tareas[i].getNombre() + "("+tareas[i].getEstado()+")"); //Mostramos las tareas
        }
    }
    
    
    
}
