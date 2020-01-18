package com.company;

public class LabSuperClass {
    private String str1;

    public LabSuperClass(String str1Value)
    {
        this.setStr1(str1Value);
    }

    @Override
    public String toString()
    {
        String res = "Super class name: " +
                      this.getClass().getSimpleName() + "\n " +
                      "super str1: " + this.getStr1();
        return res;
    }

    public String getStr1()
    {
        return str1;
    }

    public void setStr1(String strValue)
    {
        this.str1 = strValue;
    }
}
