package cz.pv168Web.manager;

import java.util.List;

import cz.pv168Web.model.Land;
import cz.pv168Web.model.Ownership;
import cz.pv168Web.model.Person;
import cz.pv168Web.utils.DatabaseException;

public interface OwnershipManager {
   /**
    * Method to create ownership
    * @param ownership
    * @throws DatabaseException
    */
   public void createOwnership(Ownership ownership) throws DatabaseException;
   /**
    * Method to update ownership
    * @param ownership
    * @throws DatabaseException
    */
   public void updateOwnerShip(Ownership ownership) throws DatabaseException;
   /**
    * Method to remove ownership
    * @param ownership
    * @throws DatabaseException
    */
   public void removeOwnership(Ownership ownership) throws DatabaseException;
   /**
    * 
    * @return list of persons of land
    * @throws DatabaseException
    */
   public List<Person> getListOfPersonsOfLand() throws DatabaseException;
   /**
    * 
    * @return list of lands of person
    * @throws DatabaseException
    */
   public List<Land> getListOfLandsOfPerson()throws DatabaseException;
   /**
    * 
    * @return list of ownerships
    * @throws DatabaseException
    */
   public List<Ownership> getOwnershipList()throws DatabaseException;
   /**
    * 
    * @param id
    * @return ownership with specific id
    * @throws DatabaseException
    */
   public Ownership getOwnershipById(Long id)throws DatabaseException;
   /**
    * Method to create table ownership
    * @throws DatabaseException
    */
   public void createTableOwnership() throws DatabaseException;
   /**
    * Method to remove ownership table
    * @throws DatabaseException
    */
   public void dropTableOwnership() throws DatabaseException;
}
