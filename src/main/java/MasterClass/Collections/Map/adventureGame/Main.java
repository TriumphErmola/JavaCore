package MasterClass.Collections.Map.adventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Terrain> terrainMap = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        terrainMap.put(0, new Terrain(0, "doom"));
        terrainMap.put(1, new Terrain(1, "terror"));
        terrainMap.put(2, new Terrain(2, "madness"));
        terrainMap.put(3, new Terrain(3, "termination"));
        terrainMap.put(4, new Terrain(4, "exterminatus"));
        terrainMap.put(5, new Terrain(5, "rampage"));

        terrainMap.get(1).addEscape("W", 2);
        terrainMap.get(1).addEscape("E", 3);
        terrainMap.get(1).addEscape("S", 4);
        terrainMap.get(1).addEscape("N", 5);
//        terrainMap.get(1).addEscape("Q", 0);

        terrainMap.get(2).addEscape("N", 5);
//        terrainMap.get(2).addEscape("Q", 0);

        terrainMap.get(3).addEscape("W", 1);
//        terrainMap.get(3).addEscape("Q", 0);

        terrainMap.get(4).addEscape("N", 1);
        terrainMap.get(4).addEscape("W", 2);
//        terrainMap.get(4).addEscape("Q", 0);

        terrainMap.get(5).addEscape("S", 1);
        terrainMap.get(5).addEscape("W", 2);
//        terrainMap.get(5).addEscape("Q", 0);

        int locNumber = 1;
        while (true) {
            System.out.println(terrainMap.get(locNumber).getOpisanie());
            if (locNumber == 0) {
                break;
            }

            Map<String, Integer> escape = terrainMap.get(locNumber).getEscape();
            System.out.print("Available exists are ");

            for (String vihod : escape.keySet()) {
                System.out.print(vihod + ", ");
            }
            System.out.println();

            String opisanie = scanner.nextLine().toUpperCase();

            if (escape.containsKey(opisanie)) {
                locNumber = escape.get(opisanie);
            } else {
                System.out.println("You cannot go in that opisanie");
            }

        }

    }
}
