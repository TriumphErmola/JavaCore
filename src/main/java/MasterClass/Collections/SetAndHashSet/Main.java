package MasterClass.Collections.SetAndHashSet;

import MasterClass.Collections.SetAndHashSet.Challenge.Planeta;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, NebesnoeTelo> solarnayaSystema = new HashMap<>();
    private static Set<NebesnoeTelo> planeti = new HashSet();

    public static void main(String[] args) {

        NebesnoeTelo telo = new Planeta("Merkuriy", 88);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);


        telo = new Planeta("Venera", 225);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);

        telo = new Planeta("Earth", 365);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);


        telo = new Planeta("Mars", 687);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);

        telo = new Planeta("Saturn", 10759);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);

        telo = new Planeta("Jupiter", 4332);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);

        telo = new Planeta("Uran", 30660);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);

        telo = new Planeta("Neptun", 165);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);


        NebesnoeTelo sputnik1 = new Sputnik("Deimos", 1.3);
        solarnayaSystema.put(sputnik1.getNameOfObject(), sputnik1);
        telo.addSputnik(sputnik1); // temp is still Mars

        sputnik1 = new Sputnik("Phobos", 0.3);
        solarnayaSystema.put(sputnik1.getNameOfObject(), sputnik1);
        telo.addSputnik(sputnik1);


        System.out.println("Planeti");
        for (NebesnoeTelo planeti : planeti) {
            System.out.println("\t" + planeti.getNameOfObject());
        }

        NebesnoeTelo teloTest = solarnayaSystema.get("Mars");
        System.out.println("Luni of " + teloTest.getNameOfObject());
        for (NebesnoeTelo sputnikiThisObject : telo.getSputniki()) {
            System.out.println("\t" + sputnikiThisObject.getNameOfObject());

        }

        telo = new Planeta("Mars", 1234);
        solarnayaSystema.put(telo.getNameOfObject(), telo);
        planeti.add(telo);

        NebesnoeTelo pluton = new NebesnoeTelo("Pluton", 248,
                NebesnoeTelo.TypeOfTel.KARLIKOVAYA_PLANETA);

        for (NebesnoeTelo planets : planeti) {
            System.out.println(planets);
        }
    }
}
