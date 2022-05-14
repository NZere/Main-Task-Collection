package Task1.model;

public class PaperDecor extends Accessory {
    private double cost = 500;
    private String name = "Paper";

    public PaperDecor(Colour colour) {
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
