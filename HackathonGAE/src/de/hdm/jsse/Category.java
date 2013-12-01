package de.hdm.jsse;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */

@PersistenceCapable
public class Category {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    String name;

    @Persistent
    Set<Key> subscribedPersons = new HashSet<Key>();

    @Persistent
    Set<Key> events = new HashSet<Key>();

    public Category(String name) {
        this.name = name;
    }
}
