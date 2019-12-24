package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("Christmas Portrait", 10, "holiday");
        DVD myDvd = new DVD("Penelope", 20, "fantasy");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(myCd);
        myCd.spin();
        myCd.play();
        myCd.choseItemToPlay(4);
        myCd.choseItemToPlay(12);

        System.out.println(myDvd);
        myDvd.spin();
        myDvd.play();
        myDvd.choseItemToPlay(3);
        myDvd.choseItemToPlay(50);

    }
}
