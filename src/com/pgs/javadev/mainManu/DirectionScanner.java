package com.pgs.javadev.mainManu;

import com.pgs.javadev.inputValidation.DirectionValidation;
import com.pgs.javadev.messages.MASSAGES;

import java.util.Scanner;

class DirectionScanner {

    static String ScanDirection() {
        Scanner inputString = new Scanner(System.in);
        System.out.println(MASSAGES.TREE_DIRECTION);
        String treeDirection = inputString.nextLine();
        if (DirectionValidation.isDirectionCorrect(treeDirection)) {
            return treeDirection;
        } else {
            System.err.println(MASSAGES.ERROR_WRONG_STRING);
            return ScanDirection();
        }
    }
}
