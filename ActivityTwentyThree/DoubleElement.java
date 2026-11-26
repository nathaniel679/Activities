package ActivityTwentyThree;

import java.util.Arrays;

public class DoubleElement {
    public static void main(String[] args){

    int[] dataTest1 = {1, 2, 3};
    System.out.println("Test data 1:");
    System.out.println("input: " + Arrays.toString(dataTest1));
    
    for (int index = 0; index < dataTest1.length; index++){
        dataTest1[index] *= 2;
    }
    System.out.println("expected output: " + Arrays.toString(dataTest1));
    System.out.println();
    System.out.println();

    int[] dataTest2 = {5, 10, 15, 20};
    System.out.println("Test data 2:");
    System.out.println("input: " + Arrays.toString(dataTest2));

    for (int index = 0; index < dataTest2.length; index++){
        dataTest2[index] *= 2;
    }
    System.out.println("expected output: " + Arrays.toString(dataTest2));
    }
}
