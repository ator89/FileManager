/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author angel
 * Clase para administrar un archivo, escribir y cargar archivo binario
 * 
 */
public class adminArchivo {
    
    //Lista de archivos
    private ArrayList<Archivo> listaArchivos = new ArrayList();
    private File archivo=null;
    
    //Constructor
    public adminArchivo(String path){
        archivo= new File(path);
    }

    //Getters
    public ArrayList<Archivo> getListaArchivos() {
        return listaArchivos;
    }
    
    public File getArchivo() {
        return archivo;
    }

    //Setters
    public void setListaArchivos(ArrayList<Archivo> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    //Agregar archivo a la lista de archivos
    public void agregarArchivo(Archivo arch){
        this.listaArchivos.add(arch);
    }
    
    //Cargar el archivo binario
    public void cargarArchivo(){
        try{
            listaArchivos = new ArrayList();
            Archivo temp;
            
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while((temp=(Archivo)objeto.readObject())!=null){
                        listaArchivos.add(temp);
                    }
                }catch(EOFException e){
                    //Siempre tira esta excepción porque encuentra un final de archivo.
                }
                objeto.close();
                entrada.close();
            }
        }catch(Exception e){
            
        }
    }
    
    //Escribir archivo binario
    public void escribirArchivo(){
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try{
            fw=new FileOutputStream(archivo);
            bw=new ObjectOutputStream(fw);
            for (Archivo t : listaArchivos) {
                bw.writeObject(t);
            }
            bw.flush();//Pasarlo a ROM (haciendo vaciad de RAM a ROM)
        }catch(Exception ex){
            
        }finally{
            try{
                bw.close();
                fw.close();
            }catch(Exception e){
                
            }
        }
    }
}
