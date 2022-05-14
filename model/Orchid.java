package Task1.model;

public class Orchid extends Flower{
    public double cost = 1200;
    private String name = "Orchid";
    public Orchid(double stemLen, int freshCoefficient) {
        super(stemLen, freshCoefficient);
        setCost(this.cost);
        setName(this.name);
    }

    @Override
    public double getCost() {
        return this.cost;
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
