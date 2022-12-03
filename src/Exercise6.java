import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Scanner;

public class Exercise6 {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a valid quadratic equation (ax^2+bx+x=0): ");
        String quadraticEquation = scanner.nextLine();
        boolean ifValid = valid(quadraticEquation);
        int a,b,c;
        if(ifValid == true){
            a = parameterA(quadraticEquation);
            b = parameterB(quadraticEquation,a);
            c = parameterC(quadraticEquation,a,b);
            printResult(a,b,c);
        }else{
            System.out.println("you entered wrong");
        }
    }
    public static boolean checkEquation(String equation){
        boolean goodOrNot = true;
        if(equation.length() == 0){
            goodOrNot = false;
        }
        else {
            int lengthOfEquation = equation.length();

            String equalToZero = "=0";

            int indexOfFirstX = equation.indexOf('x');
            String fromFirstX = "x^2";

            int indexOfSecondX = 0;
            String secondXWithPlus = "x+";
            String secondXWithMinus = "x-";
            String secondXWithEqual = "x=";
            int counter = 0;
            for (int i = 0; i < equation.length(); i++) {
                if (equation.charAt(i) == 'x') {
                    indexOfSecondX = i;
                    counter++;
                    if (counter == 2) {
                        break;
                    }
                }
            }
            if (!equation.substring(lengthOfEquation - 2).equals(equalToZero)) {
                goodOrNot = false;
            } else if (!equation.substring(indexOfFirstX, indexOfFirstX + 3).equals(fromFirstX)) {
                goodOrNot = false;
            } else if (!(equation.substring(indexOfSecondX, indexOfSecondX + 2).equals(secondXWithPlus) ||
            equation.substring(indexOfSecondX, indexOfSecondX + 2).equals(secondXWithMinus) ||
            equation.substring(indexOfSecondX, indexOfSecondX + 2).equals(secondXWithEqual))) {
                goodOrNot = false;
            }
        }
        return goodOrNot;
    }
    /*public static boolean valid(String equation){
        boolean equationIsValid = false;
        if(equation.contains("x^2") && equation.contains("x") && equation.contains("=0")){
            equationIsValid = true;
        }
        return equationIsValid;
    }
    public static int parameterA(String equation){

    }
    public static int parameterB(String equation){
        int b = 1;
        String stringOfA;
        int whereToCutFrom = 0;

    }*/

}
