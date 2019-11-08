
package principal;

import java.io.Serializable;

/**
 *
 * @author angel
 * Clase "Archivo" para archivos binarios
 */
public class Archivo implements Serializable {
    
    private String nombre;
    
    private static final long SerialVersionUID=777L;

    public Archivo() {
    }

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
