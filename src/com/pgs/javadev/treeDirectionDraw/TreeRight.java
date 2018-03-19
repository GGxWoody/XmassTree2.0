package com.pgs.javadev.treeDirectionDraw;

import com.pgs.javadev.interfaces.TreeDraw;

public class TreeRight implements TreeDraw {
    private int treeSize;

    public TreeRight(int treeSize) {
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
            CharDraw.writeStars(lineNumber);
        } else {
            CharDraw.writeStars((this.treeSize*2+1)-lineNumber-1);
        }
    }
}
