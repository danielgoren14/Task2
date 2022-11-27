import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];
        System.out.println("Please enter 5 numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int[] newArray = printWithoutDuplications(array);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
    public static int[] printWithoutDuplications(int[] array){
        int counter =0;
        // 1,2,3,2,1
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]){
                    counter++;
                    break;
                }
            }
        }
        //System.out.println("array.length is : " + array.length + " and counter is " + counter);
        int [] newArray = new int[array.length - counter];
        int indexNewArray = 0;
        int counterOfCheckingIfTheNumberAppearsFirst;
        for (int i = 1; i <array.length; i++) {
            counterOfCheckingIfTheNumberAppearsFirst = 0;
            for (int j = i-1; j >0; j--) {
                if(array[i] != array[j]){
                    counterOfCheckingIfTheNumberAppearsFirst++;
                }else{
                    counterOfCheckingIfTheNumberAppearsFirst = 0;
                    break;
                }
            }
            if(counterOfCheckingIfTheNumberAppearsFirst == i){
                newArray[indexNewArray] = array[i];
                indexNewArray++;
            }
        }
        return newArray;
    }
    //5,5,5,1,5
}