
package principal;

/**
 *
 * @author angel y edas
 * Clase nodo para una llave de tipo Field con enlaces 
 * de izquierda y derecha del nodo
 */
public class Nodo {
    
    private int key;
    private Field data;
    private Nodo left;
    private Nodo right;

    //Constructor por defecto
    public Nodo() {
    }

    //Constructor sobrecargado
    public Nodo(int key, Field data, Nodo left, Nodo right) {
        this.key = key;
        this.data = data;
        this.left = left;
        this.right = right;
    }

    //Getters & Setters de Nodo
    public Field getData() {
        return data;
    }

    public void setData(Field data) {
        this.data = data;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }
    
    public Nodo getRight(){    
        return right;
    }
    
    public void setRight(Nodo right) {
        this.right = right;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
}
