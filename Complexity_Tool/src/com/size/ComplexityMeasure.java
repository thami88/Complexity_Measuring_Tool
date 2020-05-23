package com.size;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ComplexityMeasure {

    public final String PLUS = "+";
    public final String PUBLIC = "public";
    public final String SYSTEM = "System";
    public final String CLASS = "class";

    int nkw = 0;
    int nid = 0;
    int nop = 0;
    int nnv = 0;


    int wkw = 1;
    int wid = 1;
    int wop = 1;
    int wnv = 1;
    int wsl = 1;
    


    public ComplexityMeasure() {
		
	}

	public int complexity() {
        return wkw * nkw + wid * nid + wop * nop + wnv * nnv + wsl * nslDouble / 2;
    }

    int nslDouble = 0;

    public void countNkw(String word) {
        if (CodeIdentifer.isKeyword(word)) {
            this.nkw++;
        }
    }

    public void countNid(String word) {
        String newword = word.replace(")", "");
        if (!CodeIdentifer.isKeyword(newword) && !CodeIdentifer.isDataType(newword) && !(newword.trim().equalsIgnoreCase("{"))) {
//            System.out.println(word);
            this.nid++;
        }
    }


    public void calcNop(String word) {
        if (CodeIdentifer.isOperator(word)) {
            this.nop++;
        }
        if (word.contains(".\")")) {
            this.nop--;
        }
    }

    public void calcNid(String word) {
        if (!CodeIdentifer.isOperator(word)) {
//            System.out.println(word);
            this.nid++;
        }
    }


    public void countNsl(String word) {
        if (word.contains("\"")) {
            this.nslDouble++;
        }
    }


    public void countnnv(String word) {
        if (word.chars().anyMatch(Character::isDigit)) {
            this.nnv++;
        }
    }


    public void opCompleteCalc(String word2) {
        String word3 = word2.trim();
        if (!word3.isEmpty()) {
            for (String subword3 : word3.split(" ")) {
                if (!subword3.contains(".")) {
                    System.out.println(subword3);
                    this.calcNop(subword3);

                } else if (subword3.contains(".")) {
                    String newCreateWord = subword3.replace(".", "Q.Q");
                    for (String newWord : newCreateWord.split("Q")) {
                        this.calcNop(newWord);
                        System.out.println(newWord);
                        if (!newCreateWord.contains("\"")) {
                            this.calcNid(newWord);
                        }

                    }
                }
            }
        }
    }

    public void nidCalcControlled(String word2) {
        String word3 = word2.trim();
        if (!word3.isEmpty()) {
            boolean iscontrolled = false;
            for (String subword3 : word3.split(" ")) {
                if (CodeIdentifer.isControlStructure(subword3)) {
                    iscontrolled = true;
                } else if (iscontrolled) {
                    String newwords = subword3.replace("{", "").trim();
                    if (!newwords.isEmpty() && !(newwords.chars().anyMatch(Character::isDigit)) && !CodeIdentifer.isOperator(newwords)) {
//                        System.out.println(subword3);
                        this.nid++;
                    }
                }

            }

        }
    }

    public void nidWithStringLiterals(String word2) {
        String word3 = word2.trim();
        if (!word3.isEmpty()) {
            if (word3.contains("\"")) {
                for (String word : word3.split("\"")) {
                    if (word.contains(PLUS)) {
                        this.nid++;

                    }
                }
            }
        }
    }

    public void measureComplexity() throws FileNotFoundException {

        FileInputStream fis = null;
        //enter the file location here
        fis = new FileInputStream(new File("D:\\uploaded_files\\temp.txt"));
        Scanner sc = new Scanner(fis);
        boolean insideClass = false;
        boolean isInsideMethod = false;
        boolean isLiteralInitialized = false;
        while (sc.hasNextLine()) {

            String readline = sc.nextLine();

            for (String word1 : readline.split(" ")) {

                String word = word1.trim();
                if (word.contains("//")) {
                    break;
                }
                if (!word.isEmpty()) {
                    this.countNkw(word);
                    this.countNsl(word);
                    if (word.equalsIgnoreCase("}")) {
                        continue;
                    }
                    if (word.contains(CLASS)) {
                        insideClass = true;
                    }
                    if (word.contains(PUBLIC)) {
                        isInsideMethod = true;
                    }
                    if (word.contains(SYSTEM)) {
                        isLiteralInitialized = true;
                    }
                    if (insideClass || isInsideMethod) {
                        this.countNid(word);
                    }
                    if (!isLiteralInitialized) {
                        this.countnnv(word);
                    }
                }
            }
            if (insideClass) {
                insideClass = false;
            }
            if (isInsideMethod) {
                isInsideMethod = false;
            }
            if (isLiteralInitialized) {
                isLiteralInitialized = false;
            }


            for (String word2 : readline.split("\\(\"")) {
                if (word2.contains("//")) {
                    break;
                }

                this.opCompleteCalc(word2);
                this.nidCalcControlled(word2);
                this.nidWithStringLiterals(word2);
                //remaining nid
            }
        }

    }


    public int getcomlex() {
        ComplexityMeasure complexityMeasure = new ComplexityMeasure();
        try {
            complexityMeasure.measureComplexity();
        } catch (FileNotFoundException ex) {}

 

        System.out.println("nkw " + complexityMeasure.nkw);
        System.out.println("nid " + complexityMeasure.nid);
        System.out.println("nsl " + complexityMeasure.nslDouble / 2);
        System.out.println("nnv" + complexityMeasure.nnv);
        System.out.println("nop" + complexityMeasure.nop);

 


        System.out.println(complexityMeasure.complexity());
        return complexityMeasure.complexity();
    }
}
