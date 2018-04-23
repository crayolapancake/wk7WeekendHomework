package Instruments;

import Interfaces.IPlayable;
import Instruments.Sound;

public class Keyboard extends Instrument implements IPlayable {
    String make;
    String model;
    String color;
    String type;
    Sound sound;

    public Keyboard(String make, String model, String color, String type) {
        super(make, model, color, type);
        this.sound = sound;
    }

        public Sound getSound(){
            return sound;
        }

        public void canPlay(){
            return canPlay;
        }
    }
