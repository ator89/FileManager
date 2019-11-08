/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.HashMap;

/**
 *
 * @author angel
 */
public class Field {
    
    private HashMap<String, String> values;
    
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
