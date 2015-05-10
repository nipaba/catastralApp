package cz.pv168Web.manager;
import java.util.List;

import cz.pv168Web.model.Land;
import cz.pv168Web.utils.DatabaseException;

/**
 * 
 * Interface for land manager
 */
public interface LandManager {
	/**
	  * Method to create land
	  * @param land 
	  * @throws DatabaseException
	  */
   public  void createLand(Land land) throws DatabaseException;
	/**
	  * Method to update land
	  * @param land
	  * @throws DatabaseException
	  */
   public  void updateLand(Land land) throws DatabaseException;
	/**
	  * Method to remove land
	  * @param land
	  * @throws DatabaseException
	  */
   public  void removeLand(Land land) throws DatabaseException;
   /**
    * 
    * @param id
    * @return land with specific id
    * @throws DatabaseException
    */
   public  Land getLandById(Long id) throws DatabaseException;
   /**
    * 
    * @return list of all lands
    * @throws DatabaseException
    */
   public  List<Land> getLandList() throws DatabaseException;
   /**
    * 
    * @param catastralArea
    * @return list of lands with specific area
    * @throws DatabaseException
    */
   public  List<Land> getLandByArea(String catastralArea) throws DatabaseException;
   
    /**
     * Method to remove table land from db
     * @throws DatabaseException
     */
    public void dropTableLand() throws DatabaseException;
   
    /**
     * Method to create table Land in db
     * @throws DatabaseException
     */
    public void createTableLand() throws DatabaseException;
}
