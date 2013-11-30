package de.hdm.jsse;

import com.google.appengine.api.datastore.Key;

import javax.jdo.PersistenceManager;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 22:10
 * To change this template use File | Settings | File Templates.
 */
public class DataManager {
    private static DataManager instance = new DataManager();

    private DataManager(){}

    public static DataManager getInstance(){
        return DataManager.instance;
    }

    public boolean createUser(String username, String password, String forename, String surname){
        PersistenceManager pm = PMF.get().getPersistenceManager();

        Person newPerson = new Person(username, password, forename, surname);
        try{
            pm.makePersistent(newPerson);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally {
            pm.close();
        }

        return true;
    }

    public boolean createEvent(String name, String desc, Key category){
        PersistenceManager pm = PMF.get().getPersistenceManager();

        Event newEvent = new Event();
        try{
            pm.makePersistent(newEvent);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally {
            pm.close();
        }
        return true;
    }


    public boolean createCategory(String name){


        return true;
    }
}
