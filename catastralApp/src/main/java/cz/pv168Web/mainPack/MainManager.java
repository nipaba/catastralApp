/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pv168Web.mainPack;

import cz.pv168Web.dao.impl.PersonDaoImpl;
import cz.pv168Web.manager.LandManager;
import cz.pv168Web.manager.OwnershipManager;
import cz.pv168Web.manager.PersonManager;
import cz.pv168Web.manager.impl.LandManagerImpl;
import cz.pv168Web.manager.impl.OwnershipManagerImpl;
import cz.pv168Web.manager.impl.PersonManagerImpl;
import cz.pv168Web.model.Person;
import cz.pv168Web.model.Land;
import cz.pv168Web.model.Ownership;
import cz.pv168Web.utils.DatabaseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Tomas
 */
public class MainManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainManager.class);
    LandManager landManager;
    PersonManager personManager;
    OwnershipManager ownershipManager;

    /**
     * constructor
     *
     * @param ds
     */
    public MainManager(DataSource ds) {
        landManager = new LandManagerImpl(ds);
        personManager = new PersonManagerImpl(ds);
        ownershipManager = new OwnershipManagerImpl(ds);

    }

    /**
     * method to create person
     *
     * @param person
     */
    public void createPerson(Person person) {
        try {
            personManager.createPerson(person);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    /**
     * method to create land
     *
     * @param land
     */
    public void createLand(Land land) {
        try {
            landManager.createLand(land);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    /**
     * Method to create ownership
     *
     * @param ownership
     */
    public void createOwnership(Ownership ownership) {
        try {
            ownershipManager.createOwnership(ownership);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    /**
     * Method to create database
     */
    public boolean createDB() {

        try {
            personManager.createTablePerson();
            landManager.createTableLand();
            ownershipManager.createTableOwnership();
        } catch (DatabaseException ex) {
            if (ex.toString().contains("already exists")) {
                LOGGER.debug("DATABASE has been already setted up");
                return true;
            } else if (ex.toString().contains("Cannot create PoolableConnectionFactory")) {
                printError("ERROR : PLEASE SHUT DOWN OTHER RUNNING APPLICATION");
                return false;
            } else {
                
                printError("ERROR : CREATING DB" + ex.toString());
                return false;
            }

        }
        return true;
    }

    /**
     *
     * @return list of persons
     */
    public List<Person> getPersonList() {
        try {
            return personManager.getPersonList();
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    /**
     *
     * @return list of lands
     */
    public List<Land> getLandList() {
        try {
            return landManager.getLandList();
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    /**
     *
     * @return list of ownerships
     */
    public List<Ownership> getOwnershipList() {
        try {
            return ownershipManager.getOwnershipList();
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    /**
     * Method to delete the database
     */
    public void deleteDB() {
        try {
            ownershipManager.dropTableOwnership();
            landManager.dropTableLand();
            personManager.droptablePerson();
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }

    }

    /**
     * Method to remove specific person
     *
     * @param personId
     */
    public void removePerson(Long personId) {
        try {
            Person p = new Person();
            p.setPersonId(personId);

            List<Ownership> ownerships = ownershipManager.getOwnershipList();
            for (Ownership o : ownerships) {
                if (Objects.equals(o.getPersonID(), personId)) {
                    ownershipManager.removeOwnership(o);
                }
            }
            personManager.removePerson(p);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    /**
     * Method to remove specific land
     *
     * @param landID
     */
    public void removeLand(Long landID) {
        try {
            Land l = new Land();
            l.setLandID(landID);

            List<Ownership> ownerships = ownershipManager.getOwnershipList();
            for (Ownership o : ownerships) {
                if (Objects.equals(o.getPersonID(), landID)) {
                    ownershipManager.removeOwnership(o);
                }
            }
            landManager.removeLand(l);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    /**
     * Method to remove specific ownership
     *
     * @param ownershipId
     */
    public void removeOwnership(Long ownershipId) {
        try {
            Ownership o = new Ownership();
            o.setOwnerShipID(ownershipId);
            ownershipManager.removeOwnership(o);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    /**
     *
     * @param personId
     * @return person with specific id
     */
    public Person getPersonById(Long personId) {
        try {
            return personManager.getPersonById(personId);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    /**
     * Method to update person
     *
     * @param person
     */
    public void updatePerson(Person person) {
        try {
            personManager.updatePerson(person);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    /**
     *
     * @param landId
     * @return land with specific id
     */
    public Land getLandById(Long landId) {
        try {
            return landManager.getLandById(landId);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    /**
     * Method to update land
     *
     * @param land
     */
    public void updateLand(Land land) {
        try {
            landManager.updateLand(land);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    /**
     *
     * @param ownershipId
     * @return ownership with specific id
     */
    public Ownership getOwnershipById(Long ownershipId) {
        try {
            return ownershipManager.getOwnershipById(ownershipId);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    /**
     * Method to update ownership
     *
     * @param ownership
     */
    public void updateOwnership(Ownership ownership) {
        try {
            ownershipManager.updateOwnerShip(ownership);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    /**
     *
     * @return list of persons ids
     */
    public String[] getPersonIDArray() {

        try {
            List<Person> personList = personManager.getPersonList();
            String[] personArray = new String[personList.size()];
            int n = 0;

            for (Person p : personList) {
                personArray[n] = p.getPersonId() + "";
                n++;
            }
            return personArray;
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    /**
     *
     * @return list of lands ids
     */
    public String[] getLandIDArray() {

        try {
            List<Land> landList = landManager.getLandList();
            String[] landArray = new String[landList.size()];
            int n = 0;

            for (Land l : landList) {
                landArray[n] = l.getLandID() + "";
                n++;
            }
            return landArray;
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    /**
     *
     * @param personId
     * @return list of lands with specific person id
     */
    public List<Land> getLandListByPersonID(Long personId) {

        List<Land> landList = new ArrayList<>();
        try {
            List<Ownership> list = ownershipManager.getOwnershipList();
            for (Ownership o : list) {
                if (o.getPersonID().equals(personId)) {
                    landList.add(landManager.getLandById(o.getLandId()));
                }
            }
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }

        return landList;

    }

    /**
     *
     * @param landId
     * @return list of persons with specific land id
     */
    public List<Person> getPersonListByLandId(Long landId) {
        List<Person> personList = new ArrayList<>();
        try {
            List<Ownership> list = ownershipManager.getOwnershipList();
            for (Ownership o : list) {
                if (o.getLandId().equals(landId)) {
                    personList.add(personManager.getPersonById(o.getPersonID()));
                }
            }
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }

        return personList;
    }

    public List<Ownership> getOwnershipByPersonId(Long personId) {
        List<Ownership> ownerships = new ArrayList<>();
        try {
            List<Ownership> list = ownershipManager.getOwnershipList();
            for (Ownership o : list) {
                if (o.getPersonID().equals(personId)) {
                    ownerships.add(o);
                }
            }
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }

        return ownerships;

    }

    public List<Ownership> getOwnershipByLandId(Long personId) {
        List<Ownership> ownerships = new ArrayList<>();
        try {
            List<Ownership> list = ownershipManager.getOwnershipList();
            for (Ownership o : list) {
                if (o.getLandId().equals(personId)) {
                    ownerships.add(o);
                }
            }
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }

        return ownerships;

    }

    //------------------------------------------------------------------------------
    // Array transformations for tables
    /**
     *
     * @param p
     * @return
     */
    public String[] personToArray(Person p) {
        String[] list = new String[7];

        list[0] = p.getPersonId() + "";
        list[1] = p.getName() + "";
        list[2] = p.getSurname() + "";
        list[3] = p.getBirthDate() + "";
        list[4] = p.getBirthDate() + "";
        list[5] = p.getBirthNumber() + "";
        list[6] = p.getState() + "";

        return list;

    }

    /**
     *
     * @param o
     * @return array of strings of ownership
     */
    public String[] getOwnershipArray(Ownership o) {

        try {
            Person p = personManager.getPersonById(o.getPersonID());

            String[] ownershipArray = new String[8];

            ownershipArray[0] = o.getOwnerShipID() + "";
            ownershipArray[1] = p.getName();
            ownershipArray[2] = p.getSurname();
            ownershipArray[3] = p.getPersonId() + "";
            ownershipArray[4] = o.getLandId() + "";
            ownershipArray[5] = o.getStartDate().toString();
            ownershipArray[6] = o.getEndDate()==null ? "" : o.getEndDate().toString();
            ownershipArray[7] = "";

            return ownershipArray;
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    public String[] getLandArray(Land l) {
        String[] list = new String[6];

        list[0] = l.getLandID() + "";
        list[1] = l.getSize() + "";
        list[2] = l.getCatastralArea() + "";
        list[3] = l.getBuildUpArea() + "";
        list[4] = l.getType() + "";
        list[5] = l.getNotes() + "";

        return list;

    }
    //--------------------------------------------------------------------------
    //Error managing

    /**
     *
     * @param msg
     */
    private void printError(String msg) {
        LOGGER.error(msg);
        JOptionPane.showMessageDialog(null, msg, "Error with Database", JOptionPane.ERROR_MESSAGE);
    }
}
