package Task1.model;

public class Rose extends Flower{
    private double cost=1000;
    private String name = "Rose";
    public Rose(double stemLen, int freshCoefficient) {
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
