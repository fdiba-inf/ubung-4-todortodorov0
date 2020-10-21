package exercise4;
import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = input.nextInt();
        double[] numbers = new double[count];
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        int min = 0;
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < numbers[min]){
                min = i;
            }
        }
        System.out.println("Min index: " + min);
    }
}