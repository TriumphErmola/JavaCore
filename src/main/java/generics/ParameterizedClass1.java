package generics;

public class ParameterizedClass1 {
    public static void main(String[] args) {

        Info<String> info1 = new Info<>("WAAAAGGGHHH!!!!!!");
        String s = info1.getValue();
        System.out.println(info1);


        Info<Integer> info2 = new Info<>(40);
        Integer s1 = info2.getValue();
        System.out.println(info2);
    }

}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
