package DPPrototype;

import javax.swing.*;

public class Sparrow extends Bird{
    private String sound = "kitchik";
    private int legSize = 10;
    public Sparrow(){

    }
    public Sparrow(Sparrow old) {
        super(old);
        this.sound = old.sound;
        this.legSize = old.legSize;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getLegSize() {
        return legSize;
    }

    public void setLegSize(int legSize) {
        this.legSize = legSize;
    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);

    }
}

/*
* important components for prototype
* -Create copy constructor
*
*
*
*
* */