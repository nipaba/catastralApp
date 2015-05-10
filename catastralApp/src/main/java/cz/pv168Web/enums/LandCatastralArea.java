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
public enum LandCatastralArea {
    EMPTY(""),
    BRNO("Brno"),
    PRAHA("Praha");
    
    
    private String landCatastralArea;
    
    private LandCatastralArea(String s){
        landCatastralArea = s;
    }
    
    public String getCode(){
        return landCatastralArea;
    }
    
    public static String[] getLandCatastralAreaArray() {
        String[] results = new String[LandCatastralArea.values().length];
        int count = 0;
        for (LandCatastralArea landCatastralArea  : LandCatastralArea.values()) {
            results[count] = landCatastralArea.getCode();
            count++;
        }
        return results;
    }
    
       public static int getIndexOfCatastralArea(String catastralArea){
       int count = 0;
       for (LandCatastralArea c  : LandCatastralArea.values()) {
            if (c.getCode().equalsIgnoreCase(catastralArea)){
                return count;
            }
            count++;
        }
       return 0;
               
   }
    
}

