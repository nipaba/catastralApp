package cz.pv168Web.dao;

import java.util.List;

import cz.pv168Web.model.Land;
import cz.pv168Web.utils.DatabaseException;

/**
 *
 * Interface for class land
 */
public interface LandDao {
   /**
    * Method to create land
    * @param land
    * @throws DatabaseException
    */
   public abstract void createLand(Land land) throws DatabaseException;

   /**
    * Method to update land
    * @param land
    * @throws DatabaseException
    */
   public abstract void updateLand(Land land) throws DatabaseException;

   /**
    * Method to remove land
    * @param land
    * @throws DatabaseException
    */
   public abstract void removeLand(Land land) throws DatabaseException;

   /**
    * 
    * @param id
    * @return land with specific id
    * @throws DatabaseException
    */
   public abstract Land getLandById(Long id) throws DatabaseException;

   /**
    * 
    * @return list of all  lands 
    * @throws DatabaseException
    */
   public abstract List<Land> getLandList() throws DatabaseException;

   /**
    * 
    * @param catastralArea
    * @return list of lands in specific catastral area
    * @throws DatabaseException
    */
   public abstract List<Land> getLandByArea(String catastralArea)
         throws DatabaseException;

   /**
    * Method to drop the land table
    * @throws DatabaseException
    */
   public abstract void dropTableLand() throws DatabaseException;

   /**
    * Method to create land table
    * @throws DatabaseException
    */
   public abstract void createTableLand() throws DatabaseException;

}