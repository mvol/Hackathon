package de.jssm.meetmate;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */
@PersistenceCapable
public class Event {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    String name;

    @Persistent
    String description;

    @Persistent
    Category associatedCategory;

    @Persistent
    Set<Key> subscribedPersons;




}
