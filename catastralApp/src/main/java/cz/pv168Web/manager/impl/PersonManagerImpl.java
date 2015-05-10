package cz.pv168Web.manager.impl;

import java.util.List;

import javax.sql.DataSource;

import cz.pv168Web.dao.PersonDao;
import cz.pv168Web.dao.impl.PersonDaoImpl;
import cz.pv168Web.manager.PersonManager;
import cz.pv168Web.model.Person;
import cz.pv168Web.utils.ConnectorDB;
import cz.pv168Web.utils.DatabaseException;
import cz.pv168Web.utils.EntityException;

/**
 *
 * Class for managing persons
 */
public class PersonManagerImpl implements PersonManager {

   private PersonDao personDao;

    /**
     * constructor
     * @param ds - datasource
     */
    public PersonManagerImpl(DataSource ds) {
      personDao = new PersonDaoImpl(ds);
   }

   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public void createPerson(Person person) throws DatabaseException {
      personDao.createPerson(person);
   }

   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public Person getPersonById(Long id) throws DatabaseException {
      return personDao.getPersonById(id);
   }

   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public List<Person> getPersonByName(String name) throws DatabaseException {
      return personDao.getPersonByName(name);
   }

   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public List<Person> getPersonList() throws DatabaseException {
      return personDao.getPersonList();
   }

   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public void removePerson(Person person) throws DatabaseException {
      personDao.removePerson(person);
   }

   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public void updatePerson(Person person) throws DatabaseException {
      personDao.updatePerson(person);
   }

   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public void droptablePerson() throws DatabaseException {
      personDao.droptablePerson();
   }

   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public void createTablePerson() throws DatabaseException {
      personDao.createTablePerson();
   }
   
   public Boolean validatePerson(Person person) throws EntityException{
      return personDao.validatePerson(person);
   }

}
