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
 * Enumeration for catastral areas
 */
public enum LandCatastralArea {
    EMPTY(""),
    BRNO("Brno"),
    CESKE_BUDEJOVICE("Èeské Budìjovice"),
    HAVIROV("Haviøov"),
    HRADEC_KRALOVE("Hradec Králové"),
    LIBEREC("Liberec"),
    KLADNO("Kladno"),
    OLOMOUC("Olomouc"),
    OSTRAVA("Ostrava"),
    PARDUBICE("Pardubice"),
    PLZEN("Plzeò"),  
    PRAHA("Praha"),
    ZLIN("Zlín");

     
    private String landCatastralArea;
    
    private LandCatastralArea(String s){
        landCatastralArea = s;
    }
    
    /**
     *
     * @return string with land catastral area
     */
    public String getCode(){
        return landCatastralArea;
    }
    
    /**
     *
     * @return array of codes of catastral areas
     */
    public static String[] getLandCatastralAreaArray() {
        String[] results = new String[LandCatastralArea.values().length];
        int count = 0;
        for (LandCatastralArea landCatastralArea  : LandCatastralArea.values()) {
            results[count] = landCatastralArea.getCode();
            count++;
        }
        return results;
    }
    
    /**
     *
     * @param catastralArea
     * @return index of specific catastral area
     */
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

