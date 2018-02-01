package org.basics.oop.excp;


public class RoomException extends Exception {

    private int errCode ;
    private String message;

    public RoomException(String msg, int erc) {
        this.message = (msg == null) ? "Room Availability Exception " : msg;
        this.errCode = (erc == 0) ? 5010 : erc;
    }

    public String getMessage() {
        return message;
    }

    public int getErrCode() {
        return errCode;
    }


}
