import java.util.Scanner;

public class bandBattle {

    static void battleMenu() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("There is a festival coming up. Here you will battle against another band");
        System.out.println("You will be battling against: ");

        if (playerBandClass.band.getFameLvl() == 1) {
            CPUbandClass.print1CPUband();
        } else if (playerBandClass.band.getFameLvl() == 2) {
            CPUbandClass.print2CPUband();
        }
        System.out.println();
        System.out.println("Press 1 to continue: ");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        if (scan == 1) {
            battleSeq();
        }

    }

    static void battleSeq() {

            int index = playerBandClass.band.getFameLvl(); // lvl af modstander baseret på spillerens famelvl.
            System.out.println();
            System.out.println();
            System.out.println();

            if (index == 1) {
                int venueCap = 1500;

                double playerMulti = 0.6 + (Math.random() * 0.8);
                int playerAtt = (int) (playerBandClass.band.getFans() * playerMulti);
                if (playerAtt >= venueCap) {
                    playerAtt = venueCap;
                }

                double rivalMulti = 0.6 + (Math.random() * 0.8);
                int rivalAtt = (int) (CPUbandClass.CPUband1.fans * rivalMulti);
                if (rivalAtt >= venueCap) {
                    rivalAtt = venueCap;
                }

                if (((double) playerAtt / venueCap) * 100 >= 50) {
                    int randomNum = (int) (Math.random() * 50);
                    int playerFanGain = 300 + randomNum;
                    playerBandClass.band.addFans(playerFanGain);
                } else {
                    int randomNum = (int) (Math.random() * 50);
                    int playerFanGain = 100 + randomNum;
                    playerBandClass.band.addFans(playerFanGain);
                }

            if (rivalAtt / venueCap * 100 >= 50) {
                int randomNum = (int) (Math.random() * 50);
                int rivalFanGain = 300 + randomNum;
            } else {
                int randomNum = (int) (Math.random() * 50);
                int rivalFanGain = 100 + randomNum;
            }


            System.out.println("--- Festival ---");

            playerBandClass.band.bandPrintBattle();
            System.out.println(playerBandClass.band.name + " plays to " + playerAtt + "/" + venueCap);
            System.out.println();
            System.out.println(CPUbandClass.CPUband1.name + " plays to " + rivalAtt + "/" + venueCap);
            if (playerAtt> rivalAtt) {
                System.out.println(playerBandClass.band.name + " dominated the festival!");
                int festivalEarning = 500 + (int) (Math.random() * 300);
                System.out.println();
                System.out.println("You earned " + festivalEarning + "$");
                playerBandClass.band.addMoney(festivalEarning);
                System.out.println();
                System.out.println("Type 1 to return to main menu");
                Scanner scanner = new Scanner(System.in);
                int scan = scanner.nextInt();
                if (scan == 1) {
                    mainMenu.printMenu();
                } else {
                    mainMenu.printMenu();
                }


            } else {
                System.out.println(CPUbandClass.CPUband1.name + " dominated the festival!");
                int festivalEarning = 200 + (int) (Math.random() * 100);
                playerBandClass.band.addMoney(festivalEarning);
                System.out.println();
                System.out.println("You earned " + festivalEarning + "$");
                System.out.println();
                System.out.println("Type 1 to return to main menu");
                Scanner scanner = new Scanner(System.in);
                int scan = scanner.nextInt();
                if (scan == 1) {
                    mainMenu.printMenu();
                } else {
                    mainMenu.printMenu();
                }

            }


        }
    }


}
