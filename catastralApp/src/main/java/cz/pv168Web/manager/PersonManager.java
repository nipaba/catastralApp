package cz.pv168Web.manager;

import java.util.List;

import cz.pv168Web.model.Person;
import cz.pv168Web.utils.DatabaseException;
import cz.pv168Web.utils.EntityException;

/**
 *
 * Interface for manager of persons
 */
public interface PersonManager {

   /**
    * Method to create person
    * @param person
    * @throws DatabaseException
    */
   public void createPerson(Person person) throws DatabaseException;
   /**
    * 
    * @param id
    * @return person with specific id
    * @throws DatabaseException
    */
   public Person getPersonById(Long id) throws DatabaseException;
   /**
    * 
    * @param name
    * @return list of persons with specific name
    * @throws DatabaseException
    */
   public List<Person> getPersonByName(String name) throws DatabaseException;
   /**
    * 
    * @return list of all persons
    * @throws DatabaseException
    */
   public List<Person> getPersonList() throws DatabaseException;
   /**
    * Method to remove person
    * @param person
    * @throws DatabaseException
    */
   public void removePerson(Person person) throws DatabaseException;
   /**
    * Method to update person
    * @param person
    * @throws DatabaseException
    */
   public void updatePerson(Person person) throws DatabaseException;
   /**
    * Method to remove person table
    * @throws DatabaseException
    */
   public void droptablePerson() throws DatabaseException;
   /**
    * Method to create person table
    * @throws DatabaseException
    */
   public void createTablePerson() throws DatabaseException;
   
    /**
     *
     * @param person
     * @return true or false based on if the persons data are valid
     * @throws EntityException
     */
    public Boolean validatePerson(Person person) throws EntityException;
}
