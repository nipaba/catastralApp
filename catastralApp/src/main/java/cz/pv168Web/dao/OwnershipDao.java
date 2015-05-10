package cz.pv168Web.dao;

import java.util.List;

import cz.pv168Web.model.Land;
import cz.pv168Web.model.Ownership;
import cz.pv168Web.model.Person;
import cz.pv168Web.utils.DatabaseException;


/**
 *
 * Interface for class ownership
 */
public interface OwnershipDao {
   /**
    * Method to create ownership
    * @param ownership
    * @throws DatabaseException
    */
   public abstract void createOwnership(Ownership ownership) throws DatabaseException;
   /**
    * Method to update ownership
    * @param ownership
    * @throws DatabaseException
    */
   public abstract void updateOwnerShip(Ownership ownership)throws DatabaseException;
   /**
    * Method to remove ownership
    * @param ownership
    * @throws DatabaseException
    */
   public abstract void removeOwnership(Ownership ownership)throws DatabaseException;
   /**
    * 
    * @return list of persons of land
    * @throws DatabaseException
    */
   public abstract List<Person> getListOfPersonsOfLand()throws DatabaseException;
   /**
    * 
    * @return list of lands of person
    * @throws DatabaseException
    */
   public abstract List<Land> getListOfLandsOfPerson()throws DatabaseException;
   /**
    * 
    * @return list of all ownerships
    * @throws DatabaseException
    */
   public abstract List<Ownership> getOwnershipList()throws DatabaseException;
   /**
    * 
    * @param id
    * @return ownership with specific id
    * @throws DatabaseException
    */
   public abstract Ownership getOwnershipById(Long id)throws DatabaseException;
   /**
    * Method to create table ownership
    * @throws DatabaseException
    */
   public abstract void createTableOwnership() throws DatabaseException;
   /**
    * Method to drop table ownership
    * @throws DatabaseException
    */
   public abstract void dropTableOwnership() throws DatabaseException;
}