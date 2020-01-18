package com.company;

public class Lab07_17_04 {

    public static void main(String[] args) {
	    LabSuperClass labSuperClass = new LabSuperClass('A');
	    System.out.printf("labSuperClass symbol: %c\n", labSuperClass.symbol);

	    LabSubClass labSubClass = new LabSubClass('B', "sub text");
        System.out.printf("labSubClass symbol: %c\n", labSubClass.symbol);
        System.out.printf("labSubClass text: %s\n", labSubClass.text);

        LabSubSubClass labSubSubClass = new LabSubSubClass('C', "subsub text", 10);
        System.out.printf("labSubSubClass symbol: %c\n", labSubSubClass.symbol);
        System.out.printf("labSubSubClass text: %s\n", labSubSubClass.text);
        System.out.printf("labSubSubClass number: %d\n", labSubSubClass.number);
    }
}
