
package principal;

import java.util.LinkedList;

/**
 *
 * @author angel
 */
public class Metadata {
    
    private String filename;
    private LinkedList<Field> listaCampos = new LinkedList<>();

    //Constructor por defecto
    public Metadata() {
    }

    //Constructor sobrecargado
    public Metadata(String filename) {
        this.filename = filename;
    }

    //Getters & Setters
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public LinkedList<Field> getListaCampos() {
        return listaCampos;
    }

    public void setListaCampos(LinkedList<Field> listaCampos) {
        this.listaCampos = listaCampos;
    }
    
    //agregar una lista de campos a la metadata
    public void addCampo(Field c){
        listaCampos.add(c);
    }
    
    
    
    
    
}
