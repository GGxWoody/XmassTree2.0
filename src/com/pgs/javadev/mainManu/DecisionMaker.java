package com.pgs.javadev.mainManu;

import com.pgs.javadev.interfaces.TreeDraw;
import com.pgs.javadev.treeDirectionDraw.*;


class DecisionMaker {

    static TreeDraw TreeToDraw(String treeDirection, int treeSize) {
        TreeDraw decisionTree;
        switch (treeDirection) {
            case "up":
                 decisionTree = new TreeUp(treeSize);
                return decisionTree;
            case "down":
                decisionTree = new TreeDown(treeSize);
                return decisionTree;
            case "left":
                decisionTree = new TreeLeft(treeSize);
                return decisionTree;
            case "right":
                decisionTree = new TreeRight(treeSize);
                return decisionTree;
            default:
                decisionTree = new TreeUp(treeSize);
                return decisionTree;

        }
    }

}
