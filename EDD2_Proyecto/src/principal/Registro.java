
package principal;

import java.util.LinkedList;

public class Registro {
    String nombre;
    private LinkedList<Field> lista = new LinkedList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Field> getLista() {
        return lista;
    }

    public void setLista(LinkedList<Field> lista) {
        this.lista = lista;
    }
    
    public void agregarCampo(Field f){
        lista.add(f);
    }

    public Registro() {
    }

    public Registro(String nombre) {
        this.nombre = nombre;
    }
    
    public void display(){
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Campos: "+ lista.get(i)+ "\n");
        }
    }
    
}
