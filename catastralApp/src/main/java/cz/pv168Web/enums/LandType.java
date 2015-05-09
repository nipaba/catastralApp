/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pv168Web.enums;

/**
 *
 * @author Tomas
 */
public enum LandType {
    
    STAVEBNI_PARCELA("Stavebni parcela");
    
    private String landType;
    
    private LandType(String s){
        landType = s;
    }
    
    public String getCode(){
        return landType;
    }
    
    
}

