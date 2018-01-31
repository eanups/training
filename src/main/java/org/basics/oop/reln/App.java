package org.basics.oop.reln;


import org.basics.oop.reln.api.MovieProjector;
import org.basics.oop.reln.api.Projector;


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

        System.out.printf("\n ** Conference Room Behavior ** \n");
        System.out.printf("Conference room name: " + newRoom.name);
        newRoom.showCapacity();
        newRoom.showLights();
        newRoom.turnOnAC(34);

        System.out.printf("\n ** Theatre Behavior ** \n");
        Theatre pvrHall = new Theatre();
        pvrHall.showCapacity();
        pvrHall.showLights();
        pvrHall.project();
        pvrHall.showMovie();

        System.out.printf("\n ** Theatre using plain Room Behavior ** \n");
        Room room1 = pvrHall;
        room1.turnOnAC(22);

        System.out.printf("\n ** Theatre using plain Projector Behavior ** \n");

        Projector projector = pvrHall;
        projector.project();

        System.out.printf("\n ** Theatre using Movie Projector Behavior **");

        MovieProjector movieProjector = pvrHall;
        movieProjector.showMovie();



    }


}
