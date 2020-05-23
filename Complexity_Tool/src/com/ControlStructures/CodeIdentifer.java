package com.ControlStructures;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CodeIdentifer {

    private static Set<String> keywords;
    private static Set<String> operators;
    
//    for control structures and datatypes
    private static Set<String> dataTypes;
    private static Set<String> controlStructures;



    public static void setKeyword(){
        Set<String> s = new HashSet<String>();

//              keyword addition
        String[] kws = {
                // literals
                "import", "public","new","return","static","extends",
                "class","void","args"

        };

        for (String kw : kws)
            s.add(kw);

        keywords = Collections.unmodifiableSet(s);
    }

    public static boolean isKeyword(String keyword){
        setKeyword();
        return (keywords.contains(keyword));
    }

//    public static boolean isKeywordandDataType(String keyword){
//        setKeyword();
//        setDataTypes();
//        return (keywords.contains())
//    }

    public static void setOperators(){

        Set<String> op = new HashSet<String>();
        String[] ops =
                {"+", "-", "*", "/", "%", "++", "--",
                        "==", "!=", ">", "<", ">=", "<=",
                        "&&", "||", "!", "|", "^", "~"
                        , "<<", ">>", ">>>", "<<<",
                        ",", "->", ".", "::",
                        "+=", "-=", "*=", "/=", "=", ">>>=",
                        "|=", "&=", "%=", "<<=", ">>=", "^="
                };

        for (String o : ops)
            op.add(o);
        operators = Collections.unmodifiableSet(op);
    }

    public static boolean isOperator(String operator){
        setOperators();
        return operators.contains(operator);
    }


    public static void setDataTypes(){

        Set<String> ns = new HashSet<String>();
        String[] nkws = {
                "boolean", "char", "byte", "short", "int", "long", "float" , "double","String","Integer"
        };

        for (String nkw : nkws)
            ns.add(nkw);

        dataTypes = Collections.unmodifiableSet(ns);
    }

    public static void setControlStructures(){

        Set<String> s = new HashSet<String>();
        String[] nkws = {
                "if","else","for","while","break","switch","case"
        };

        for (String nkw : nkws)
            s.add(nkw);

        controlStructures = Collections.unmodifiableSet(s);
    }

    public static boolean isControlStructure(String keyword){
        setControlStructures();
        return controlStructures.contains(keyword);
    }

    public static boolean isDataType(String keyword) {
        setDataTypes();
        return dataTypes.contains(keyword);
    }
}





