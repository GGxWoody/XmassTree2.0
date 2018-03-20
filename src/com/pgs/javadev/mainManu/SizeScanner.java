package com.pgs.javadev.mainManu;

import com.pgs.javadev.inputValidation.SizeValidation;
import com.pgs.javadev.messages.MASSAGES;

import java.util.Scanner;

class SizeScanner {

    static int TreeSize() {
        Scanner inputSize = new Scanner(System.in);
        System.out.println(MASSAGES.TREE_SIZE);
        String treeSize = inputSize.nextLine();
        if (SizeValidation.isSizeCorrect(treeSize)) {
            if (SizeValidation.isNumberPositive(Integer.parseInt(treeSize))) {
                return Integer.parseInt(treeSize);
            } else {
                System.err.println(MASSAGES.ERROR_WRONG_SIZE);
                return TreeSize();
            }
        } else {
            System.err.println(MASSAGES.ERROR_NOT_NUMBER);
            return TreeSize();
        }

    }
}

