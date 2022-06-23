package MasterClass.Collections.Map.adventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Terrain> terrainMap = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        terrainMap.put(0, new Terrain(0, "doom"));
//        terrainMap.put(1, new Terrain(1, "terror"));
//        terrainMap.put(2, new Terrain(2, "madness"));
//        terrainMap.put(3, new Terrain(3, "termination"));
//        terrainMap.put(4, new Terrain(4, "exterminatus"));
//        terrainMap.put(5, new Terrain(5, "rampage"));

        Map<String, Integer> tempEscape = new HashMap<>();
        tempEscape.put("W",2);



        tempEscape.put("W", 2);
        tempEscape.put("E", 3);
        tempEscape.put("S", 4);
        tempEscape.put("N", 5);

        tempEscape.put("N", 5);

        tempEscape.put("W", 1);

        tempEscape.put("N", 1);
        tempEscape.put("W", 2);

        tempEscape.put("S", 1);
        tempEscape.put("W", 2);

        Map<String, String> zapasSlov = new HashMap<>();
        zapasSlov.put("QUIT", "Q");
        zapasSlov.put("NORTH", "N");
        zapasSlov.put("WEST", "W");
        zapasSlov.put("EAST", "E");
        zapasSlov.put("SOUTH", "S");

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

            if (opisanie.length() > 1) {
                String[] slova = opisanie.split(" ");
                for (String s : slova) {
                    if (zapasSlov.containsKey(s)) {
                        opisanie = zapasSlov.get(s);
                        break;
                    }
                }
            }

            if (escape.containsKey(opisanie)) {
                locNumber = escape.get(opisanie);
            } else {
                System.out.println("You cannot go in that opisanie");
            }

        }

    }
}
