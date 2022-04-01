package JavaCore.Lesson17StringBuilder;

public class Test1 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);
        System.out.println(sb2.length());
        System.out.println(sb2.charAt(3));
        System.out.println(sb2.indexOf("o", 2));
        String s = sb2.substring(5);
        System.out.println(s);
        String s1 = sb2.substring(0, 4);
        System.out.println(s1);
        String s2 = sb2.substring(5, 8);
        System.out.println(s2);
        System.out.println(sb2.subSequence(5, 8));
        System.out.println(sb2.append(22));
        System.out.println(sb2.append(true));
        System.out.println(sb2.append(new Car()));
        System.out.println(sb2.insert(4, "55"));
        StringBuilder sb10 = new StringBuilder("Hello World");
        sb10.delete(3, 6);
        System.out.println(sb10);
        sb10.deleteCharAt(3);
        System.out.println(sb10);
        System.out.println(sb10.reverse());
        StringBuilder sb12 = new StringBuilder("vsem privet");
        System.out.println(sb12.replace(0,4,"pete"));
        System.out.println(sb12.capacity());
        System.out.println(sb1.capacity());
    }
}

class Car {
    @Override
    public String toString() {
        return "TestCar{}";
    }
}
