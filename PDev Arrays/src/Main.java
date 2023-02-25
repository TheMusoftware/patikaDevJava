public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        String[][] letter = new String[7][4];
        for (int i = 0; i < letter.length; i++) {

            for (int j = 0; j < letter[0].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";

                } else letter[i][j] = "   ";


            }

        }
        // helper.NearestValues(arr, 12);
        //  helper.printB();
        letter = helper.transposeMatrix(letter);
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}