package Instruments;

import Interfaces.IPlayable;

public class Drum extends Instrument implements IPlayable {
    Play play;

    public Drum(String make, String model, String color, String type) {
        super(make, model, color, type);
        this.play = play;
    }

    public String play(){
        return "Boff";
    }


}
