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
 * Enumeration of states
 */
public enum State {
    EMPTY(""),
    CZECH ("Czech Republic"),
    SLOVAKIA("Slovak Republic");
    
    private String state;
    
    private State(String s){
        state = s;
    }
    
    /**
     *
     * @return code of state
     */
    public String getCode(){
        
        return state;
    }
    
    /**
     *
     * @return array of states
     */
    public static String[] getStateArray() {
        String[] results = new String[State.values().length];
        int count = 0;
        for (State state  : State.values()) {
            results[count] = state.getCode();
            count++;
        }
        return results;
    }
   
    /**
     *
     * @param state
     * @return index of specific state
     */
    public static int getIndexOfState(String state){
       int count = 0;
       for (State s  : State.values()) {
            if (s.getCode().equalsIgnoreCase(state)){
                return count;
            }
            count++;
        }
       return 0;
               
   }
            
}
