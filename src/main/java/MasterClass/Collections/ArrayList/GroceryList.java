package MasterClass.Collections.ArrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have : " + groceryList.size() + " items in your grocer");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = searchItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }

    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified");

    }

    public void removeGroceryList(String newItem) {
        int position = searchItem(newItem);
        if (position >= 0) {
            removeGroceryList(position);
        }
    }

    private void removeGroceryList(int position) {
        groceryList.remove(position);
    }

    private int searchItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = searchItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }

}
