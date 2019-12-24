package org.launchcode.studio7;

import java.util.HashMap;

import static org.launchcode.studio7.OpticalDiscInterface.diameter;
import static org.launchcode.studio7.OpticalDiscInterface.material;

public abstract class BaseDisc {

    private String title;
    private int numOfItems;
    private String genre;
    private String discType;

    //constructors
    public BaseDisc() {}

    public BaseDisc(String title, int numOfItems, String genre) {
        this.title = title;
        this.numOfItems = numOfItems;
        this.genre = genre;
    }

    //methods
    public abstract int choseItemToPlay(int itemNum);

    //toString


    @Override
    public String toString() {
        return discType + " " + title + " has " + numOfItems + " items, is of genre " + genre +
                ", is made of " + material + " with a diameter of " + diameter + ".";
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
