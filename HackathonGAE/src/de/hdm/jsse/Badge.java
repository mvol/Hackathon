package de.hdm.jsse;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 11:44
 * To change this template use File | Settings | File Templates.
 */
@PersistenceCapable
public class Badge {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;


    @Persistent
    String name;

    @Persistent
    private Blob image;


}
