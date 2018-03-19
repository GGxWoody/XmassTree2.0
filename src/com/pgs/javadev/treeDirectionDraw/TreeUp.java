package com.pgs.javadev.treeDirectionDraw;

import com.pgs.javadev.interfaces.TreeDraw;

public class TreeUp implements TreeDraw {
    private int treeSize;

    public TreeUp(int treeSize) {
        this.treeSize = treeSize;
    }

    public void drawTree() {
        for (int i = 0; i < treeSize; i++) {
            drawLine(i);
        }
    }

    public void drawLine(int lineNumber) {
        CharDraw.writeSpaces(this.treeSize - lineNumber - 1);
        CharDraw.writeStars(lineNumber * 2 + 1);
        CharDraw.endLine();
    }
}
