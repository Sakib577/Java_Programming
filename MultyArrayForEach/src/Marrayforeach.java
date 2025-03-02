public class Marrayforeach {
    public static void main(String[] args) {


        int[][] array = {{1, 4, 5}, {7, 4, 8, 9}};

        for (int[] row : array) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}