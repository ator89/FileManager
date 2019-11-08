
package principal;

/**
 *
 * @author angel
 * Clase nodo reservando para un int
 */
public class Nodo {
    
    private int data;
    private Nodo link;

    //Constructor por defecto
    public Nodo() {
    }

    //Constructor sobrecargado
    public Nodo(int data, Nodo link) {
        this.data = data;
        this.link = link;
    }

    //Getters & Setters de Nodo
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }
    
}
