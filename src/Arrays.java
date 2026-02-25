import java.util.ArrayList;
import java.util.Scanner;


public class Arrays {
    public static int streams;
    static ArrayList<String> songs = new ArrayList<>();


    // public class printCom {

    // int index;
    // printCom(int index){
    // this.index=index;

    //}
//}
    static ArrayList<Integer> songScores = new ArrayList<Integer>(); // Sang score for at kunne afgøre hvor mange streams sang får pr gig.
    static ArrayList<Integer> songStreams = new ArrayList<Integer>();

    static String fameLvlComm(int index) {
        index = playerBandClass.band.getFameLvl();
        ArrayList<String> fameComm = new ArrayList<>();
        fameComm.add(0, "Unknown - Playing in garages");
        fameComm.add(1, "Local Hero - Small venues await");
        fameComm.add(2, "Rising Star - Festival invitations coming in");
        fameComm.add(3, "Mainstream - Arena tours possible");
        fameComm.add(4, "Superstar - Stadium glory!");
        System.out.println(fameComm.get(index));

        return "";
    }

    static String printCom(int index) {
        index = playerBandClass.band.genreNumber;
        ArrayList<String> CommArray = new ArrayList<>();
        CommArray.add(0, "Polish underground suko!");
        CommArray.add(1, "Dumb it down!");
        CommArray.add(2, "Rock and Punk!");
        CommArray.add(3, "On and On and On");
        System.out.println(CommArray.get(index));

        return "";
    }

    static void songsAddIntro() {


        System.out.println("Choose the titles of your first 3 songs!");
        Scanner scanner1 = new Scanner(System.in);
        String scanSong = scanner1.nextLine();
        songs.add(scanSong);
        newSongScore(songs.indexOf(scanSong));
        songStreams.add(songs.indexOf(scanSong));

        System.out.println("Added to songlist: " + scanSong);
        System.out.println("2 more songs left to add");

        String scanSong1 = scanner1.nextLine();
        songs.add(scanSong1);
        newSongScore(songs.indexOf(scanSong1));
        songStreams.add(songs.indexOf(scanSong1));

        System.out.println("Added to songlist: " + scanSong1);
        System.out.println("1 more songs left to add");

        String scanSong2 = scanner1.nextLine();
        songs.add(scanSong2);
        newSongScore(songs.indexOf(scanSong2));
        songStreams.add(songs.indexOf(scanSong2));
        System.out.println("Added to songlist: " + scanSong2);


    }

    public static int getSongScore(int i) {

        return songScores.get(i);
    }

    private static void newSongScore(int index) {
        int score = 0;
        songScores.add(index, (songs.get(index).length() * 5 / 4));

    }

    public static int setSongScore(int index) {
        newSongScore(index);
        return index;
    }

    public static void delSongScore(int index) {
        songScores.remove(index);

    }

    public static void newStreams(int index) {

        songStreams.add(index, 10);
    }

    public static int getStreams(int i) {
        return Arrays.songStreams.get(i);
    }

    public static void delStreams(int i) {

        songStreams.remove(i);
    }

    public static void addGigStreams(int index, int streams) {
        Arrays.songStreams.set(index, streams + (songStreams.get(index)));
    }

    public static void songList() {
        System.out.println("There is " + Arrays.songs.size() + " songs in the repertoire");

        for (int i = 0; i < Arrays.songs.size(); i++) {
            System.out.println(i + ": " + Arrays.songs.get(i) + " Score: " + Arrays.getSongScore(i));
        }
    }
}


