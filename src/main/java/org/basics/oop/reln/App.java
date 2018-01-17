package org.basics.oop.reln;

import org.basics.oop.reln.ConferenceRoom;

public class App {
    public static void main(String[] args) {
        ConferenceRoom room = new ConferenceRoom();
        room.showCapacity();
        room.showLights();
        room.turnOnAC();
        room.turnOnAC(22);

    }
}
