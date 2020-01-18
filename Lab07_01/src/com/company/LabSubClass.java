package com.company;

public class LabSubClass extends LabSuperClass {
    private String str2;

    public LabSubClass(String str1Value)
    {
        super(str1Value);
    }

    public LabSubClass(String str1Value, String str2Value)
    {
        super(str1Value);
        this.str2 = str2Value;
    }

    @Override
    public String toString()
    {
        String res = "Sub class name: " +
                     this.getClass().getSimpleName() + "\n " +
                     "sub text is: " + this.getStr2() + " \n " +
                     "super text is: " + super.getStr1();
        return res;
    }

    public void setStr2(String str2Value)
    {
        this.str2 = str2Value;
    }

    public String getStr2()
    {
        return this.str2;
    }
}
