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
/*
Given an unsorted array of positive integers.
The array divided into monotone parts in which some elements replaced by negative values.
Find missing positive integers in the array.
Negative elements can be placed only inside a monotone part.
Negative elements cannot be in neighboring cells.
* monotone part - a sequence where each next number greater(less) than previous.
* e.g. 4 5 6 7 8 is the monotone part, but 5 3 1 6 7 is not monotone.
Input
{array_length}
{array_values}
Output
{restored array}
Example
Input
8
1 2 -1 4 7 6 -2 4
Output
1 2 3 4 7 6 5 4
*/
