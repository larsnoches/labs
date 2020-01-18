package com.company;

public class LabSuperClass {
    public int number;

    public LabSuperClass(int numberValue)
    {
        this.number = numberValue;
    }

    public void setValues(int numberValue)
    {
        this.number = numberValue;
    }

    @Override
    public String toString()
    {
        String res = "Super class name: " +
                     this.getClass().getSimpleName() + " \n " +
                     "number value is: " + String.valueOf(this.number) + "\n";
        return res;
    }
}
