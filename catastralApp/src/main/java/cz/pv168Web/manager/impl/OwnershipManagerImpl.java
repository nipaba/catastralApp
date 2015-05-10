package cz.pv168Web.manager.impl;

import java.util.List;

import javax.sql.DataSource;

import cz.pv168Web.dao.OwnershipDao;
import cz.pv168Web.dao.impl.OwnershipDaoImpl;
import cz.pv168Web.manager.OwnershipManager;
import cz.pv168Web.model.Land;
import cz.pv168Web.model.Ownership;
import cz.pv168Web.model.Person;
import cz.pv168Web.utils.ConnectorDB;
import cz.pv168Web.utils.DatabaseException;

/**
 *
 * Class for managing ownership
 */
public class OwnershipManagerImpl implements OwnershipManager {

   private OwnershipDao ownershipDao;
   
    /**
     * constructor
     * @param ds - datasource
     */
    public OwnershipManagerImpl(DataSource ds) {
      ownershipDao = new OwnershipDaoImpl(ds);
   }
   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public void createOwnership(Ownership ownership) throws DatabaseException {
      ownershipDao.createOwnership(ownership);
   }
   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public void updateOwnerShip(Ownership ownership) throws DatabaseException{
      ownershipDao.updateOwnerShip(ownership);
   }
   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public void removeOwnership(Ownership ownership) throws DatabaseException{
      ownershipDao.removeOwnership(ownership);
   }
   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public List<Person> getListOfPersonsOfLand() throws DatabaseException{
      return ownershipDao.getListOfPersonsOfLand();
   }
   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public List<Land> getListOfLandsOfPerson() throws DatabaseException {
      return ownershipDao.getListOfLandsOfPerson();
   }
   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public List<Ownership> getOwnershipList() throws DatabaseException{
      return ownershipDao.getOwnershipList();
   }
   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public Ownership getOwnershipById(Long id) throws DatabaseException{
      return ownershipDao.getOwnershipById(id);
   }
   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public void createTableOwnership() throws DatabaseException {
      ownershipDao.createTableOwnership();
   }
   /**
    * 
     * @throws cz.pv168Web.utils.DatabaseException
    */
   public void dropTableOwnership() throws DatabaseException {
      ownershipDao.dropTableOwnership();
   }
   


}
