import java.util.Scanner;

public class gigSim {

    static void playGig() {
        gigSimulation.gigXP();
        gigSimulation.gigFans();
        gigSimulation.gigEvent();
        gigSimulation.gigMoney();
        gigSimulation.gigResult();

        playerBandClass.band.checkFameLvl();
        playerBandClass.band.checkFans();

        System.out.println("Type 1 to go back to main menu");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        if (scan == 1) {
            mainMenu.printMenu();
        } else {
            mainMenu.printMenu();
        }
    }

    public static class gigSimulation {

        public gigSimulation() {
        }

        static int venueCap() {
            return playerBandClass.band.getMaxFans() / 2;
        }

        static int attendance() {
            if (playerBandClass.band.getFans() * playerBandClass.band.getFameLvl()>=venueCap()){
                return venueCap();
            } else {
                return playerBandClass.band.getFans() * playerBandClass.band.getFameLvl();
            }}

        static double gigScore() {
            int cap = venueCap();
            if (cap <= 0) return 0.0;
            return ((double) attendance() / cap) * 100.0;
        }

        static double gigAttendancePerc() {
            int cap = venueCap();
            if (cap <= 0) return 0.0;
            return ((double) attendance() / cap) * 100.0;
        }

        public static double gigXP() {
            int exp = attendance();
            playerBandClass.band.setExp(exp);
            return exp;
        }

        static int gigFans() {
            int fans;
            double perc = gigAttendancePerc();
            if (perc >= 80) {
                playerBandClass.band.addFans(200);
                fans = 200;
                return fans;
            } else {
                playerBandClass.band.addFans(50);
                fans = 50;
                return fans;
            }
        }

        static int gigMoney() {
            int money = attendance() * playerBandClass.band.getFameLvl();
            playerBandClass.band.addMoney(money);
            return money;
        }

        static void gigEvent() { //gig event randomiseret med Math.random.
            int randomNum = (int) (Math.random() * 3);
            if (randomNum == 0) {
                System.out.println("What an amazing concert! Big success. Fans*2!");
                playerBandClass.band.addFans(playerBandClass.band.getFans() * 2);
            } else if (randomNum == 1) {
                System.out.println("Nothing major occured at this gig.");
            } else if (randomNum == 2) {
                System.out.println("PR Disaster.");
                System.out.println("Fans-100");
                playerBandClass.band.loseFans(100);
            }
        }

        static int gigSongStreams() {
            int total = 0;
            for (int i = 0; i < Arrays.songs.size(); i++) {
                int streams = (int) (gigScore() * playerBandClass.band.getFameLvl() * attendance());
                total += streams;
                Arrays.addGigStreams(i, streams);
            }
            return total;
        }

        public static void gigResult() {
            System.out.println("EXP Gained: " + gigXP());
            System.out.println("Fans gained: " + gigFans());
            System.out.println("Money gained: " + gigMoney());
            System.out.println("Streams gained in total: " + gigSongStreams());
            System.out.println("Attendance: " + attendance() + " Attendance percent: " + gigAttendancePerc());
        }
    }
}