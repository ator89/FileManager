/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author angel
 */
public class EDD2_Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Field campo1 = new Field();
        
        String atributo1 = "String";
        String valor1 = "valor1";
        
        campo1.addValue(atributo1, valor1);
        
        System.out.println("valor del attr1: " + campo1.getValue(atributo1));
    }
    
}
