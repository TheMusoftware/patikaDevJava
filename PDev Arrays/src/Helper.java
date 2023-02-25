import java.util.Arrays;

public class Helper {
    double Harmonic(int[] arr){
        double average = 0;
        for(int i : arr) average+=i;
        return average/arr.length;
    }
    void NearestValues(int [] arr, int value) {
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, value);
        int nearestMin = arr[index - 1];
        int nearestMax = arr[index + 1];
        System.out.printf("min %d%n %s %d%n", nearestMin, "Max", nearestMax);
    }
        //Letter B
        void printB () {
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
            for (String[] row : letter) {
                for (String col : row) {
                    System.out.print(col);
                }
                System.out.println();
            }
        }
        int[][] transposeMatrix(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        int[][] newArr = new int[col][row];
        boolean isOperationOver = false;
        int tempRow = 0;
        int tempCol = 0;


        while(!isOperationOver){

            newArr[tempRow][tempCol] = arr[tempCol][tempRow];
            tempRow++;
            tempCol++;
            if(tempRow == row && tempCol == col) isOperationOver = true;
            else if(tempRow ==  row) tempRow = 0;
            else if(tempCol ==  col) tempCol = 0;

        }

        return newArr;
        }

    String[][] transposeMatrix(String[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        String[][] newArr = new String[col][row];
        boolean isOperationOver = false;
        int tempRow = 0;
        int tempCol = 0;


        while(!isOperationOver){

            newArr[tempRow][tempCol] = (arr[tempCol][tempRow]);
            tempRow++;
            tempCol++;
            if(tempRow == row && tempCol == col) isOperationOver = true;
            else if(tempRow ==  row) tempRow = 0;
            else if(tempCol ==  col) tempCol = 0;

        }

        return newArr;
    }


}
/* row=i    col=j
    00 01 02 03
    10       43
    20       23
    30 31 32 33
    40       43
    50       53
    60 61 62 63
 */