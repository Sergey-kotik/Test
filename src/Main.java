import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] result = new String[5];
        int [][] point = {
                {1,2,3,4,5},
                {8,9,9,5,0},
                {7,2,3,6,5},
                {1,9,8,5,4},
                {3,5,7,2,1},
        };
        int[] sumPoint = new int[5];
        String[] names = {"Alex", "Nurik", "Serho", "Bella", "Judi"};
        for (int i = 0; i < names.length; i++) {
            for(int j = 0; j < point[i].length; j++) {
                sumPoint[i] += point[i][j];
            }
            result[i] = names[i] + " " + sumPoint[i];
            System.out.println(result[i]);
        }
    }
}
