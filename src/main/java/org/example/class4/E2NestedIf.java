package org.example.class4;

public class E2NestedIf {
    public static void main(String[] args) {

        boolean mainDoor=true;
        boolean room1=false;
        boolean room2=false;

        if(mainDoor){

            if(room1){
                System.out.println("room1 is open");
            }else{
                System.out.println("room1 is closed");
            }
            if(room2){
                System.out.println("Room2 is open");
            }else{
                System.out.println("room 2 is closed");
            }

        }else{
            System.out.println("main door is closed");
        }



    }

}
