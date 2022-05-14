package Task1.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowerBouquet {
    private List<Flower> flowers;


    public FlowerBouquet() {
        flowers= new ArrayList<>();
    }

    public FlowerBouquet(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public FlowerBouquet addFlower(Flower flower){
        flowers.add(flower);
        return this;
    }
    public FlowerBouquet addFlowers(List<Flower> flower){
        flowers.addAll(flower);
        return this;
    }
    public double cost(){
        double costResult=0;
        for(Flower f:flowers){
            costResult += f.cost();
        }
        return costResult;
    }
    public String costString(){
        String costResult="";
        for(Flower f:flowers){
            costResult += "\n"+f.getName()+"("+f.cost()+") x 1 ="+ f.cost();
        }
        return costResult;
    }


    public String getInfo(){
        String infoAboutBouquet="";
        Map<String, Integer> flowersHashMap = new HashMap<>();

        for(Flower f : flowers){
            int count = flowersHashMap.containsKey(f.getName())? flowersHashMap.get(f.getName()):0;
            flowersHashMap.put(f.getName(), count+1);
        }

        for(Map.Entry<String,Integer> count : flowersHashMap.entrySet()){
            infoAboutBouquet+=count.getKey()+" x "+count.getValue() +"\n";
        }

        return infoAboutBouquet;
    }

    public List<Flower> getFlowers() {
        return this.flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }
}
