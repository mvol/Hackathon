package com.Swarm;

import de.hdm.jsse.TransferContainer;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 23:15
 * To change this template use File | Settings | File Templates.
 */
public interface ResponseHandler {
    public void onSuccess(TransferContainer tc);
    public void onError(String errorMsg);
    public void onSuccess(String result);
}
