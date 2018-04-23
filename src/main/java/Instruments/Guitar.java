package Instruments;

import Interfaces.IPlayable;


public class Guitar extends Instrument implements IPlayable {
    Play play;

    public Guitar(String make, String model, String color, String type){
        super(make, model, color, type);
        this.play = play;
    }

    public String play(){
        return "Twang";
    }


}

