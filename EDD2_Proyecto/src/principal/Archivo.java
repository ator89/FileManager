
package principal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author angel
 * Clase "Archivo" para archivos binarios
 */



public class Archivo implements Serializable {
    int cont;// archivo1-archivo2...
    private String nombre;
    private LinkedList <Registro> lista_registros = new LinkedList<>();
    private LinkedList <Registro> registros_recuperados = new LinkedList<>();
    private static final long SerialVersionUID=777L;

    public Archivo() {
    }

    public Archivo(String nombre) {
        cont=0;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Registro> getLista_registros() {
        return lista_registros;
    }

    public void setLista_registros(LinkedList<Registro> lista_registros) {
        this.lista_registros = lista_registros;
    }
    
    public void crear_registro(){
        //se ingresa un registro 
        lista_registros.add(new Registro(""+ cont++));
        
    }
    public void listar_registros(){
        for (int i = 0; i < lista_registros.size(); i++) {
            System.out.println(lista_registros.get(i).getNombre());
        }
    }
    public void guardar_registros() throws ClassNotFoundException{
        try{
            
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(nombre));
            //escribir todo el linkedList
            escribir.writeObject(lista_registros);
            escribir.close();
            
        }catch(IOException e){
            
        }
        
    }
    public void recuperar_registros() throws ClassNotFoundException{
        
        try{
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(nombre));
            registros_recuperados=(LinkedList<Registro>)leer.readObject();
            leer.close();
        }catch(IOException e){
            
        }
    }
    
    
}
