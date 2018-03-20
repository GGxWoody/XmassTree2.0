package com.pgs.javadev.mainManu;

import com.pgs.javadev.interfaces.TreeDraw;

public class Menu {
    public static void StartProgram(){
        TreeDraw finalTree = DecisionMaker.TreeToDraw(DirectionScanner.ScanDirection(),SizeScanner.TreeSize());
        finalTree.drawTree();
    }

}
