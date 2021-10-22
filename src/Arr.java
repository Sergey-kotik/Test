public class Arr {
    public static void main(String[] args) {
        String[] res = new String[3];
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int[] sum = new int[3];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum[i] += arr[i][j];
            }
            res[i] += sum[i];
            System.out.println(sum[i]);
        }
    }
}
