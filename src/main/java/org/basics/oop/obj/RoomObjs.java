package org.basics.oop.obj;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.basics.oop.reln.ConferenceRoom;
import org.basics.oop.reln.Room;

public class RoomObjs {

    public static void main(String[] args) {

        // Equating objects which do NOT have equals overridden.
        Room room1 = new ConferenceRoom();
        Room room2 = new ConferenceRoom();
        System.out.println("room1.equals(room2) :" + room1.equals(room2) );
        System.out.println("# code: " + (room1.hashCode() == room2.hashCode()));


        // Equating objects which have equals overridden
        Room room3 = new TConRoom("PH644",123, "Brahma");
        Room room4 = new TConRoom("MH123",123, "Brahma");
        System.out.println("\nroom3.equals(room4) :" + room3.equals(room4));
        System.out.println("# code: " + (room3.hashCode() == room4.hashCode()));

        Room room5 = new TConRoom("PH123",123, "Vishnu");
        Room room6 = new TConRoom("PH777",145, "Shiva");

        System.out.println("\nroom3.equals(room5) :" + room3.equals(room5));
        System.out.println("# code: " + (room3.hashCode() == room5.hashCode()));

        System.out.println("\nroom3.equals(room6) :" + room3.equals(room6));
        System.out.println("# code: " + (room3.hashCode() == room6.hashCode()));


        System.out.println("\nEqualsBuilder room 3 & 4 :" + EqualsBuilder.reflectionEquals(room3, room4));

        Room room32 = new TConRoom("PH644", 123, "Brahma");
        System.out.println("\nEqualsBuilder room 3 & 4 :" + EqualsBuilder.reflectionEquals(room3, room32));

        System.out.printf("\n>> ");
        room32.showCapacity();


    }
}

