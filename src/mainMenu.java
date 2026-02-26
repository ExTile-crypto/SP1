import java.util.Scanner;

public class mainMenu {




    public static void printMenu() {
        System.out.println(); //CLR SCREEN
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

// bruger forskellige metoder til at hente værdier til at printe mainmenu ud.
        System.out.println("<<<>>><<<>>>BAND SIM<<<>>><<<>>>");
        System.out.println("|||||||||BAND PROFILE|||||||||");
        System.out.println("Name: " + playerBandClass.band.name);
        System.out.println("Genre: " + playerBandClass.band.genre + "|" + Arrays.printCom(playerBandClass.band.genreNumber));
        System.out.println("Fame level: " + playerBandClass.band.getFameLvl() + " " + Arrays.fameLvlComm(playerBandClass.band.getFameLvl()));
        System.out.println("Fans: " + playerBandClass.band.getFans() + "/" + playerBandClass.band.getMaxFans());
        System.out.println("EXP: " + playerBandClass.band.getExp() + ". EXP to lvl up: " + playerBandClass.band.getFameLvl() * 2000);
        System.out.println("Money: " + playerBandClass.band.getMoney());
        System.out.println("Active: " + playerBandClass.band.getIsActive());
        playerBandClass.band.printItemInv();


        System.out.println();
        Arrays.getSongList(); // Henter songlist fra arrays klassen med getsonglist method.

        System.out.println();
        System.out.println();
        System.out.println("Enter 1 to play gig!");
        System.out.println("Enter 2 to battle another band");
        System.out.println("Enter 3 to enter repertoire management");
        System.out.println("Enter 4 to enter item shop");
        System.out.println("Enter 5 to enter cheat menu");
        Scanner scanner = new Scanner(System.in); // Beder om user input og eksekverer så metoden der er tilknyttet til det givne input
        int scan = scanner.nextInt(); // Alle større 'funktioner' af spillet har sin egen klasse for at bevare overblik over metoder og variable.
        if (scan == 1) {
            gigSim.playGig();
        } else if (scan == 2) {
            bandBattle.battleMenu();
        } else if (scan == 3) {
            repManagement.menu();
        } else if (scan == 4) {
            itemShop.shopMenuPrint();
        } else if (scan == 5) {
            cheat.cheatMenu();
        } else {
            printMenu();
        }
    }
}