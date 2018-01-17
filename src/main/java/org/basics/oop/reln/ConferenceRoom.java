package org.basics.oop.reln;

import org.basics.oop.reln.Room;

public class ConferenceRoom extends Room {

    String name = "Conf Room";

    public void showCapacity(){
        System.out.println(" 8 Persons");
    }

    @Override
    public void turnOnAC(){
        System.out.println(" Blue Star AC for your comfort!");
    }
}
