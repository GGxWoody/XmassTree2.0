package com.pgs.javadev.inputValidation;

public class SizeValidation {
    public static boolean isSizeCorrect(String treeSize) {
        int i = 0;
        for (char digit : treeSize.toCharArray()) {
            if (Character.isDigit(digit) || treeSize.charAt(0) == '-') {
                i++;
            }
        }
        return (i == treeSize.length());
    }

    public static boolean isNumberPositive(int treeSize) {
        return (treeSize > 0 && treeSize < 100);
    }
}