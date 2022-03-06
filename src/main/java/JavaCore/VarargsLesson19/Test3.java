package JavaCore.VarargsLesson19;

public class Test3 {
    public static void main(String[] args) {

        int[][] array = {{0, 1, 2, 3, 45, 65}, {2, 3, 4, 5, 6}, {9, 7, 5, 3, 2, 8,}};

        for(int[]array2 : array){
            for(int a : array2){
                System.out.print(a+" ");
            }
        }
//        for(int i = 0;i< array.length;i++){
//            for(int j=i+1;j<array[i].length;j++){
//                System.out.print(array[i][j]+ " ");
//            }
//        }
    }
}
