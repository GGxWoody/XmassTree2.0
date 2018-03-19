package com.pgs.javadev.programStart;

import com.pgs.javadev.interfaces.TreeDraw;
import com.pgs.javadev.treeDirectionDraw.*;


public class Main {
    public static void main(String[] args) {
        TreeDraw tu = new TreeRight(5);
        tu.drawTree();
    }
}
