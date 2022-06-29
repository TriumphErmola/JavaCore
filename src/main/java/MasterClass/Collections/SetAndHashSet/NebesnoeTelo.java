package MasterClass.Collections.SetAndHashSet;

import java.util.HashSet;
import java.util.Set;

public  class NebesnoeTelo {

    private final String nameOfObject;
    private final double orbitalnoeVremyVrasheniya;
    private final Set<NebesnoeTelo> sputniki;
    private final TypeOfTel typeOfTel;

    public enum TypeOfTel {
        ZVEZDA, PLANETA, KARLIKOVAYA_PLANETA, LUNA, CUMETA, ASTEROID
    }

    public NebesnoeTelo(String nameOfObject, double orbitalnoeVremyVrasheniya, TypeOfTel typeOfTel) {
        this.nameOfObject = nameOfObject;
        this.orbitalnoeVremyVrasheniya = orbitalnoeVremyVrasheniya;
        this.sputniki = new HashSet<>();
        this.typeOfTel = typeOfTel;
    }

    public String getNameOfObject() {
        return nameOfObject;
    }

    public double getOrbitalnoeVremyVrasheniya() {
        return orbitalnoeVremyVrasheniya;
    }

    public Set<NebesnoeTelo> getSputniki() {
        return new HashSet<>(this.sputniki);
    }

    public TypeOfTel getTypeOfTel() {
        return typeOfTel;
    }

    public boolean addSputnik(NebesnoeTelo luna) {
        return this.sputniki.add(luna);
    }


    @Override
    public final boolean equals(Object telo) {
        if (this == telo) {
            return true;
        }
        if (telo instanceof NebesnoeTelo) {
            NebesnoeTelo theTelo = (NebesnoeTelo) telo;
            if (this.nameOfObject.equals(theTelo.getNameOfObject())) {
                return this.typeOfTel == theTelo.getTypeOfTel();
            }
        }
        return false;

    }

    @Override
    public final int hashCode() {
        return this.nameOfObject.hashCode() + 57 + this.typeOfTel.hashCode();
    }

    @Override
    public String toString() {
        return this.nameOfObject + " : " + this.typeOfTel + ", " + this.orbitalnoeVremyVrasheniya;
    }
}
