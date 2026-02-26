import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class itemShop { // Nåede ikke at implementere funktionalitet for items.
    static ArrayList<String> shopItemName; //
    static ArrayList<String> shopItemComment;
    static ArrayList<Integer> shopItemPrice;



    static void shopMenuPrint() {
        shopItemName = new ArrayList<>();
        shopItemComment = new ArrayList<>();
        shopItemPrice = new ArrayList<>();

        shopItemName.add("Better advertisement.");
        shopItemComment.add("Your gigs will have higher attendance");
        shopItemPrice.add(200);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        if (shopItemName.isEmpty()) {
            System.out.println("You have bought everything from the shop!");
            System.out.println("Type 1 to return to main menu.");
            Scanner scanner = new Scanner(System.in);
            int scan = scanner.nextInt();
            if (scan == 1) {
                mainMenu.printMenu();
            } else {
                mainMenu.printMenu();
            }
        } else { //Hvis jeg havde nået at tilføje flere items ville jeg bruge et loop til at printe de forskellige items.
            System.out.println("Here you can buy items to help your band in various ways");
            System.out.println("-----ITEMS-----");
            System.out.println("0: " + shopItemName.get(0) + " for:" + shopItemPrice.get(0) + " Effect: " + shopItemComment.get(0));
            System.out.println();
            System.out.println("Type in the number of whichever item youd like to buy. Type 9 to exit.");
            moneyCheck();
        }
    }

    static void moneyCheck() {
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        shopItemPrice.get(scan);
        if (shopItemPrice.get(scan) > playerBandClass.band.getMoney()) { //bruger band.getmoney metode og itemprice til at bestemme om spilleren har nok penge til item.
            System.out.println("You bought: " + shopItemName.get(scan));

            playerBandClass.band.items.add(shopItemName.get(scan)); //Tilføjer itemname til spillerens item array.


            shopItemName.remove(scan); //Sat op til at kunne have flere forskellige items i item shoppen.
            shopItemPrice.remove(scan); // Itemsne ville fx. give en multiplier eller bonus til attendance ved gigs.
            shopItemComment.remove(scan);

            System.out.println("Type 1 to go back to main menu");
            Scanner scanner1 = new Scanner(System.in);
            int scan1 = scanner1.nextInt();
            if (scan1 == 1) {
                mainMenu.printMenu();
            } else {
                mainMenu.printMenu();
            }
        } else {
            System.out.println("You dont have enough money for this item");
            System.out.println("Type 1 to go back to main menu");
            int scan1 = scanner.nextInt();
            if (scan1 == 1) {
                mainMenu.printMenu();
            } else {
                mainMenu.printMenu();
            }

        }

    }

}

