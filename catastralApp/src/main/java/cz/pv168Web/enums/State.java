/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pv168Web.enums;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tomas
 */
public enum State {
    CZECH ("Czech Republic"),
    SLOVAKIA("Slovak Republic");
    
    private String state;
    
    private State(String s){
        state = s;
    }
    
    public String getCode(){
        
        return state;
    }
    
   public static String[] getStateArray() {
        String[] results = new String[State.values().length];
        int count = 0;
        for (State state  : State.values()) {
            results[count] = state.getCode();
            count++;
        }
        return results;
    }
            
}
