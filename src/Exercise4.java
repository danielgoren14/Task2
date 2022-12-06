public class Exercise4 {
    public static int upAndDownArray(int[] array) {
        int index =-1;
        int arrayIndexTop = 0;
        boolean upperSeries = true;
        boolean downSeries = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i+1]) {
                arrayIndexTop = i+1;
            }
        }
        if (arrayIndexTop != 0 && arrayIndexTop != array.length-1) {
            for (int j = 0; j < arrayIndexTop; j++) {
                if (array[j] > array[j+1]) {
                    upperSeries = false;
                }
            }
            for (int k = arrayIndexTop; k <array.length-1;k++){
                if (array[k] <= array[k+1]){
                    downSeries = false;
                }
            }
            if (downSeries && upperSeries){
                index = arrayIndexTop;
            }
        }
        return index;
    }
}