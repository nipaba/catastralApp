package cz.pv168Web.dao;

import java.util.List;

import cz.pv168Web.model.Person;
import cz.pv168Web.utils.DatabaseException;
import cz.pv168Web.utils.EntityException;

/**
 *
 * Interface for class person
 */
public interface PersonDao {

   /**
    * Method to create person
    * @param person
    * @throws DatabaseException
    */
   public abstract void createPerson(Person person) throws DatabaseException;

   /**
    * 
    * @param id
    * @return person with specific id
    * @throws DatabaseException
    */
   public abstract Person getPersonById(Long id) throws DatabaseException;

   /**
    * 
    * @param name
    * @return person with specific name
    * @throws DatabaseException
    */
   public abstract List<Person> getPersonByName(String name) throws DatabaseException;

   /**
    * 
    * @return list of all persons
    * @throws DatabaseException
    */
   public abstract List<Person> getPersonList() throws DatabaseException;
   
   /**
    * method to remove person
    * @param person
    * @throws DatabaseException
    */
   public abstract void removePerson(Person person)throws DatabaseException;
   /**
    * Method to update person
    * @param person
    * @throws DatabaseException
    */
   public abstract void updatePerson(Person person) throws DatabaseException;
   /**
    * Method to drop person table
    * @throws DatabaseException
    */
   public abstract void droptablePerson() throws DatabaseException;
   /**
    * Method to create person table
    * @throws DatabaseException
    */
   public abstract void createTablePerson() throws DatabaseException;
   
    /**
     *
     * @param person
     * @return validity of persons data
     * @throws EntityException
     */
    public abstract Boolean validatePerson(Person person) throws EntityException;
   
}