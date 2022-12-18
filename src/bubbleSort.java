import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
       int[]array = {4, 8, 11, 22, 1, 17, };
       bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array){
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < array.length - 1 ; i++){
                if (array[i] > array[i + 1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}


