package Massiv;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Prog {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int valueEnd = Integer.parseInt(reader.readLine());
        int[] lengthMassiv = new int[num];

        for (int i = 0; i < lengthMassiv.length; i++) {
            lengthMassiv[i] = Integer.parseInt(reader.readLine());
        }

        moveLeftArrays(lengthMassiv, valueEnd);
        System.out.println(Arrays.toString(lengthMassiv));
    }

    public static void moveLeftArrays(int[] array, int position) {
        int size = array.length;
        for (int i = 0; i < position; i++) {
            int value = array[0];

            for (int j = 0; j < size - 1; j++) {
                array[j] = array[j+1];
            }
            array[size - 1] = value;
        }

    }

}
