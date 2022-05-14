package Task1.model;

public class WrappingTape extends Accessory{
    private double cost = 200;
    private String name = "Wraping Tape";

    public WrappingTape (Colour colour) {
        super(colour);
        setCost(this.cost);
        setName(this.name);
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        super.setCost(cost);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
