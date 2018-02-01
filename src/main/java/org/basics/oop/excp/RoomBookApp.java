package org.basics.oop.excp;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.basics.oop.reln.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *  Custom Exception
 *
 *  Exception Bottom Line (from Java 8 doc):
 *   If a client can reasonably be expected to recover from an exception,
 *   make it a checked exception.
 *   If a client cannot do anything to recover from the exception,
 *   make it an unchecked exception.
 */

interface RoomInterface {
    public void bookRoom(String name) throws RoomException;
}

public class RoomBookApp implements RoomInterface {

    public void bookRoom(String name) throws RoomException {
        if (name == null || name.equals("")) {
            throw new RoomException("Null room", 222);
        }
        // Additional checks can be done.
        // if (name.contains("MR"))

        System.out.println("Booking Room: " + name);
    }

    public static void main(String[] args) {
        RoomBookApp app = new RoomBookApp();
        try {
            app.bookRoom("");
        } catch (RoomException e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Err Code: " + e.getErrCode());
            System.out.println("Ask the user to fill in the room name");
        }

        System.out.printf("Continue to go to my UI");

        try {
            String roomName =
                    readRoomFromFile("/Users/philips/ANSE/DEV/javaproj/oop/src/main/resources/MPH001.txt");
            System.out.printf("\nRoom Name: " +roomName);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        } catch (Exception e) {
            System.out.printf(e.getLocalizedMessage());
        }

    }

    // try-with-resources JAVA - 7 and before
    static String readRoomFromFile(String path) throws IOException  {
        BufferedReader br = null;
        String str;
        try {
            br = new BufferedReader(new FileReader(path));
            str = br.readLine();
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return str;
    }

    // try-with-resources JAVA - 8
    static String readRoomFromFile8(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }


}
