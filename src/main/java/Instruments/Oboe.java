package Instruments;

import Interfaces.IPlayable;

public class Oboe extends Instrument implements IPlayable {
    Play play;

    public Oboe(String make, String model, String color, String type){
        super(make, model, color, type);
        this.play = play;  //comes from iplayable
    }
    public String play(){
        return "Toot";
    }



}
























