public class main1 {
    void main() {
            String empty = ("");


            String bandName = ("Ostehapserne");
            //Band profile
            int fans = (10000);
            int maxFans = (50000);
            int fameLevel = (3);
            int exp = (9600);
            double money = (7800.25);
            boolean isActive = (true);
            String[] genres = {"PU", "R", "P", "H", "E"};
            String genre = ("PU (Polish Underground)");
            String genresSelect = genres[0];

            String[] songs = {"Song1", "Song2", "Song3", "Song4"};

            System.out.println("¤-¤-¤ BAND PROFILE ¤-¤-¤");
            System.out.println("Band name: " + bandName);
            System.out.println("Genre: " + genre);
            System.out.println("Fame level: " + fameLevel);
            System.out.println("Fans: " + fans + "/" + maxFans);
            System.out.println("XP: " + exp);
            System.out.println("Money: " + money + "PLN");
            System.out.println("Active: " + isActive);

            System.out.println(empty);
            System.out.println("# of tracks: " + songs.length);
            System.out.println("Track List:");
            for (int i = 0; i < 4; i++) {
                    System.out.println(" - " + songs[i]);
            }
            if (((fans / maxFans) * 100) <= 25) {

                    System.out.println("Losing relevance");
            } else {
                    System.out.println("still relevant");
            }

            if (fans <= 0) {
                    isActive = (false);
                    System.out.println("losing relevance");
            }


            if (genresSelect.equals("PU")) {
                    System.out.println("Polish Underground kurwa");
                    ;
            }
            if (genresSelect.equals("H")) {
                    System.out.println("Hippity-hoppity");
                    ;
            }
            if (genresSelect.equals("P")) {
                    System.out.println("not Polish underground");
                    ;
            }
            if (genresSelect.equals("R")) {
                    System.out.println("reeee");
                    ;
            }





            {
                    //int count = 0;
                    //int i = 1;

                    //while (i<4)){
                    //if (i%2==0) {
                    //  count++;
                    //}

            }


    }}