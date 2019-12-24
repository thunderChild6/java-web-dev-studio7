package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDiscInterface {

    //constructor
    public DVD(String title, int numOfItems, String genre) {
        super(title, numOfItems, genre);
        setDiscType("DVD");
    }

    @Override
    public int choseItemToPlay(int trackNum) {
        if (trackNum <= getNumOfItems()) {
            System.out.println("Chapter " + trackNum + " is playing");
        } else {
            System.out.println("Chapter does not exist");
        }
        return trackNum;
    }

    @Override
    public void spin() {
        System.out.println(getTitle() + " is spinning!");
    }

    @Override
    public void play() {
        System.out.println(getTitle() + " is playing!");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
