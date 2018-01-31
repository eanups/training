package org.basics.oop.reln;


public class App {
    public static void main(String[] args) {
        // Access
        ConferenceRoom room = new ConferenceRoom();
        room.showCapacity();
        room.showLights();
        room.turnOnAC();
        room.turnOnAC(22);


        //Polymorphism

        Room newRoom = new ConferenceRoom();


    }


}
