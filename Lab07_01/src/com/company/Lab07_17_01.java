package com.company;

public class Lab07_17_01 {

    public static void main(String[] args)
    {
	    LabSuperClass labSuperClass = new LabSuperClass("text inside only super-class");
	    String labSuperClassName = labSuperClass.toString();
	    System.out.println(labSuperClassName);

	    LabSubClass labSubClass = new LabSubClass("text via sub-class");
	    String labSubClassName = labSubClass.toString();
        System.out.println(labSubClassName);

        LabSubClass labSubClass2 = new LabSubClass("text via super-class", "text via sub-class");
        String labSubClass2Name = labSubClass2.toString();
        System.out.println(labSubClass2Name);
    }
}
