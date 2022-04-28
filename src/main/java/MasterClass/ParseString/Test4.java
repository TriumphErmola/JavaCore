package MasterClass.ParseString;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int i = scanner.nextInt();
        int min=0;
        int max=0;
        while (true){
            if(i < max){
                min=i;
            }else if(i>max){
                max=i;
            }

            System.out.println(min);
            System.out.println(max);
        }

    }
}
