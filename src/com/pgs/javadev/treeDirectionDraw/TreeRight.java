package com.pgs.javadev.treeDirectionDraw;

import com.pgs.javadev.interfaces.TreeDraw;

public class TreeRight implements TreeDraw {
    private int treeSize;

    public TreeRight(int treeSize) {
        this.treeSize = treeSize;
    }

    public void drawTree() {
        for (int i = 0; i <= this.treeSize * 2; i++) {
            drawLine(i);
        }
    }

    public void drawLine(int lineNumber) {
        if (lineNumber <= this.treeSize) {
            CharDraw.writeStars(lineNumber);
            CharDraw.endLine();
        } else {
            CharDraw.writeStars((this.treeSize * 2 + 1) - ++lineNumber);
            CharDraw.endLine();
        }
    }
}