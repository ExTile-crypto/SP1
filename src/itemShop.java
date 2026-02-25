import java.util.ArrayList;
import java.util.Scanner;

public class itemShop { // Nåede ikke at implementere funktionalitet for items.
    static ArrayList<String> itemName;
    static ArrayList<String> itemComment;
    static ArrayList<Integer> itemPrice;


    static void shopMenuPrint() {
        itemName.add("Better advertisement.");
        itemComment.add("Your gigs will have higher attendance");
        itemPrice.add(200);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        if (itemName.isEmpty()) {
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
            System.out.println("0: " + itemName.get(1) + " for:" + itemPrice.get(1) + " Effect: " + itemComment.get(1));
            System.out.println();
            System.out.println("Type in the number of whichever item youd like to buy. Type 9 to exit.");
            moneyCheck();
        }
    }

    static void moneyCheck() {
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        itemPrice.get(scan);
        if (itemPrice.get(scan) > playerBandClass.band.getMoney()) {
            System.out.println("You bought: " + itemName.get(scan));
            playerBandClass.band.items.add(itemName.get(scan));

            itemName.remove(scan);
            itemPrice.remove(scan);
            itemComment.remove(scan);

            System.out.println("Type 1 to go back to main menu");
            Scanner scanner1 = new Scanner(System.in);
            int scan1 = scanner.nextInt();
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

