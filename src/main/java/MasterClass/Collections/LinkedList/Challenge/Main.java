package MasterClass.Collections.LinkedList.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Iowa", "Slipknot");
        album.addSong("Wait and Bleed", 3.13);
        album.addSong("Sic", 2.15);
        album.addSong("Split it Out", 4.02);

        albums.add(album);

        album = new Album("Azaza", "Aziz");
        album.addSong("Mrazish", 2.28);
        album.addSong("Ave", 2.24);
        album.addSong("Malinovaya Lada", 3.28);
        album.addSong("Smechariki", 1.28);
        album.addSong("SnowBall", 2.18);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Sic", playList);
        albums.get(0).addToPlayList("Split it Out", playList);
        albums.get(0).addToPlayList("Wait and Bleed", playList);

        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(4, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {

        Scanner scanner = new Scanner(System.in);
        boolean quik = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playList");
            return;
        } else {
            System.out.println("Now playing : " + listIterator.next().toString());
        }

        while (!quik) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("PlayList complete");
                    quik = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing : " +listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the laylist");
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing : " +listIterator.previous().toString());
                    }else {
                        System.out.println("We are at the start of playlist");
                        forward = true;
                    }
                    break;
                case 3:

                    break;
                case 4:
//                    printList(playList);
                    break;
                case 5:
//                    printMenu();
                    break;
            }
        }
    }


}
