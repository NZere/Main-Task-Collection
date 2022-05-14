package Task1.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BouquetDecor {
    List<Accessory> accessories;

    public BouquetDecor(){
        accessories= new ArrayList<>();
    }
    public BouquetDecor(List<Accessory> accessories) {
        this.accessories = accessories;
    }
    public BouquetDecor addAccessory(Accessory accessory){
        accessories.add(accessory);
        return this;
    }
    public double cost(){
        double costResult=0;
        for(Accessory a: accessories){
            costResult += a.getCost();
        }
        return costResult;
    }

    public String getInfo(){
        String infoAboutBouquet="";
        Map<String, Integer> decorHashMap = new HashMap<>();
        for(Accessory a : accessories){
            int count = decorHashMap.containsKey(a.getName())? decorHashMap.get(a.getName()):0;
            decorHashMap.put(a.getName(), count+1);
        }

        for(Map.Entry<String,Integer> count : decorHashMap.entrySet()){
            infoAboutBouquet+=count.getKey()+" - "+count.getValue() +"\n";
        }

        return infoAboutBouquet;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }
    public String costString(){
        String costResult="";
        for(Accessory a:accessories){
            costResult += "\n"+ a.getName()+"."+a.getColour()+"("+a.getCost()+") x 1 ="+ a.getCost();
        }
        return costResult;
    }
}
