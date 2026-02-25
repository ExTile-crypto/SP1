import java.util.Scanner;

public class cheat {

    public static void cheatMenu() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("////CHEAT MENU//// ");
        System.out.println("1: Add fans");
        System.out.println("2: Add money");
        System.out.println("3: Add exp");
        System.out.println("4: Main menu");

        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        if (scan == 1) {
            gainFans();
        } else if (scan == 2) {
            earnMoney();
        } else if (scan == 3) {
            addEXP();
        } else if (scan == 4) {
            mainMenu.printMenu();

        }

    }

    static void gainFans() {
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        playerBandClass.band.addFans(scan);
        playerBandClass.band.checkFans();
        cheatMenu();

    }

    static void earnMoney() {
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        playerBandClass.band.addMoney(scan);
        cheatMenu();

    }

    static void addEXP() {
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        playerBandClass.band.setExp(scan);
        playerBandClass.band.checkFameLvl();
        cheatMenu();
    }

}