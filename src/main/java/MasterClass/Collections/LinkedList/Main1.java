package MasterClass.Collections.LinkedList;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        Customer customer = new Customer("Andrey", 55.55);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(11.11);
        System.out.println("balance for customer : " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(3);
        intArray.add(5);
        for(int i = 0; i<intArray.size();i++){
            System.out.println(i+" : "+intArray.get(i));
        }

        intArray.add(1,2);

        for(int i = 0; i<intArray.size();i++){
            System.out.println(i+" : "+intArray.get(i));
        }
    }
}
