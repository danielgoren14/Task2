public class Exercise6 {
    public static boolean valid(String equation){
        boolean equationIsValid = false;
        if(equation.contains("x^2") && equation.contains("x^") && equation.contains("=0")){
            equationIsValid = true;
        }
        return equationIsValid;
    }
    public static int parameterA(String equation){
        int a = 1;
        if(equation.startsWith('-')){
            for (int i = 1; i < 0; i++) {
                if(equation.charAt(i) == 'x') {
                    if (i == 1) {
                        a = -1;
                    } else {
                        a = equation.substring(0, i - 1);
                    }
                }
            }
        }

    }
    public static int parameterB(String equation){
        int b = 0;
        if()
    }
}
