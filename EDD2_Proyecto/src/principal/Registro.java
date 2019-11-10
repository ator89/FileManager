
package principal;

import java.util.LinkedList;

public class Registro {
    
    private LinkedList<Field> lista = new LinkedList();
    
    public void agregarCampo(Field f){
        lista.add(f);
    }

    public Registro() {
    }
    
    public void display(){
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Campos: "+ lista.get(i)+ "\n");
        }
    }
    
}
