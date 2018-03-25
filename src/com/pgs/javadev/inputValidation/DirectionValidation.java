package com.pgs.javadev.inputValidation;

public class DirectionValidation {

    public static Boolean isDirectionCorrect(String treeDirection) {
        switch (treeDirection.toLowerCase().trim()) {
            case "up":
                return true;
            case "down":
                return true;
            case "left":
                return true;
            case "right":
                return true;
            default:
                return false;
        }
    }
}
