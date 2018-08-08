package MonotonePart;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        monotoneSequence(a, size);

    }

    public static void monotoneSequence(int[] array, int size) {
        size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                array[i] = (array[i + 1] + array[i - 1]) / 2;
            }
            System.out.println(array[i]);
        }
    }

}
