package MasterClass.Collections.SetAndHashSet;

import java.util.HashSet;
import java.util.Set;

public abstract class NebesnoeTelo {

    private final NestedKey nestedKey;
    private final double orbitalnoeVremyVrasheniya;
    private final Set<NebesnoeTelo> sputniki;


    public enum TypeOfTel {
        ZVEZDA, PLANETA, KARLIKOVAYA_PLANETA, LUNA, CUMETA, ASTEROID
    }

    public NebesnoeTelo(String nameOfObject, double orbitalnoeVremyVrasheniya, TypeOfTel typeOfTel) {
        this.nestedKey = new NestedKey(nameOfObject, typeOfTel);
        this.orbitalnoeVremyVrasheniya = orbitalnoeVremyVrasheniya;
        this.sputniki = new HashSet<>();

    }

    public NestedKey getNestedKey() {
        return nestedKey;
    }

    public double getOrbitalnoeVremyVrasheniya() {
        return orbitalnoeVremyVrasheniya;
    }

    public Set<NebesnoeTelo> getSputniki() {
        return new HashSet<>(this.sputniki);
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
            return this.nestedKey.equals(theTelo.getNestedKey());
        }
        return false;
    }


    @Override
    public final int hashCode() {
        return this.nestedKey.hashCode();
    }

    @Override
    public String toString() {
        return this.nestedKey.getNameofKey() + ": " + this.nestedKey.getTypeOfTel() + "," + this.orbitalnoeVremyVrasheniya;
    }

    public static NestedKey makeKey(String name, TypeOfTel typeOfTel) {
        return new NestedKey(name, typeOfTel);
    }

    public static final class NestedKey {
        private String nameofKey;
        private NebesnoeTelo.TypeOfTel typeOfTel;

        private NestedKey(String nameofKey, NebesnoeTelo.TypeOfTel typeOfTel) {
            this.nameofKey = nameofKey;
            this.typeOfTel = typeOfTel;
        }

        public String getNameofKey() {
            return nameofKey;
        }

        public NebesnoeTelo.TypeOfTel getTypeOfTel() {
            return typeOfTel;
        }

        @Override
        public boolean equals(Object object) {
            NestedKey nestedKey = (NestedKey) object;
            if (this.nameofKey.equals(nestedKey.getNameofKey())) {
                return (this.typeOfTel == nestedKey.getTypeOfTel());
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.nameofKey.hashCode() + 57 + this.typeOfTel.hashCode();
        }

        @Override
        public String toString() {
            return this.nameofKey + " : " + this.typeOfTel;
        }
    }
}

