/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pv168Web.mainPack;

import cz.pv168Web.gui.EntryWindow;
import cz.pv168Web.gui.MainWindow;
import cz.pv168Web.utils.ConnectorDB;
import cz.pv168Web.utils.DatabaseException;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.DataSource;

/**
 *
 * @author Tomas
 */
public class ApplicationRunner {
    
    public static void main(String [] args) {
        
        
        // SHOW ENTRY WINDOW
        
        //EntryWindow entryWindow = new EntryWindow();
        //entryWindow.show();
        
        // LOAD CONFIGURATIONS
        DataSource dataSource = ConnectorDB.initDatasource();
        
        // START DB
        MainManager mainManager = new MainManager(dataSource);
        
        try {
            mainManager.createDB();
            mainManager.connectOrCreateDB();
        } catch (DatabaseException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
        
        
        
        
        // RUN MAIN GUI 
        System.out.println("Start Aplikace");
        MainWindow mainWindow = new MainWindow(mainManager) ;
        
        mainWindow.show();
        
        
   
            
                
        
        
    }
}
