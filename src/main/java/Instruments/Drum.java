package Instruments;

import Interfaces.IPlayable;

public class Drum extends Instrument implements IPlayable {
    String make;
    String model;
    String color;
    String type;
    Play sound;
    Play play;

    public Drum(String make, String model, String color, String type) {
        super(make, model, color, type);
        this.sound = sound; //from enum
        this.play = play;   //from IPlayable
    }

    public Play getPlay(){
        return play;
    }


}
