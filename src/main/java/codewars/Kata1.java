package codewars;

/*
Нам нужна функция, которая может преобразовать число в строку.

public static String numberToString(int num) {
    return String.valueOf(num);
  }
public static String numberToString(int num) {

    return Integer.toString(num);
  }

 */
class Kata1 {

    public static void main(String[] args) {
        String s = numberToString(5);
        System.out.println(s);
    }

    public static String numberToString(int num) {
//        String str = Integer.toString(num);
//        System.out.println(str);
//        return str;
        return String.valueOf(num);

    }


}