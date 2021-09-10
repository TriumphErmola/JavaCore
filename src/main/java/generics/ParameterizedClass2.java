package generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Warhammer", 40);
        System.out.println("Значение пары : value1 - " + pair1.getFirstValue1()
                + " value2 - " + pair1.getSecondValue2());
        Pair<Integer, Double> pair2 = new Pair<>(50, 40.0);
        System.out.println("Значение пары : value1 - " + pair2.getFirstValue1()
                + " value2 - " + pair2.getSecondValue2());

        OtherPair<String> otherPair = new OtherPair<>("Custodes", "SilenceSister");
        OtherPair<Integer> otherPair1 = new OtherPair<>(1488, 228);
        System.out.println(otherPair.getFirstValue1() + " " + otherPair.getSecondValue2());
        System.out.println(otherPair1.getFirstValue1() + " " + otherPair1.getSecondValue2());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue1() {
        return value1;
    }

    public V2 getSecondValue2() {
        return value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public <V> V abc(V val) {
        return val;
    }

    public V getFirstValue1() {
        return value1;
    }

    public V getSecondValue2() {
        return value2;
    }
}