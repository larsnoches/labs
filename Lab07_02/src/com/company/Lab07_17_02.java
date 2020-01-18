package com.company;

public class Lab07_17_02 {

    public static void main(String[] args)
    {
	    LabSuperClass labSuperClass = new LabSuperClass("super text");
	    System.out.printf("Super class str length: %d\n", labSuperClass.getStr1());

	    LabSubClass labSubClass = new LabSubClass(8, "sub text");
        System.out.printf("Sub class str length: %d\n", labSubClass.getStr1());

        labSubClass.setValues();
        System.out.printf("Sub class str length: %d\n", labSubClass.getStr1());

        labSubClass.setValues("another text");
        System.out.printf("Sub class str length: %d\n", labSubClass.getStr1());

        labSubClass.setValues(10);
        System.out.printf("Sub class str length: %d\n", labSubClass.getStr1());

        labSubClass.setValues("another another text", 10);
        System.out.printf("Sub class str length: %d\n", labSubClass.getStr1());
    }
}
