package MasterClass.Collections.binarysearch;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("MuzTheatre", 8, 12);
        List<Theatre.Seat> seatList = new ArrayList<>(theatre.seats);
        printList(seatList);

        seatList.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.shuffle(seatList);
        System.out.println("printing seatList");
        printList(seatList);
        System.out.println("printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatList);
        Theatre.Seat maxSeat = Collections.max(seatList);
        System.out.println("Min seat number : " + minSeat.getSeatNumber());
        System.out.println("Max seat number : " + maxSeat.getSeatNumber());

        sortList(seatList);
        System.out.println("Printing sorted seatList");
        printList(seatList);
    }

    private static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==================================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
