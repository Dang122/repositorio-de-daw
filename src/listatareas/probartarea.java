
package listatareas;

/**
 *
 * @author alumnado
 */
public class probartarea {
    public static void main(String[] args) {
       //Llamamos al constructor
       ListaTareas lista = new ListaTareas(5);
       //Llamamos a los metodos 
       lista.agregarTarea("Comprar leche");
       lista.agregarTarea("Pasear al perro");
       lista.mostrarTareas();
       lista.completarTarea(0);
       lista.eliminarTarea(1);
       lista.mostrarTareas(); 
        
        
      
    }
    
}
