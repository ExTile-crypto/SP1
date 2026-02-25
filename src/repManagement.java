import java.util.Scanner;


public class repManagement {

    static void menu() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Press 1 for adding songs.");
        System.out.println("Press 2 for removing songs");
        System.out.println("Press 3 to release a hit single (Costs $");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        if (scan == 1) {
            addSongs();
        } else if (scan == 2) {
            removeSong();
        } else if (scan == 3) {
            releaseSingle();
        } else if (scan == 4) {
            mainMenu.printMenu();
        }
    }


    static void addSongs() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("You may add up to 3 more songs per Fame lvl.");
        if (Arrays.songs.size() < playerBandClass.band.maxSongs) {
            System.out.println("You can add " + (Arrays.songs.size() - playerBandClass.band.maxSongs) + " more songs!");
            System.out.println("Please choose a song title!");
            Scanner scanner = new Scanner(System.in);
            String song = scanner.nextLine();
            Arrays.songs.add(song);
            int last = Arrays.songs.indexOf(song);
            Arrays.setSongScore(last);
        } else {
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("You must lvl up your fame lvl before you can add more songs!");
            System.out.println("Type 1 to return to main menu: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 1) {
                mainMenu.printMenu();
            } else {
                mainMenu.printMenu();
            }
        }
    }

    static void removeSong() {
        System.out.println("You can now choose to remove any of your songs.");
        if (Arrays.songs.size() >= 1) {
            System.out.println();
            System.out.println("You can choose between the following songs:");
            Arrays.songList();
            System.out.println("Write the number of the song you wish to remove.");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            Arrays.songs.remove(index);
            Arrays.songStreams.remove(index);
            Arrays.delSongScore(index);
            Arrays.songs.sort(null);
            System.out.println("The song has been deleted. Press 1 to return to rep menu");
            Scanner scanner1 = new Scanner(System.in);
            int scan = scanner1.nextInt();
            if (scan == 1) {
                menu();
            } else {
                menu();
            }

        } else {
            mainMenu.printMenu();
            System.out.println("You must atleast have 1 song!");

        }
    }

    static void releaseSingle() {
        int expGain;
        int cost;
        int fanGain;

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("You can rent out high quality equipment to record your new single.");
        cost = playerBandClass.band.getFameLvl() ^ 2 * 99;
        System.out.println("The cost will be " + cost + " $. and you will gain XP");
        System.out.println("To release a new single write 1. To go back to the main menu write 2.");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (index == 1) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("What would you like to name your new single?");
            Scanner scanner1 = new Scanner(System.in);
            String song = scanner1.nextLine();
            Arrays.songs.add(song);
            Arrays.songScores.add(Arrays.songScores.size() + 1,
                    Arrays.setSongScore(Arrays.songScores.size() + 1));
            Arrays.newStreams(Arrays.songScores.size() + 1);

            expGain = Arrays.songScores.getLast() * playerBandClass.band.getExp();
            playerBandClass.band.setExp(expGain);
            fanGain = Arrays.songScores.getLast() * playerBandClass.band.getFans() / 7;
            playerBandClass.band.addFans(fanGain);
            System.out.println();
            System.out.println();
            System.out.println("Your new single " + Arrays.songs.getLast() + " got you " + fanGain + " new fans and " + expGain + " XP.");
            Scanner scanner2 = new Scanner(System.in);
            int scan = scanner2.nextInt();
            System.out.println("Write 1 to go back to rep menu.");
            if (scan == 1) {
                menu();
            } else {
                menu();
            }

        } else {
            mainMenu.printMenu();
        }

    }

}