package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_4 {
    static class Song {
        private String typeOfList;
        private String nameOfSong;
        private String durationOfSong;

        public Song (String typeOfList, String nameOfSong, String durationOfSong) {
            this.typeOfList = typeOfList;
            this.nameOfSong = nameOfSong;
            this.durationOfSong = durationOfSong;
        }
        public String getTypeOfList() {
            return this.typeOfList;
        }
        public String getNameOfSong() {
            return this.nameOfSong;
        }
        public String getDurationOfSong() {
            return this.durationOfSong;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> listSongs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            String[] inputSongArr = inputLine.split("_");

            Song currentSong = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2]);

            listSongs.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song item : listSongs) {
                System.out.println(item.getNameOfSong());
            }
        } else {
            for (Song item : listSongs) {
                if (item.getTypeOfList().equals(command)) {
                    System.out.println(item.getNameOfSong());
                }
            }
        }
    }
}

