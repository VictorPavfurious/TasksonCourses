package Polidrome;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String words = reader.readLine();
        String line = "";

        for (int j = words.length() - 1; j >= 0; j--) {
            line += words.charAt(j);
        }
        findPolidrome(words,line);
    }

    public static void findPolidrome(String line, String line2) {
        if(line.equals(line2)) {
            System.out.println("is polidrome");
        }
        else {
            System.out.println("is not polidrome");
        }
    }
}
/*
Given a string, detect if it is a palindrome.
        * Palindrome is a sequence of chars which reads the same backward or forward.
        Format
        Input
        {string}
        Output
        {is palindrome | isn't palindrome}
        Example
        Input
        madam
        Output
        is palindrome
*/
