import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        InsertionSort sort = new InsertionSort();

        int[] arr ={1,10,34,2,5,25,67,89,100,23,4};

        System.out.println("Arreglo Original:");
        System.out.println(Arrays.toString(arr));
        sort.sort(arr);
    }
}
