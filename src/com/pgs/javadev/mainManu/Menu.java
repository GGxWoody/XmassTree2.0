package com.pgs.javadev.mainManu;

import com.pgs.javadev.interfaces.TreeDraw;
import com.pgs.javadev.messages.MASSAGES;

public class Menu {
    public static void StartProgram(){
        System.out.println(MASSAGES.WELCOME_MASSAGE);
        TreeDraw finalTree = DecisionMaker.TreeToDraw(DirectionScanner.ScanDirection(),SizeScanner.TreeSize());
        finalTree.drawTree();
    }

}
