package com.company;

public class LabSuperClass {
    private String str1;

    public LabSuperClass(String str1Value)
    {
        this.setValues(str1Value);
    }

    public void setValues()
    {
        this.str1 = "text";
    }

    public void setValues(String str1Value)
    {
        this.str1 = str1Value;
    }

    public int getStr1()
    {
        return str1.length();
    }
}
