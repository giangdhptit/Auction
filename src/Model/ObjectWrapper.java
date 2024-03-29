/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author bakhoat
 */
import java.io.Serializable;

public class ObjectWrapper implements Serializable {

    private static final long serialVersionUID = 20210811011L;
    public static final int SERVER_INFORM_CLIENT_NUMBER = 1;
    public static final int LOGIN_USER = 2;
    public static final int REPLY_LOGIN_USER = 3;
    public static final int GET_AUCTIONS = 4;
    public static final int REPLY_GET_AUCTIONS = 5;
    public static final int REGISTER_USER = 6;
    public static final int REPLY_REGISTER_USER = 7;
    

    private int performative;
    private Object data;

    public ObjectWrapper() {
        super();
    }

    public ObjectWrapper(int performative, Object data) {
        super();
        this.performative = performative;
        this.data = data;
    }

    public int getPerformative() {
        return performative;
    }

    public void setPerformative(int performative) {
        this.performative = performative;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
