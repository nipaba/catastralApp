package cz.pv168Web.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cz.pv168Web.dao.impl.GenericDaoImpl;

/**
 *
 * Class for running the scripts
 */
public class ScriptRunner {

    /**
     * Method to load the script
     * @param resourceName
     * @return script string 
     * @throws IOException
     */
    public String loadScript(String resourceName) throws IOException{
      
      ClassLoader loader = Thread.currentThread().getContextClassLoader();
         
      InputStream in = loader.getResourceAsStream(resourceName);
      InputStreamReader is = new InputStreamReader(in);
      StringBuilder sb=new StringBuilder();
      BufferedReader br = new BufferedReader(is);
      String read = br.readLine();

      while(read != null) {
          //System.out.println(read);
          sb.append(read);
          read =br.readLine();

      }
      return sb.toString();
   }
   
    /**
     *
     * @param commands
     * @return list of commands as strings
     */
    public List<String> getListCommands(String commands){
      
      String[] poleCommands = commands.split(";");
      List < String > list = new ArrayList<String>(Arrays.asList(poleCommands));
      return list;
   }
   
    /**
     * Method to run the command
     * @param command
     */
    public void runScript(String command){
      GenericDaoImpl gen = new GenericDaoImpl(ConnectorDB.initDatasource());
      try {
         gen.connectAndExecute(command);
      } catch (DatabaseException e) {
         e.printStackTrace();
      }
   }
   
    /**
     * Method to run script
     * @param filename
     */
    public void runLoadedScript(String filename){
      String fileContent= null;
      List<String> commands = new ArrayList<String>();

      try {
         fileContent = this.loadScript(filename);
         commands = this.getListCommands(fileContent);
         
         for(String comm : commands){
            this.runScript(comm);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      
   }
}
