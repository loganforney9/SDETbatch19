package org.example.class4;

public class E1NestedIf {
    public static void main(String[] args) {
        boolean mainDoor = false;
        boolean sideDoor = true;
        boolean room1 = false;
        boolean room2 = true;

        if (mainDoor) {

            if (room1) {
                System.out.println("room 1 is open");
            } else {
                System.out.println("room 1 is closed");
            }
            //if(room2) is outside the if(room1) but inside if(maindoor)
            //so even if room1 is closed we can still check door 2
            if (room2) {
                System.out.println("room 2 is open");
            } else {
                System.out.println("room 2 is clsoed");
            }


        }
        //end of the main door route
        else if (sideDoor) {
            System.out.println("main door is clsoed, try side door");
            if (room1) {
                System.out.println("room 1 open");
            } else {
                System.out.println("room 1 closed");
            }
            if (room2) {
                System.out.println("room2 is open");
            } else {
                System.out.println("room2 is closed ");
            }
        } else {
            System.out.println("both side door and main door are locked");
        }

    }
}
