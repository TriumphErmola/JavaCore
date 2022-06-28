package MasterClass.Collections.SetAndHashSet;

public class Cat {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cat) {
            String objName = ((Cat) obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }
}
