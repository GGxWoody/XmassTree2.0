package com.pgs.javadev.treeDirectionDraw;

import com.pgs.javadev.interfaces.TreeDraw;

public class TreeLeft implements TreeDraw {
    private int treeSize;

    public TreeLeft(int treeSize) {
        this.treeSize = treeSize;
    }

    public void drawTree() {
        for (int i = 0; i < this.treeSize * 2 + 1; i++) {
            drawLine(i);
            CharDraw.endLine();
        }
    }

    public void drawLine(int lineNumber) {
        if (lineNumber <= this.treeSize) {
            CharDraw.writeSpaces(this.treeSize - lineNumber);
            CharDraw.writeStars(lineNumber);
        } else {
            CharDraw.writeSpaces(lineNumber - this.treeSize);
            CharDraw.writeStars((this.treeSize * 2 + 1) - lineNumber - 1);
        }
    }
}
