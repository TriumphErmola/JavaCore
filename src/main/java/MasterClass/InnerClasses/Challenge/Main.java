package MasterClass.InnerClasses.Challenge;

import java.util.*;

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
            printMenu();
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
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing : " + listIterator.next().toString());
                    } else {
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
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing : " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }

                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        } else {

                        }
                    }
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions." +
                "6 - delete current song from playlist.");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=======================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("=======================");
    }




}
