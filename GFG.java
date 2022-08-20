import java.io.*;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {

        String str = "Geeks is a Geek", nstr = "";
        String a = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
            a = nstr.replaceAll("e", "");

        }
        System.out.println("Reversed word: " + a);
    }
}
