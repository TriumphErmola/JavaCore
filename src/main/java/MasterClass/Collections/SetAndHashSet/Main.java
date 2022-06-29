package MasterClass.Collections.SetAndHashSet;

import MasterClass.Collections.SetAndHashSet.Challenge.Planeta;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<NebesnoeTelo.NestedKey, NebesnoeTelo> solarnayaSystema = new HashMap<>();
    private static Set<NebesnoeTelo> planeti = new HashSet();

    public static void main(String[] args) {

        NebesnoeTelo telo = new Planeta("Merkuriy", 88);
        solarnayaSystema.put(telo.getNestedKey(), telo);
        planeti.add(telo);


        telo = new Planeta("Venera", 225);
        solarnayaSystema.put(telo.getNestedKey(), telo);
        planeti.add(telo);

        telo = new Planeta("Earth", 365);
        solarnayaSystema.put(telo.getNestedKey(), telo);
        planeti.add(telo);


        telo = new Planeta("Mars", 687);
        solarnayaSystema.put(telo.getNestedKey(), telo);
        planeti.add(telo);

        telo = new Planeta("Saturn", 10759);
        solarnayaSystema.put(telo.getNestedKey(), telo);
        planeti.add(telo);

        telo = new Planeta("Jupiter", 4332);
        solarnayaSystema.put(telo.getNestedKey(), telo);
        planeti.add(telo);

        telo = new Planeta("Uran", 30660);
        solarnayaSystema.put(telo.getNestedKey(), telo);
        planeti.add(telo);

        telo = new Planeta("Neptun", 165);
        solarnayaSystema.put(telo.getNestedKey(), telo);
        planeti.add(telo);


        NebesnoeTelo sputnik1 = new Sputnik("Deimos", 1.3);
        solarnayaSystema.put(sputnik1.getNestedKey(), sputnik1);
        telo.addSputnik(sputnik1); // temp is still Mars

        sputnik1 = new Sputnik("Phobos", 0.3);
        solarnayaSystema.put(sputnik1.getNestedKey(), sputnik1);
        telo.addSputnik(sputnik1);


        System.out.println("Planeti");
        for (NebesnoeTelo planeti : planeti) {
            System.out.println("\t" + planeti.getNestedKey());
        }

        NebesnoeTelo teloTest = solarnayaSystema.get(NebesnoeTelo.makeKey("Mars", NebesnoeTelo.TypeOfTel.PLANETA));
        System.out.println("Luni of " + teloTest.getNestedKey());
        for (NebesnoeTelo sputnikiThisObject : telo.getSputniki()) {
            System.out.println("\t" + sputnikiThisObject.getNestedKey());

        }

        telo = new Planeta("Mars", 1234);
        solarnayaSystema.put(telo.getNestedKey(), telo);
        planeti.add(telo);

        NebesnoeTelo pluton = new KarlikovayaPlaneta("Pluton", 248);
        planeti.add(pluton);

        for (NebesnoeTelo planets : planeti) {
            System.out.println(planets);
        }

        NebesnoeTelo zemly1 = new Planeta("Earth", 365);
        NebesnoeTelo zemly2 = new Planeta("Earth", 365);
        System.out.println(zemly1.equals(zemly2));
        System.out.println(zemly2.equals(zemly1));

        solarnayaSystema.put(pluton.getNestedKey(), pluton);
        System.out.println(solarnayaSystema.get(NebesnoeTelo.makeKey("Pluton", NebesnoeTelo.TypeOfTel.PLANETA)));
        System.out.println(solarnayaSystema.get(NebesnoeTelo.makeKey("Pluton", NebesnoeTelo.TypeOfTel.KARLIKOVAYA_PLANETA)));
        System.out.println();
        System.out.println("Solarnaya sistema sostoit iz : ");
        for (NebesnoeTelo tela : solarnayaSystema.values()) {
            System.out.println(tela);
        }

    }
}
