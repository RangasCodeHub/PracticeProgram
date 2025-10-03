package org.example;

import java.util.*;

public class PalindromeTimeInstance {
    public static void main(String[] args) {
        String hours = "";
        String mins = "";
        int count = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= 24; i++) {
            String s = Integer.toString(i);
            if (s.length() == 1) {
                hours = "0" + s;
            } else {
                hours = s;
            }
            for (int j = 0; j <= 59; j++) {
                String s1 = Integer.toString(j);
                if (s1.length() == 1) {
                    mins = "0" + s1;
                } else {
                    mins = s1;
                }
                String time = hours + ":" + mins;
                list.add(time);
            }
        }
        System.out.println("Total time instances in 24 hrs:" + list.size());
        for (String s : list) {
            if (isPalindrome(s)) {
                System.out.println(s);
                count++;
            }
        }
        System.out.println("Palindrome time instances:" + count);
    }

    public static boolean isPalindrome(String s) {
        // Convert string to lowercase for
        // case-insensitive comparison
        s = s.toLowerCase();
        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        // Compare the original string with
        // the reversed string
        return s.equals(rev);
    }
}