package FrequancyElement;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        String words = reader.readLine();

        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == word.charAt(0)) {
                count++;
            }
        }
        System.out.println(word + " element count is " + count);
    }
}
