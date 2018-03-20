package com.pgs.javadev.mainManu;

import com.pgs.javadev.interfaces.TreeDraw;
import com.pgs.javadev.treeDirectionDraw.*;


public class DecisionMaker {

    public static TreeDraw TreeToDraw(String treeDirection, int treeSize) {
        switch (treeDirection) {
            case "up":
                TreeDraw upTree = new TreeUp(treeSize);
                return upTree;
            case "down":
                TreeDraw downTree = new TreeDown(treeSize);
                return downTree;
            case "left":
                TreeDraw leftTree = new TreeLeft(treeSize);
                return leftTree;
            case "right":
                TreeDraw rightTree = new TreeRight(treeSize);
                return rightTree;
            default:
                TreeDraw defaultTree = new TreeUp(treeSize);
                return defaultTree;

        }
    }

}
