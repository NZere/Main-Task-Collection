package Task1.controller;

import Task1.model.*;
import Task1.view.View;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private ShopOfFlowers flowerShop;
    private View view;

    public void inShop(){
        BouquetDecor bouquetDecor= createAccessories();
        FlowerBouquet flowerBouquet = createFlowers();
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Bouquet contains:");
        flowerShop.orderBouquet(flowerBouquet,bouquetDecor);
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Bouquet costs:");
        flowerShop.amountBouquet(flowerBouquet,bouquetDecor);
        System.out.println("++++++++++++++++++++++++++");
        view.printSortingFlowersByFresh(flowerShop,flowerShop.getFlowersByFresh(flowerBouquet));
        System.out.println("++++++++++++++++++++++++++");
        int[] array= view.menu();
        view.printGettingFlowersBySize(flowerShop,flowerShop.sortFlowersBySize(flowerBouquet,array[0],array[1]), array[0], array[1]);

    }

    public FlowerBouquet createFlowers(){
        Flower rose1= new Rose(20, 80);
        Flower rose2= new Rose(15, 90);
        Flower rose3= new Rose(25, 88);
        Flower rose4 = new Rose(10,50);
        Flower orchid1 = new Orchid(25,100);
        FlowerBouquet flowerBouquet= new FlowerBouquet();
        flowerBouquet.addFlower(rose1);
        flowerBouquet.addFlower(rose2);
        flowerBouquet.addFlower(rose3);
        flowerBouquet.addFlower(rose4);
        flowerBouquet.addFlower(orchid1);
        return flowerBouquet;
    }
    public BouquetDecor createAccessories(){
        PaperDecor p1 = new PaperDecor(Colour.PURPLE);
        WrappingTape w1= new WrappingTape(Colour.BLACK);

        BouquetDecor bouquetDecor = new BouquetDecor();
        bouquetDecor.addAccessory(p1);
        bouquetDecor.addAccessory(w1);
        return bouquetDecor;
    }

    public ShopOfFlowers getFlowerShop() {
        return flowerShop;
    }

    public void setFlowerShop(ShopOfFlowers flowerShop) {
        this.flowerShop = flowerShop;
    }

    public Controller(ShopOfFlowers flowerShop, View view) {
        this.flowerShop = flowerShop;
        this.view = view;
    }


    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
