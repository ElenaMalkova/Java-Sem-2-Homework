import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

//Method
public class task2 {
    static int[] bubbleSorter(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                    try {
                        try (FileWriter myWriter = new FileWriter("myLog.txt")) {
                            myWriter.write(Arrays.toString(array));
                        }
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                      }
                }
                
            }
        }
        return array;
    }

    // Code
    public static void main(String[] args) {
       
            int[] arr = { 2, 7, 89, 5, 13, 60, 34 };
            bubbleSorter(arr);
           
    }
}
