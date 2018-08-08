package Substring;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int startIndex = Integer.parseInt(reader.readLine());
        int endIndex = Integer.parseInt(reader.readLine());
        String words = reader.readLine();
        String line = "";

        for (int k = startIndex; k <= endIndex; k++) {
            line += words.charAt(k);
        }
        for (int i = line.length() - 1; i >=0; i--) {
            System.out.print(line.charAt(i));
        }
    }
}
