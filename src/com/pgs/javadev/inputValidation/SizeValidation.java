package com.pgs.javadev.inputValidation;

public class SizeValidation {
    public static boolean isSizeCorrect(String treeSize) {
        int i = 0;
        for (char digit : treeSize.toCharArray()) {
            if (Character.isDigit(digit) || treeSize.charAt(0)=='-') {
                i++;
            }
        }
        if (i == treeSize.length()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNumberPositive(int treeSize) {
        if (treeSize > 0) {
            return true;
        } else {
            return false;
        }
    }
}
