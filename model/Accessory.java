package Task1.model;

public class Accessory {
    private Colour colour;

    public Accessory(Colour colour) {
        this.colour = colour;
    }

    private String name;
    private double cost;

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return  name + " = " +
                "colour=" + colour +
                ", cost=" + cost +'}';
    }
}
