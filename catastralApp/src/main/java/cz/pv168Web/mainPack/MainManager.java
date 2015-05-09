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
import cz.pv168Web.utils.DatabaseException;
import java.util.List;
import javax.sql.DataSource;

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

    public void createPerson(Person person) throws DatabaseException {
        personManager.createPerson(person);
    }

    public void createDB() throws DatabaseException {

        personManager.createTablePerson();
        landManager.createTableLand();
        ownershipManager.createTableOwnership();

    }

    void connectOrCreateDB() throws DatabaseException, ClassNotFoundException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        personManager.createTablePerson();
        landManager.createTableLand();
        ownershipManager.createTableOwnership();

    }

    public List<Person> getPersolList() throws DatabaseException {
        return personManager.getPersonList();
    }

    public void deleteDB() throws DatabaseException {
        ownershipManager.dropTableOwnership();
        landManager.dropTableLand();
        personManager.droptablePerson();
    }

    public void removePerson(Long personId) throws DatabaseException {
        Person p = new Person();
        p.setPersonId(personId);
        personManager.removePerson(p);
    }

    public Person getPersonById(Long personId) throws DatabaseException {
        return personManager.getPersonById(personId);
    }

    public void updatePerson(Person person) throws DatabaseException {
        personManager.updatePerson(person);
     }

}
