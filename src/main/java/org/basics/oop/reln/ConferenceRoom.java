package org.basics.oop.reln;

import org.basics.oop.reln.api.Projector;

public class ConferenceRoom extends Room implements Projector{

    String name = "Conf Room";

    public void showCapacity(){
        System.out.println(" 8 Persons");
    }

    @Override
    public void turnOnAC(){
        System.out.println(" Blue Star AC for your comfort!");
    }

    public void project() {
        System.out.println("Project Meeting in " + name);
    }
}
