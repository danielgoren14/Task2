import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        boolean ifWin;
        char[] array = new char[9];
        char user1Symbol = 'X';
        char user2Symbol = 'O';
        printBoard(array);
        int location;
        for (int i = 0; i < 9; i++) {
            location = getPositionFromUser();
            if(i % 2 == 0){
                ifWin = placeSymbolOnBoard(array,location,user1Symbol);
                if(ifWin == true){
                    System.out.println("The winner is "+ user1Symbol);
                    break;
                }
            }else{
                ifWin = placeSymbolOnBoard(array,location,user2Symbol);
                if(ifWin == true){
                    System.out.println("The winner is "+ user2Symbol);
                    break;
                }
            }
        }
    }
    public static void printBoard(char[] array){
        for (int i = 1; i <= 9; i += 3) {
            for (int j = i; j <= i+2; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    public static boolean isAvailable(char[] array, int location){
        boolean ifAlreadyChosen = true;
        if (array[location] == 'X' || array[location] == 'O'){
            ifAlreadyChosen = false;
        }
        return ifAlreadyChosen;
    }
    public static int getPositionFromUser(){
        char[] array= new char[9];
        Scanner scanner = new Scanner(System.in);
        int location;
        do {
            System.out.println("Please enter a number between 1 to 9");
            location = scanner.nextInt();
        }while (location < 1 || location > 9);
        boolean ifAlreadyTaken = isAvailable(array,location);
        if(ifAlreadyTaken == false){
            do {
                System.out.println("Please enter another number between 1 to 9, except of "+ location);
                location = scanner.nextInt();
                ifAlreadyTaken = isAvailable(array,location);
            }while(ifAlreadyTaken == false);
        }
        return location;
    }
    public static char checkWinner(char[] array){
        char ifWinner = '-';
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 1; i <= 3; i++) {
            if(array[i] == 'X'){
                counter1++;
            }else{
                counter1 = 0;
                break;
            }
        }
        for (int i = 4; i <= 6; i++) {
            if(array[i] == 'X'){
                counter1++;
            }else{
                counter1 = 0;
                break;
            }
        }
        for (int i = 7; i <= 9; i++) {
            if(array[i] == 'X'){
                counter1++;
            }else{
                counter1 = 0;
                break;
            }
        }
        for (int i = 1; i <= 7; i+=3) {
            if(array[i] == 'X'){
                counter1++;
            }else{
                counter1 = 0;
                break;
            }
        }
        for (int i = 1; i <= 7; i+=3) {
            if(array[i] == 'X'){
                counter1++;
            }else{
                counter1 = 0;
                break;
            }
        }
        for (int i = 2; i <= 8; i+=3) {
            if(array[i] == 'X'){
                counter1++;
            }else{
                counter1 = 0;
                break;
            }
        }
        for (int i = 3; i <= 9; i+=3) {
            if(array[i] == 'X'){
                counter1++;
            }else{
                counter1 = 0;
                break;
            }
        }
        for (int i = 3; i < 7; i+=2) {
            if(array[i] == 'X'){
                counter1++;
            }else{
                counter1 = 0;
                break;
            }
        }
        for (int i = 0; i <= 9; i+=4) {
            if(array[i] == 'X'){
                counter1++;
            }else{
                counter1 = 0;
                break;
            }
        }
        for (int i = 3; i <= 7; i+=2) {
            if(array[i] == 'X'){
                counter1++;
            }else{
                counter1 = 0;
                break;
            }
        }
        for (int i = 1; i <= 3; i++) {
            if(array[i] == 'O'){
                counter2++;
            }else{
                counter2 = 0;
                break;
            }
        }
        for (int i = 4; i <= 6; i++) {
            if(array[i] == 'O'){
                counter2++;
            }else{
                counter2 = 0;
                break;
            }
        }
        for (int i = 7; i <= 9; i++) {
            if (array[i] == 'O') {
                counter2++;
            } else {
                counter2 = 0;
                break;
            }
        }
        for (int i = 1; i <= 7; i+=3) {
            if(array[i] == 'O'){
                counter2++;
            }else{
                counter2 = 0;
                break;
            }
        }
        for (int i = 1; i <= 7; i+=3) {
            if(array[i] == 'O'){
                counter2++;
            }else{
                counter2 = 0;
                break;
            }
        }
        for (int i = 2; i <= 8; i+=3) {
            if (array[i] == 'O') {
                counter2++;
            } else {
                counter2 = 0;
                break;
            }
        }
        for (int i = 3; i <= 9; i+=3) {
            if(array[i] == 'O'){
                counter2++;
            }else{
                counter2 = 0;
                break;
            }
        }
        for (int i = 3; i < 7; i+=2) {
            if(array[i] == 'O'){
                counter2++;
            }else{
                counter2 = 0;
                break;
            }
        }
        for (int i = 0; i <= 9; i+=4) {
            if(array[i] == 'O'){
                counter2++;
            }else{
                counter2 = 0;
                break;
            }
        }
        if(counter2 >= 3){
            ifWinner = 'O';
        }else if(counter1 >= 3){
            ifWinner = 'X';
        }
        return ifWinner;
    }
    public static boolean placeSymbolOnBoard(char[] array, int location, char symbol){
        char ifSomeoneWin;
        if(symbol == 'X'){
            array[location] = symbol;
            for (int i = 1; i <= 9; i += 3) {
                for (int j = i; j <= i+2; j++) {
                    if (array[location] == i) {
                        System.out.print(symbol);
                    } else {
                        System.out.print(j + " ");
                    }
                }
                System.out.println("");
            }
        }else{
            array[location] = symbol;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 9; j++) {
                    if(array[location] == i){
                        System.out.print(symbol);
                    }else {
                        System.out.print(array[i] + " ");
                    }
                }
                System.out.println("");
            }
        }
        ifSomeoneWin = checkWinner(array);
        boolean finalCheck = false;
        if(ifSomeoneWin == 'O'){
            finalCheck = true;
        }else if(ifSomeoneWin == 'X'){
            finalCheck = true;
        }
        return finalCheck;
    }
}
