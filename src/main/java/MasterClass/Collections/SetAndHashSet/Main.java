package MasterClass.Collections.SetAndHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, NebesnoeTelo> solarnayaSystema = new HashMap<>();
    private static Set<NebesnoeTelo> planeti = new HashSet();

    public static void main(String[] args) {

        NebesnoeTelo telo = new NebesnoeTelo("Merkuriy", 88);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);

        telo = new NebesnoeTelo("Venera", 225);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);

        telo = new NebesnoeTelo("Earth", 365);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);

        NebesnoeTelo sputnik1 = new NebesnoeTelo("Luna", 27);
        solarnayaSystema.put(sputnik1.getNameOfObject(), sputnik1);
        telo.addLuna(sputnik1);

        telo = new NebesnoeTelo("Mars", 687);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);

        sputnik1 = new NebesnoeTelo("Deimos", 1.3);
        solarnayaSystema.put(sputnik1.getNameOfObject(), sputnik1);
        telo.addLuna(sputnik1); // temp is still Mars

        sputnik1 = new NebesnoeTelo("Phobos", 0.3);
        solarnayaSystema.put(sputnik1.getNameOfObject(), sputnik1);
        telo.addLuna(sputnik1);

        System.out.println("Planeti");
        for (NebesnoeTelo planeti : planeti) {
            System.out.println("\t" + planeti.getNameOfObject());
        }

        NebesnoeTelo teloTest = solarnayaSystema.get("Mars");
        System.out.println("Luni of " + teloTest.getNameOfObject());
        for (NebesnoeTelo sputnikiThisObject : teloTest.getSputniki()) {
            System.out.println("\t" + sputnikiThisObject.getNameOfObject());

        }

        telo = new NebesnoeTelo("Mars", 1234);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);

        for (NebesnoeTelo planets : planeti) {
            System.out.println(planets.getNameOfObject() + " : " + planets.getOrbitalnoeVremy());
        }




    }
}
