import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[51]; //51 jeśli uwzględniamy 0 jako liczbę parzystą

        for (int i = 0; i < numbers.length; i++)
            numbers [i] = 2 * i;

        /*
        int j = 0;
        while (j < numbers.length) {
            numbers[j] = 2 * j;
            j++;
        }*/

        String arrayString =  Arrays.toString(numbers);
        System.out.println(arrayString);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];

        /*
        int sum = 0;
        int k = 0;
        while (k < numbers.length) {
            sum = sum + numbers[k];
            k++;
        }*/

        System.out.println("Suma: " + sum);
    }

}