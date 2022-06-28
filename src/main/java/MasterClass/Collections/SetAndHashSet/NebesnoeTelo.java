package MasterClass.Collections.SetAndHashSet;

import java.util.HashSet;
import java.util.Set;

public final class NebesnoeTelo {

    private final String nameOfObject;
    private final double orbitalnoeVremy;
    private final Set<NebesnoeTelo> sputniki;

    public NebesnoeTelo(String nameOfObject, double orbitalnoeVremy) {
        this.nameOfObject = nameOfObject;
        this.orbitalnoeVremy = orbitalnoeVremy;
        this.sputniki = new HashSet<>();
    }

    public String getNameOfObject() {
        return nameOfObject;
    }

    public double getOrbitalnoeVremy() {
        return orbitalnoeVremy;
    }

    public Set<NebesnoeTelo> getSputniki() {
        return new HashSet<>(this.sputniki);
    }

    public boolean addLuna(NebesnoeTelo luna) {
        return this.sputniki.add(luna);
    }


    @Override
    public boolean equals(Object telo) {
        if (this == telo) {
            return true;
        }
        System.out.println("telo.getClass() is " + telo.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((telo == null) || (telo.getClass() != this.getClass())) {
            return false;
        }
        String teloName = ((NebesnoeTelo) telo).getNameOfObject();
        return this.nameOfObject.equals(teloName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.nameOfObject.hashCode() + 57;
    }
}
