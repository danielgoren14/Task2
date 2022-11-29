import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a valid quadratic equation (ax^2+bx+x=0): ");
        String quadraticEquation = scanner.nextLine();
        boolean ifValid = valid(quadraticEquation);
        int a,b,c;
        double result;
        if(ifValid == true){
            a = parameterA(quadraticEquation);
            b = parameterB(quadraticEquation,a);
            c = parameterC(quadraticEquation,a,b);
            printResult(a,b,c);
        }else{
            System.out.println("you entered wrong");
        }
    }
    public static boolean valid(String equation){
        boolean equationIsValid = false;
        if(equation.contains("x^2") && equation.contains("x") && equation.contains("=0")){
            equationIsValid = true;
        }
        return equationIsValid;
    }
    public static int parameterA(String equation){
        int a = 1;
        char plusOrMinus = '+';
        for (int i = 0; i < equation.length(); i++) {
            if(equation.charAt(i) == '-'){
                plusOrMinus = '-';
            }else if(equation.charAt(i) == 'x'){
                if(i != 0){
                    if(plusOrMinus == '-'){
                        a = -1 * Integer.parseInt(equation.substring(1,i-1));
                    }else{
                        a = Integer.parseInt(equation.substring(0,i-1));
                    }
                }
                break;
            }
        }
        return a;
        /*if(equation.startsWith("-")){
            for (int i = 1; i < equation.length(); i++) {
                if(equation.charAt(i) == 'x'){
                    if(equation.charAt(i-1) != '-'){
                        a = -1 * Integer.parseInt(equation.substring(1,i-1));
                        break;
                    }else{
                        a = -1;
                    }

                }
            }
        }else{
            for (int i = 0; i < equation.length(); i++) {
                if(equation.charAt(i) == 'x'){
                    if(i != 0){
                        a = Integer.parseInt(equation.substring(1,i-1));
                        break;
                    }else{
                        a = 1;
                    }
                }
            }
        }*/
    }
    public static int parameterB(String equation,int a){
        int b = 1;
        char plusOrMinus = '+';
        int lengthOfA = 3;
        if(a < 0) {
            lengthOfA++;
        }
        do{
            a /= 10;
            lengthOfA++;
        }while(a > 0);
        for (int i = lengthOfA; i < equation.length() - lengthOfA; i++) {
            if(equation.charAt(i) == '-'){
                plusOrMinus = '-';
            }
            if(equation.charAt(i) == 'x'){
                if(i != lengthOfA +1){
                    if(plusOrMinus == '-'){
                        b = -1 * Integer.parseInt(equation.substring(lengthOfA,i-1));
                    }else{
                        b = Integer.parseInt(equation.substring(lengthOfA,i-1));
                    }
                }
            }

        }
        return b;
        /*int startCountFrom;
        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) =='^'){
                startCountFrom = i + 2;
                break;
            }
        }
        if(equation.charAt(startCountFrom) == '-'){
            for (int i = startCountFrom + 1; i < equation.length(); i++) {
                if(equation.charAt(i) == 'x'){
                    b = -1 * Integer.parseInt(equation.substring(startCountFrom + 1,i-1));
                    break;
                }
            }
        }else{
            for (int i = startCountFrom + 1; i < equation.length(); i++) {
                if(equation.charAt(i) == 'x'){
                    b = Integer.parseInt(equation.substring(startCountFrom + 1,i-1));
                    break;
                }
            }
        }
        return b;*/
    }
    public static int parameterC(String equation, int a, int b){
        int c = 1;
        int lengthOfA = 3;
        if(a < 0) {
            lengthOfA++;
        }
        do{
            a /= 10;
            lengthOfA++;
        }while(a > 0);
        int lengthOfB = 2;
        char plusOrMinus = '+';
        do{
            b /= 10;
            lengthOfB++;
        }while(b > 0);
        for (int i = lengthOfB + lengthOfA + lengthOfB; i < equation.length() - lengthOfA - lengthOfB; i++) {
            if (equation.charAt(i) == '-'){
                plusOrMinus = '-';
            }
            if(equation.charAt(i) == '='){
                if(plusOrMinus == '-'){
                    c = -1 * Integer.parseInt(equation.substring(lengthOfB + lengthOfA + lengthOfB + 1,i-1));
                }else{
                    c = Integer.parseInt(equation.substring(lengthOfB + lengthOfA + lengthOfB + 1,i-1));
                }
            }
        }
        return c;
        /*for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) =='x' && equation.charAt(i+1) != '^'){
                startCountFrom = i + 1;
                break;
            }
        }
        if(equation.charAt(startCountFrom) == '-'){
            for (int i = startCountFrom + 1; i < equation.length(); i++) {
                if(equation.charAt(i) == '='){
                    c = -1 * Integer.parseInt(equation.substring(startCountFrom + 1,i-1));
                    break;
                }
            }
        }else{
            for (int i = startCountFrom + 1; i < equation.length(); i++) {
                if(equation.charAt(i) == '='){
                    c = Integer.parseInt(equation.substring(startCountFrom + 1,i-1));
                    break;
                }
            }
        }
        return c;*/
    }
    public static void printResult(int a,int b, int c){
        double x1,x2;
        double sum = (b*b)-(4*a*c);
        if(sum<0){
            System.out.println("there is no solution");
        }
        else if(sum == 0){
            x1=-b/(a*2);
            System.out.println("x1 = "+x1);
        }
        else{
            x1 = (-b + Math.sqrt(sum))/(a*2);
            x2 = (-b - Math.sqrt(sum))/(a*2);
            System.out.println("x1 = "+x1+ " , x2 = "+x2);
        }
    }
}
