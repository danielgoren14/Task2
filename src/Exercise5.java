import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int location;
        char symbol = 'X';
        char[] array= {'1','2','3','4','5','6','7','8','9'};
        printBoard(array);
        for (int i = 0; i < 9; i++) {
            System.out.println("Please enter the number of the location you want to choose(not X or O): ");
            location = scanner.nextInt();
            location = getPositionFromUser(array,location);
            array[location -1] = symbol;
            printBoard(array);
            placeSymbolOnBoard(array,location,symbol);
            boolean returnNewBoard  = placeSymbolOnBoard(array,location,symbol);
            if(returnNewBoard){
                break;
            }
            if(i % 2 == 0){
                symbol = 'O';
            }else{
                symbol = 'X';
            }
        }
        if(checkWinner(array) == '-'){
            System.out.println("There is no Winner");
        }else{
            System.out.println(checkWinner(array) +" is the Winner");
        }
    }
    public static void printBoard(char [] array){
        for (int i = 0; i < 9; i++) {
            System.out.print(array[i]+ " ");
            if(i == 2 || i == 5){
                System.out.println("");
            }
        }
    }
    public static boolean isAvailable(char[] array,int location){
        boolean isPlaceAlreadychosen = true;
        if(array[location] == 'X' || array[location] =='O'){
            isPlaceAlreadychosen = false;
        }
        return isPlaceAlreadychosen;
    }
    public static int getPositionFromUser(char[] array,int location){
        Scanner scanner = new Scanner(System.in);
        while(location < 1 || location > 9 || array[location - 1] == 'X' || array[location - 1] == 'O'){
            System.out.println("Please enter the location you want to choose(1-9 and not a place which is already X or O): ");
            location = scanner.nextInt();
        }
        return location;
    }
    public static char checkWinner(char[] array){
        char winner = '-';
        if((array[0] == 'X' && array[1]== 'X' && array[2] =='X') ||
                (array[3] == 'X' && array[4]== 'X' && array[5] =='X')||
                (array[6] == 'X' && array[7]== 'X' && array[8] =='X')||
                (array[0] == 'X' && array[3]== 'X' && array[6] =='X')||
                (array[1] == 'X' && array[4]== 'X' && array[7] =='X')||
                (array[2] == 'X' && array[5]== 'X' && array[8] =='X')||
                (array[0] == 'X' && array[4]== 'X' && array[8] =='X')||
                (array[2] == 'X' && array[4]== 'X' && array[6] =='X')){
            winner = 'X';
        }else if((array[0] == 'O' && array[1]== 'O' && array[2] =='O') ||
                (array[3] == 'O' && array[4]== 'O' && array[5] =='O')||
                (array[6] == 'O' && array[7]== 'O' && array[8] =='O')||
                (array[0] == 'O' && array[3]== 'O' && array[6] =='O')||
                (array[1] == 'O' && array[4]== 'O' && array[7] =='O')||
                (array[2] == 'O' && array[5]== 'O' && array[8] =='O')||
                (array[0] == 'O' && array[4]== 'O' && array[8] =='O')||
                (array[2] == 'O' && array[4]== 'O' && array[6] =='O')) {
            winner = 'O';
        }
        return winner;
    }
    public static boolean placeSymbolOnBoard(char[] array, int location, char symbol) {
        boolean isWinner = false;
        array[location - 1] = symbol;
        char isThereWinner = checkWinner(array);
        if (isThereWinner == 'X' || isThereWinner == 'O') {
            isWinner = true;
        }
        return isWinner;
    }
}
