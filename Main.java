package Task1;

import Task1.controller.Controller;
import Task1.model.*;
import Task1.view.View;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("Done by: Oryngozha Nazzere");
        System.out.println("------------------------------------------------");

        ShopOfFlowers shop = new ShopOfFlowers();
        View view = new View();
        Controller controller = new Controller(shop, view);
        controller.inShop();

    }
}
