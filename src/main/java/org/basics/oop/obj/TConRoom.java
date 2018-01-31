package org.basics.oop.obj;

import org.basics.oop.reln.Room;

public class TConRoom extends Room {

    private String uid;
    private int id;
    private String name;

    TConRoom(String uid, int id, String name) {
        this.uid = uid;
        this.id = id;
        this.name = name;
    }

    public void showCapacity() {
        System.out.printf("Room " + name + " with ID " + id + " has 15 people capacity");
    }

    @Override
    public boolean equals(Object o){
        return this.name.equals( ((TConRoom)o).name) &&
                this.id == ((TConRoom)o).id;
    }

    @Override
    public int hashCode() {
        return id * 7 + 43;
    }
}
