package de.jssm.meetmate;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 19:07
 * To change this template use File | Settings | File Templates.
 */
public class TransferContainer {
    public TransferContainer(){

    }

    public TransferContainer(int action, Map<String, Object> parameters){
        this.action = action;
        this.parameters = parameters;
    }

    public int action;
    Map<String, Object> parameters;


}
