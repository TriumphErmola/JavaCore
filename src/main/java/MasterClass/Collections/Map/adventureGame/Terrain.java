package MasterClass.Collections.Map.adventureGame;

import java.util.HashMap;
import java.util.Map;

public class Terrain {

    private final int terrainNumber;
    private final String opisanie;
    private final Map<String, Integer> escape;

    public Terrain(int terrainNumber, String opisanie, Map<String, Integer> escape) {
        this.terrainNumber = terrainNumber;
        this.opisanie = opisanie;
        if (escape != null) {
            this.escape = new HashMap<>(escape);
        } else {
            this.escape = new HashMap<>();
        }

        this.escape.put("Q", 0);
    }

//    public void addEscape(String nazvanie, int lokaciya) {
//        escape.put(nazvanie, lokaciya);
//    }

    public int getTerrainNumber() {
        return terrainNumber;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public Map<String, Integer> getEscape() {
        return new HashMap<String, Integer>(escape);
    }
}
