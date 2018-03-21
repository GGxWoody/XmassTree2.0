package com.pgs.javadev.treeDirectionDraw;

import com.pgs.javadev.interfaces.TreeDraw;

public class TreeDown implements TreeDraw {
    private int treeSize;

    public TreeDown(int treeSize) {
        this.treeSize = treeSize;
    }

    public void drawTree() {
        for (int i = this.treeSize - 1; i >= 0; i--) {
            drawLine(i);
        }
    }

    public void drawLine(int lineNumber) {
        CharDraw.writeSpaces(this.treeSize - lineNumber - 1);
        CharDraw.writeStars(lineNumber * 2 + 1);
        CharDraw.endLine();
    }
}
