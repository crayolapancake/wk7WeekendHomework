package Instruments;

public abstract class Instrument {
    private String make;
    private String model;
    private String color;
    private String type;

    public Instrument(String make, String model, String color, String type){
        this.make = make;
        this.model = model;
        this.color = color;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
        }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

//    setters?


}
