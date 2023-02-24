import java.util.Arrays;

public class Helper {
    double Harmonic(int[] arr){
        double average = 0;
        for(int i : arr) average+=i;
        return average/arr.length;
    }
    void NearestValues(int [] arr, int value){
        int nearestMin = Integer.MAX_VALUE;
        int nearestMax  = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(value - arr[i] < nearestMin && value != arr[i] ) nearestMin = value - arr[i];
        }
        System.out.printf("min %d%n",nearestMin);
    }
}
