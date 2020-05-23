package com.size;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ComplexityMeasureOld {

    /*
     * code complextiy due to size variables
     * */
    private int cs;
    private int wkw;
    private int wid;
    private int wop;
    private int wnv;
    private int wsl;

    private int nkw;
    private int nid;
    private int nop;
    private int nnv;
    private int nsl;


    public int complexity(int wkw, int wid, int wop, int wnv, int wsl, int nkw, int nid, int nop, int nnv, int nsl) {
        return wkw * nkw + wid * nid + wop * nop + wnv * nnv + wsl * nsl;
    }

    public void calcIdentifiers(String line){
        boolean isClass;
        boolean isMethod;
        if(line.contains("public")){

        }
        if(line.contains("class")){
            isClass = true;
        }

    }
}