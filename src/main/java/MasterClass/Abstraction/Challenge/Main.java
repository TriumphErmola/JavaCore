package MasterClass.Abstraction.Challenge;

public class Main {
    public static void main(String[] args) {

        SearchThree tree = new SearchThree(null);
        tree.traverse(tree.getRoot());

//        String stringData = "Moskow Novosibirsk Tobolsk Tymen Omsk Sochi Volgograd Ekaterinburg";
        String stringData = "3 1 2 4 6 5 9 7 8";

        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());



    }
}
