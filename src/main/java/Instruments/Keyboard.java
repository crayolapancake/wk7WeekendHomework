package Instruments;

import Interfaces.IPlayable;
import Instruments.Play;

public class Keyboard extends Instrument implements IPlayable {
    Play play;

    public Keyboard(String make, String model, String color, String type) {
        super(make, model, color, type);
        this.play = play;
    }

    public String play(){
        return "Plonk";
    }

    }
