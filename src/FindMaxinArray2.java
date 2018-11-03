import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindMaxinArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size for array");
        int size = input.nextInt();
        int[][] array;
        array = new int[size][size];
        int max = 0;
        int a = array[0][0];
        System.out.println("Enter your element: ");
        for (int i =0;i<array.length;i++){
            for (int j =0;j<array[i].length;j++){
                int number = input.nextInt();
                array[i][j] = number;
                System.out.print(array[i][j] + " ");
                if (a<=array[i][j]){
                    a = array[i][j];
                    max = a;
                }
            }
            System.out.println();
        }
        System.out.println("Max number: " + max);
    }
}
