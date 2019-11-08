
package principal;

/**
 *
 * @author angel
 * Definición del campo en el archivo
 * 
 */
public class FieldDefinition {
    
    //Variables privadas
    private String name;
    private FieldType type;
    private int size;
    private int size_dec;
    private boolean key;

    //Contructor por defecto
    public FieldDefinition() {
    }
    
    //Constructor sobrecargado
    public FieldDefinition(String name, FieldType type, int size, int size_dec, boolean key) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.size_dec = size_dec;
        this.key = key;
    }

    //Getter & Setters de variables privadas
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FieldType getType() {
        return type;
    }

    public void setType(FieldType type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize_dec() {
        return size_dec;
    }

    public void setSize_dec(int size_dec) {
        this.size_dec = size_dec;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }
    
    

}
