import java.util.ArrayList;
import java.util.Scanner;

public class playerBandClass {
    public static class band {
        public static String name;
        public static int fameLvl;
        public static String genre;
        public static int genreNumber;
        public static int maxSongs;
        public static ArrayList<String> items;
        private static int fans;
        private static int maxFans;
        private static int exp;
        private static int money;
        private static boolean isActive;


        public band(String name, boolean isActive, String genre) {
            band.name = name;
            fans = 10;
            fameLvl = 1;
            maxFans = fameLvl * 1000;
            exp = 1;
            money = 50;
            band.isActive = isActive;
            band.genre = genre;
            fameLvl = 1;
            maxSongs = fameLvl * 3;

        }

        static String setName(String name) {
            System.out.println("Choose your bands name!");
            Scanner scanner = new Scanner(System.in);
            String scanName = scanner.nextLine();

            return scanName;
        }

        static String setGenre(String genre) {
            System.out.println("Choose your bands genre! Choose between the following: ");
            System.out.println("'PU': Polish Underground");
            System.out.println("'HH': Hip Hop");
            System.out.println("'PR': Punk Rock");


            Scanner scanner1 = new Scanner(System.in);
            String scanGenre = scanner1.nextLine();

            if (scanGenre.contentEquals("PU")) {
                return scanGenre;
            } else if (scanGenre.contentEquals("HH")) {
                return scanGenre;
            } else if (scanGenre.contentEquals("PR")) {
                return scanGenre;
            } else {
                setGenre(band.genre);
            }
            return "";

        }

        static void setgenreNumber() { //genre nummer for at tilknytte genre kommentar.
            if (genre.contentEquals("PU")) {
                genreNumber = 0;
            } else if (genre.contentEquals("HH")) {
                genreNumber = 1;
            } else if (genre.contentEquals("PR")) {
                genreNumber = 2;
            } else if (genre.contentEquals("HM")) {
                genreNumber = 3;
            }
        }

        static void printCom(int genreNumber) {
            System.out.println(Arrays.printCom(band.genreNumber));

            String com = band.genre;
        }

        static void printInfo() {
            System.out.println("Name: " + band.name + " Genre: " + genre + " Money: " + fans + " Money: " + money);
        }

        static void bandPrintBattle() {
            System.out.println("---" + playerBandClass.band.name + " (" + playerBandClass.band.genre + ")" + "---");
            System.out.println("Fame lvl: " + playerBandClass.band.fameLvl + " | Fans: " + playerBandClass.band.fans + "/" + playerBandClass.band.maxFans);

        }

        public static int getFameLvl() {
            return fameLvl;
        }

        public static int getFans() {
            return fans;
        }

        public static int getMaxFans() {
            return maxFans;
        }

        public static int getMoney() {
            return money;
        }

        public static int getExp() {
            return exp;
        }

        public static boolean getIsActive() {
            return isActive;
        }

        // jeg kom til at skrive index i stedet for i mange steder. Har ikke haft tid til at ændre det.

        public static int setExp(int index) {
            return exp = exp + index;
        }

        public static int addFans(int index) {
            return fans = fans + index;
        }

        public static int addMoney(int index) {
            return money = money + index;
        }

        public static int loseFans(int index) {
            return fans = fans - index;
        }


        public static void checkFameLvl() { // Check lvl up.
            if (exp > 750 * fameLvl) {
                System.out.println("Fame LVL up!");
                fameLvl++;
                System.out.println(fameLvl);
                maxFans=fameLvl*1000;
                maxSongs=fameLvl*3;
            }

        }

        //
        public static void checkFans() { // check relevance + isActive
            if (25 > (fans / maxFans) * 100) {
                System.out.println("Losing relevance!");
                if (fans <= 0) {
                    isActive = false;
                    System.out.println("Band has broken up!");
                    System.exit(1);
                }
            }
        }

        public static void createBand() {
            band one = new band(playerBandClass.band.setName(band.name), true,
                    playerBandClass.band.setGenre(band.genre));
            playerBandClass.band.setgenreNumber();
            Arrays.printCom(band.genreNumber);
            Arrays.songsAddIntro();
        }


    }

}



