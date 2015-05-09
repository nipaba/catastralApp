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
public enum LandType {
    
    STAVEBNI_PARCELA("Stavebni parcela");
    STAVEBNI_PARCELA("Stavebni parcela");
    STAVEBNI_PARCELA("Stavebni parcela");
    
    private String landType;
    
    private LandType(String s){
        landType = s;
    }
    
    public String getCode(){
        return landType;
    }
    
    public static String[] getLandTypeArray() {
        String[] results = new String[LandType.values().length];
        int count = 0;
        for (LandType landType  : LandType.values()) {
            results[count] = landType.getCode();
            count++;
        }
        return results;
    }
    
}

