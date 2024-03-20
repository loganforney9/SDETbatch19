package org.example.class8;

public class E1Array {
    public static void main(String[] args) {
        String [] names={"James","Matt","ubaidur","Aldolin","Ana","Silva"};

        for(String n:names){
            if (n.equals("Matt")){
                System.out.println(n +"is present");
                break;
            }
        }

    }
}
