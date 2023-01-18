package class10;

import java.util.Arrays;

public class ForEchLoopDemo3 {
    public static void main(String[] args) {

        int [] arr={10,13,20,25,45,50};
        // we can't update the elements in for each loops because we don't have access to the index;
        for (int x: arr){
            if (x%2!=0){
                x=0;
                // below code prints all elements from an array without a loop
                System.out.println(Arrays.toString(arr));
            }
        }
























    }
}
