package com.company;

public class Lab07_17_03 {

    public static void main(String[] args)
    {
	    LabSuperClass labSuperClass = new LabSuperClass(10);
	    System.out.println(labSuperClass.toString());

	    LabSubClass labSubClass = new LabSubClass(11, 'A');
        System.out.println(labSubClass.toString());

        LabSubSubClass labSubSubClass = new LabSubSubClass(12, 'B', "sub text");
        System.out.println(labSubSubClass.toString());
    }
}
