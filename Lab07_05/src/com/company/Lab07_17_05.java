package com.company;

public class Lab07_17_05 {

    public static void main(String[] args) {
	    LabSuperClass labSuperClass = new LabSuperClass("super-text");
	    System.out.println(labSuperClass.toString());

        LabSub1Class labSub1Class = new LabSub1Class("sub1-text", 10);
        System.out.println(labSub1Class.toString());

        LabSub2Class labSub2Class = new LabSub2Class("sub2-text", 'A');
        System.out.println(labSub2Class.toString());

        LabSuperClass labSuperClassSubTest = new LabSub2Class("from super sub2-text", 'B');
        System.out.println(labSuperClassSubTest.toString());
    }
}
