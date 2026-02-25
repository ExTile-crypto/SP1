public class CPUbandClass {
     static {
         new CPUband1();
     }
    static void print1CPUband() {
        System.out.println("---" + CPUband1.name + " (" + CPUband1.genre + ")" + "---");
        System.out.println("Fame lvl: " + CPUband1.fameLvl + " | Fans: " + CPUband1.fans + "/" + CPUband1.maxFans);

    }

    static void print2CPUband() {
        System.out.println("---" + CPUband2.name + " (" + CPUband2.genre + ")---");
        System.out.println("Fame lvl: " + CPUband2.fameLvl + " | Fans: " + CPUband2.fans + "/" + CPUband2.maxFans);

    }

    static class CPUband1 {
        static String name;
        static String genre;
        static int fameLvl;
        static int fans;
        static int maxFans;
        static double score;

        CPUband1() {
            name = "The Rhythm Kings";
            fameLvl = 1;
            fans = 185;
            score = (double) fans / 10;
            maxFans = fameLvl * 1000;
            genre = "Hip-hop";
        }
    }

    static class CPUband2 {
        static String name;
        static String genre;
        static int fameLvl;
        static int fans;
        static int maxFans;
        static double score;

        CPUband2() {
            fameLvl = 2;
            fans = 1300;
            score = (double) fans / 10;
            maxFans = fameLvl * 1000;
            genre = "Rock";
        }
    }
}