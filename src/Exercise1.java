import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        printBiggestNumbersThanTheAverage();
    }
    public static void printBiggestNumbersThanTheAverage(){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Please enter 10 numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        double average = (float) sum / 10;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > average){
                System.out.println(array[i]);
            }
        }

    }

}