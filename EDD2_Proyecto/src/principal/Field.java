
package principal;

import java.util.HashMap;

/**
 *
 * @author angel
 * Clase campo para agregar el tipo y el nombre
 * 
 */

public class Field {
    
    private HashMap<String, String> values;
    
    //Constructor por defecto iniciando HashMap
    public Field(){
        this.values = new HashMap<String, String>();
    }
    
    public void addValue(String name, String value){
        values.put(name, value);
    }
    
    public String getValue(String name){
        return values.get(name);
    }
    
}
