package com.company;

public class LabSuperClass {
    private String text;

    public LabSuperClass(String textValue)
    {
        this.text = textValue;
    }

    public String getText()
    {
        return text;
    }

    @Override
    public String toString()
    {
        String res = "SuperClass name: " +
                     this.getClass().getSimpleName() + " \n" +
                     "super class text value: " + this.text + "\n";
        return res;
    }
}
