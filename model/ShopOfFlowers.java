package Task1.model;

import Task1.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShopOfFlowers {


    public void orderBouquet(FlowerBouquet flowerBouquet, BouquetDecor bouquetDecor) {
        View.print(View.joiningOfStrings(flowerBouquet.getInfo(),bouquetDecor.getInfo()));
        }

    public void amountBouquet(FlowerBouquet flowerBouquet, BouquetDecor bouquetDecor){
        View.print(View.joiningOfStrings(flowerBouquet.costString(),bouquetDecor.costString()));
        View.print(View.joiningOfStrings("--------------------------\nAmount: ", String.valueOf(flowerBouquet.cost()+bouquetDecor.cost()),"\n"));

    }

    public FlowerBouquet sortFlowersBySize(FlowerBouquet bouquet, double lenRange1, double lenRange2) {
        List<Flower> flowers = bouquet.getFlowers();
        List <Flower> flowersBySize = new ArrayList<>();
        FlowerBouquet bouquetBySize = new FlowerBouquet();
        for (Flower flower : flowers) {
            if (lenRange1 <= flower.getStemLen() && flower.getStemLen() <= lenRange2) {
                flowersBySize.add(flower);
            }
        }
        bouquetBySize.addFlowers(flowersBySize);
        return bouquetBySize;
        }

        public FlowerBouquet getFlowersByFresh (FlowerBouquet bouquet){
            List<Flower> flowers = bouquet.getFlowers();
            List<Flower> flowersByFresh = new ArrayList<>();
            flowersByFresh.addAll(flowers);
            FlowerBouquet bouquetBySize = new FlowerBouquet();
            for (int i = 0; i < flowersByFresh.size(); i++) {
                for (int j = 0; j < flowersByFresh.size(); j++)
                    if (flowersByFresh.get(i).getFreshCoefficient() > flowersByFresh.get(j).getFreshCoefficient()) {
                        Flower temp = flowersByFresh.get(i);
                        flowersByFresh.set(i, flowersByFresh.get(j));
                        flowersByFresh.set(j, temp);
                    }
            }
            bouquetBySize.addFlowers(flowersByFresh);
            return bouquetBySize;
        }
    }
