import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[51]; //51 jeśli uwzględniamy 0 jako liczbę parzystą

        for (int i = 0; i < numbers.length; i++)
            numbers [i] = 2 * i;

        String arrayString =  Arrays.toString(numbers);
        System.out.println(arrayString);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }

        System.out.println("Suma: " + sum);
    }

}