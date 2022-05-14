package Task1.model;

public class Flower {
    private double stemLen; //stem length
    private int freshCoefficient;
    private double cost;
    private String name = "";

    public Flower(double stemLen, int freshCoefficient) {
        this.stemLen = stemLen;
        this.freshCoefficient = freshCoefficient;
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

    public double getStemLen() {
        return stemLen;
    }

    public void setStemLen(double stemLen) {
        this.stemLen = stemLen;
    }

    public int getFreshCoefficient() {
        return freshCoefficient;
    }

    public void setFreshCoefficient(int freshCoefficient) {
        this.freshCoefficient = freshCoefficient;
    }


    public double cost() {
        if (this.stemLen < 20) {
            return this.cost * 0.75;
        } else if (this.stemLen >= 20 && this.stemLen < 25) {
            return this.cost;
        } else {
            return this.cost * 1.25;
        }
    }
    @Override
    public String toString() {
        return name + " : " +
                "stemLen=" + stemLen +
                ", freshCoefficient=" + freshCoefficient +
                ", cost=" + cost;
    }
}
