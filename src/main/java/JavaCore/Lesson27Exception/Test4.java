package JavaCore.Lesson27Exception;

public class Test4 {

    void abc() throws NullPointerException{
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        try{
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exception completed");
        }
    }
}
