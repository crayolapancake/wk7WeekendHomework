package Instruments;

public enum Play {

    GUITAR("Twang"),
    DRUM("Boff"),
    KEYBOARD("Plonk"),
    OBOE("Toot");

    private final String instrumentSound;

    Play(String instrumentSound) {
        this.instrumentSound = instrumentSound;
    }

    public String instrumentSound() {
        return instrumentSound;
    }

}
