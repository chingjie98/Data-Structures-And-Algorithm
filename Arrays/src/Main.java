import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] numbers = new int[3];
//        numbers[0] = 5;
//        System.out.println(Arrays.toString(numbers));

        Array num1 = new Array(2);

        num1.Insert(5);
        num1.Insert(8);
        num1.Insert(9);
        num1.Insert(15);
        num1.Insert(9);


        System.out.println(num1.IndexOf(9));
    }
}
