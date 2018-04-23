package Instruments;

import Interfaces.IPlayable;
import Instruments.Sound;


public class Guitar extends Instrument implements IPlayable {
    String make;
    String model;
    String color;
    String type;
    Play play;

    public Guitar(String make, String model, String color, String type){
        super(make, model, color, type);
        this.play = play;
    }

    public Play getPlay(){
        return play;
    }


}

