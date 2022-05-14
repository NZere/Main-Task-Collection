package Task1.view;

import Task1.model.*;

import java.util.Scanner;

public class View {
    public static void print(String output) {
        System.out.println(output);
    }

    public static String joiningOfStrings(String... output) {
        String resultOfStrings = "";
        for (String s : output) {
            resultOfStrings += s;
        }
        return resultOfStrings;
    }


    public void printGettingFlowersBySize(ShopOfFlowers shop, FlowerBouquet flowerBouquet, double lenRange1, double lenRange2) {
        System.out.println("Length( " + lenRange1 + "-" + lenRange2 + ") of Stems of Flowers: ");
        for (Flower f : (shop.sortFlowersBySize(flowerBouquet, lenRange1, lenRange2)).getFlowers()) {
            System.out.println(f.toString());
        }
    }

    public  void printSortingFlowersByFresh(ShopOfFlowers shop, FlowerBouquet flowerBouquet) {
        System.out.println("Flowers sorted by Freshness: ");
        for (Flower f : (shop.getFlowersByFresh(flowerBouquet)).getFlowers()) {
            System.out.println(f.toString() + " " + f.cost());
        }
    }
    public int[] menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("To get the list of flowers which stem is in the range:");
        System.out.println("Enter the 1st range:");
        int lenRange1=Integer.parseInt(in.nextLine());
        System.out.println("Enter the 2nd range:");
        int lenRange2=Integer.parseInt(in.nextLine());
        int [] array = {lenRange1,lenRange2};
        return array;
    }


}
