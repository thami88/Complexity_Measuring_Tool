package com.ControlStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class ComplexityMeasureCs {

    public final String PLUS = "+";
    public final String PUBLIC = "public";
    public final String SYSTEM = "System";
    public final String CLASS = "class";

    int Wtcs = 0;
    int NC = 0;
    int Ccspps = 0;
    int Ccs = 0;
    
    
    /* Wtcs = Weight due to control structure type  NC = Number of conditions in the control structure */
    public int[] calculateWTCSandNC(String fileContent) {
    	int ifCount = 0;
    	int forCount = 0;
    	int whileCont = 0;
    	int doCount = 0;
    	int switchCount = 0;
    	int caseCount = 0;
    	int NCcount = 0;
    	int[] ar;
		ar=new int [2];
		
    	String[] wordsArray = fileContent.split(" ");
    	for (int wordIndex = 0; wordIndex < wordsArray.length; wordIndex++) {
    		switch (wordsArray[wordIndex]) {
    		case ("if"):
    			ifCount += 1;
    		
    		case ("for"):
    			forCount += 1;
    		
    		case ("while"):
    			whileCont += 1;
    		
    		case ("do"):
    			doCount += 1;
    		
    		case ("switch"):
    			switchCount +=1;
    		
    		case ("case"):
    			caseCount +=1;
    		
    		default :
    			
    		}
    	/*  A conditional control structure such as an ‘if’ or ‘else-if’ condition - 2
        	An iterative control structure such as a ‘for’, ‘while’, or ‘do-while’ loop - 3
	     	The ‘switch’ statement in a ‘switch-case’ control structure- 2
        	Each ‘case’ statement in a ‘switch-case’ control structure- 1  */
    		int wtcs = (ifCount*2 + forCount*3 + (whileCont-doCount)*3 + doCount *3 + switchCount*2 + caseCount*1 );
    		int nc = (ifCount + forCount + (whileCont-doCount) + doCount + switchCount + caseCount );
    		
    		ar[0]=wtcs;
    		ar[1]=nc;
    		
    	}

    	return ar;
    }
    

    /*Ccspps = Ccs value of the program statement in the immediate outer level of the current nesting level. 
    Hence, always the value of Ccspps would be zero for control structures which reside at the first nesting level or outer most nesting level. */
    public int calculateCCSPPS(String fileString) {
    	return 0;
    }
    
     /* Ccs = Complexity of a program statement with a control structure Ccs = (Wtcs * NC) + Ccspps */
    public int calculateCCS(String fileString) {
    	int [] wtcsNc = calculateWTCSandNC(fileString);
    	return ((wtcsNc[0] * wtcsNc[1]) + calculateCCSPPS(fileString));
    }




    public ComplexityMeasureCs() {
		
	}

	public int complexity() {
        return (Wtcs * NC) + Ccspps;
    }

   

  

    public void measureComplexity() throws IOException {

    	String fileName = "D:\\uploaded_files\\temp.txt";
		 File file = new File(fileName);
	        FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);
	        String line;
	        System.out.println("Read text file using BufferedReader");
	        
	        while((line = br.readLine()) != null){
	            System.out.println(line);
	        }
	        //close resources
	        br.close();
	        fr.close();
	        
	       int ccs=  calculateCCS(line);
	       System.out.println("css " + ccs);
    }
		
    
}
