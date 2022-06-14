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

        int locNumber = 1;
        while (true) {
            System.out.println(terrainMap.get(locNumber).getOpisanie());
            if (locNumber == 0) {
                break;
            }
            locNumber = scanner.nextInt();
            if (!terrainMap.containsKey(locNumber)) {
                System.out.println("Eta ne ta dver drujok-pirojok");
            }
        }

    }
}
