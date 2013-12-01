package de.hdm.jsse;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 19:12
 * To change this template use File | Settings | File Templates.
 */
public final class JSSEProtocol {
    public static final int ACTION_LOGIN = 0;
    public static final int ACTION_GET_EVENTS = 1;
    public static final int ACTION_NEW_EVENT = 2;
    public static final int ACTION_UPDATE_EVENT = 3;
    public static final int ACTION_DELETE_EVENT = 4;
    public static final int ACTION_REGISTER = 5;
    public static final int ACTION_SUBSCRIBE = 6;
    public static final int ACTION_JOIN_EVENT = 7;
    public static final int ACTION_LEAVE_EVENT = 8;

    public static final int RESPONSE_EVENTS = 0;
}
