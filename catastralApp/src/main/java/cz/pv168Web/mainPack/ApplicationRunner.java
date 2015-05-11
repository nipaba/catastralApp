/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pv168Web.mainPack;

import cz.pv168Web.gui.MainWindow;
import cz.pv168Web.utils.ConnectorDB;

import javax.sql.DataSource;

/**
 *
 * @author Tomas
 */
public class ApplicationRunner {

    public static void main(String[] args) {

        // SHOW ENTRY WINDOW
        //EntryWindow entryWindow = new EntryWindow();
        //entryWindow.show();
        // LOAD CONFIGURATIONS
        DataSource dataSource = ConnectorDB.initDatasource();

        // START DB
        MainManager mainManager = new MainManager(dataSource);

        //mainManager.createDB();
        if (mainManager.createDB()) {
            System.out.println("Start Aplikace M.A.C.E. ");
            MainWindow mainWindow = new MainWindow(mainManager);

            mainWindow.show();
        }
        else {
            System.err.println("Aplikace M.A.C.E. couldnt start");
        }

    }
}
