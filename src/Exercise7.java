import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    /*public static boolean validOfString(String userInput){
        Scanner scanner = new Scanner(System.in);
        while(userInput.length() !=4) {
            System.out.println("Please enter 4 numbers different Numbers");
            userInput = scanner.nextLine();
        }
        boolean returnIfAllDigitsAreValid = false;
        int counter = 0;
        int [] eachDigit = new int[4];
        String auxiliaryToolFrFindingEachDigit = Integer.toString(userInput);
        String anotherAuxiliaryTool;
        int digit;
        for (int i = 0; i < 4; i++) {
            anotherAuxiliaryTool = auxiliaryToolFrFindingEachDigit.substring(i);
            digit = Integer.parseInt(anotherAuxiliaryTool);
            eachDigit[i] = digit;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if ((eachDigit[i] != eachDigit[j]) && (eachDigit[i] <= 6 || eachDigit[i] >= 1) && (eachDigit[j] <= 6 || eachDigit[j] >= 1)) {
                    counter++;
                } else {
                    break;
                }
            }
        }
        if (counter == 3 + 2 + 1) {
            returnIfAllDigitsAreValid = true;
        }
        return returnIfAllDigitsAreValid;
    }
    public static boolean returnCluesOrIfGuessIsTrue(String userInput, int course, int secretCode){
        int[] arrayOfDigis = new int[4];
        String auxiliaryToolFrFindingEachDigit = Integer.toString(secretCode);
        String anotherAuxiliaryTool;
        int digit;
        for (int i = 0; i < 4; i++) {
            anotherAuxiliaryTool = auxiliaryToolFrFindingEachDigit.substring(i);
            digit = Integer.parseInt(anotherAuxiliaryTool);
            arrayOfDigis[i] = digit;
        }
        boolean ifGuessIsTrue = false;
        for (int i = 0; i < course; i++) {
            for (int j = 0; j < 4; j++) {
                for (int z = j + 1; z < 4; z++) {
                    if ()
                }
            }
        }
    }*/
}
