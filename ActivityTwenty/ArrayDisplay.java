package ActivityTwenty;

public class ArrayDisplay {
    public static void main(String[] args) {

        Integer[] numbers = { 12, 25, 37, 44, 59 };
        System.out.println("Array Contents:");
        int counter = 0;

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
            if (numbers[index] > 30) {
            counter += 1;
            }
        }
        System.out.println("There are " + counter + " numbers are greater than 30.");
    }
}
