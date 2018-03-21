package com.pgs.javadev.treeDirectionDraw;


class CharDraw {

    static void writeStars(int starsNumber) {
        for (int i = 0; i < starsNumber; i++) {
            System.out.print("*");
        }

    }

    static void writeSpaces(int spaceNumber) {
        for (int i = 0; i < spaceNumber; i++) {
            System.out.print(" ");
        }
    }

    static void endLine() {
        System.out.println();
    }
}