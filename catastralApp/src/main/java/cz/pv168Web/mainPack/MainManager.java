/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pv168Web.mainPack;

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
import java.util.List;
import java.util.Objects;
import javax.sql.DataSource;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas
 */
public class MainManager {

    LandManager landManager;
    PersonManager personManager;
    OwnershipManager ownershipManager;

    public MainManager(DataSource ds) {
        landManager = new LandManagerImpl(ds);
        personManager = new PersonManagerImpl(ds);
        ownershipManager = new OwnershipManagerImpl(ds);

    }

    public void createPerson(Person person) {
        try {
            personManager.createPerson(person);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    public void createLand(Land land) {
        try {
            landManager.createLand(land);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    public void createOwnership(Ownership ownership) {
        try {
            ownershipManager.createOwnership(ownership);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    public void createDB() {

        try {
            personManager.createTablePerson();
            landManager.createTableLand();
            ownershipManager.createTableOwnership();
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }

    }

    void connectOrCreateDB() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            personManager.createTablePerson();
            landManager.createTableLand();
            ownershipManager.createTableOwnership();
        } catch (ClassNotFoundException ex) {
            printError(ex.toString());
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }

    }

    public List<Person> getPersonList() {
        try {
            return personManager.getPersonList();
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    public List<Land> getLandList() {
        try {
            return landManager.getLandList();
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    public List<Ownership> getOwnershipList() {
        try {
            return ownershipManager.getOwnershipList();
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    public void deleteDB() {
        try {
            ownershipManager.dropTableOwnership();
            landManager.dropTableLand();
            personManager.droptablePerson();
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }

    }

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

    public void removeOwnership(Long ownershipId) {
        try {
            Ownership o = new Ownership();
            o.setOwnerShipID(ownershipId);
            ownershipManager.removeOwnership(o);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    public Person getPersonById(Long personId) {
        try {
            return personManager.getPersonById(personId);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    public void updatePerson(Person person) {
        try {
            personManager.updatePerson(person);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    public Land getLandById(Long landId) {
        try {
            return landManager.getLandById(landId);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    public void updateLand(Land land) {
        try {
            landManager.updateLand(land);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

    public Ownership getOwnershipById(Long ownershipId) {
        try {
            return ownershipManager.getOwnershipById(ownershipId);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

    public void updateOwnership(Ownership ownership) {
        try {
            ownershipManager.updateOwnerShip(ownership);
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
    }

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
            ownershipArray[6] = o.getEndDate().toString();
            ownershipArray[7] = "";

            return ownershipArray;
        } catch (DatabaseException ex) {
            printError(ex.toString());
        }
        return null;
    }

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

    private void printError(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error with Database", JOptionPane.ERROR_MESSAGE);
    }
}
