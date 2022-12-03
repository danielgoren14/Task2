import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do{
            System.out.println("Please enter the length of the array you want to create(number which is >= 3): ");
            size = scanner.nextInt();
        }while(size<3);
        int[] array = new int[size];
        System.out.println("Please enter all the "+ size +" values of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int topOfArray = returnTheTopOfAnArrayIfTheArrayIsValid(array);
        if(topOfArray == -1){
            System.out.println(topOfArray);
        }else{
            System.out.println("The index " + topOfArray + " is the index of the top value");
        }

    }
    public static int returnTheTopOfAnArrayIfTheArrayIsValid(int[] array){
        int indexOfTopValue = -1;
        int countAllIndexesBeforeTop = 0;
        int countAllIndexesAfterTop = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] < array[i+1]){
                countAllIndexesBeforeTop++;
            }else{
                break;
            }
        }
        for (int i = countAllIndexesBeforeTop; i < array.length - 1; i++) {
            if(array[i] > array[i+1]){
                countAllIndexesAfterTop++;
            }else{
                break;
            }
        }
        if(countAllIndexesBeforeTop + countAllIndexesAfterTop == array.length - 1){
            indexOfTopValue = countAllIndexesBeforeTop;
        }
        return indexOfTopValue;
    }
}