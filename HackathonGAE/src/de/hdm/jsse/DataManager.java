package de.hdm.jsse;

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
}
