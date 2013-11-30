package de.hdm.jsse;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 11:41
 * To change this template use File | Settings | File Templates.
 */

@PersistenceCapable
public class Person {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    String username;

    @Persistent
    String password;

    @Persistent
    String forename;

    @Persistent
    String surname;

    @Persistent
    Collection<Badge> badges = new LinkedList<Badge>();

    @Persistent
    Set<Key> subscribedEvents = new HashSet<Key>();

    @Persistent
    Set<Key> subscribedCategories = new HashSet<Key>();

    @Persistent
    private Blob profilePic;

    public Person(String username, String password, String forename, String surname) {
        this.username = username;
        this.password = password;
        this.forename = forename;
        this.surname = surname;
    }
}
