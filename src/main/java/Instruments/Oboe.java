package Instruments;

import Interfaces.IPlayable;
import Instruments.Instrument;

public class Oboe extends Instrument implements IPlayable {
    String make;
    String model;
    String color;
    String type;
    Sound sound;

    public Oboe(String make, String model, String color, String type){
        super(make, model, color, type);
        this.sound = sound;
    }
    public Sound getSound(){
        return sound;
    }

    public void canPlay() {
        return canPlay;
    }

}
