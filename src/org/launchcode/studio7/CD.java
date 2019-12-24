package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDiscInterface {


    //constructor
    public CD(String title, int numOfItems, String genre) {
        super(title, numOfItems, genre);
        setDiscType("CD");
    }

    @Override
    public int choseItemToPlay(int trackNum) {
        if (trackNum <= getNumOfItems()) {
            System.out.println("Track " + trackNum + " is playing");
        } else {
            System.out.println("Track does not exist");
        }
        return trackNum;
    }

    @Override
    public void spin() {
        System.out.println("CD is spinning");
    }

    @Override
    public void play() {
        System.out.println(getTitle() + " is playing.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
