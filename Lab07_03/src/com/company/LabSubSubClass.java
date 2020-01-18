package com.company;

public class LabSubSubClass extends LabSubClass {
    public String str1;

    public LabSubSubClass(int numberValue, char symbolValue, String str1Value)
    {
        super(numberValue, symbolValue);
        this.str1 = str1Value;
    }

    public void setValues(int numberValue, char symbolValue, String str1Value)
    {
        super.setValues(numberValue, symbolValue);
        this.str1 = str1Value;
    }

    @Override
    public String toString()
    {
        String res = "SubSub class name: " +
                this.getClass().getSimpleName() + " \n " +
                "number value is: " + String.valueOf(super.number) + "\n" +
                "symbol value is: " + String.valueOf(super.symbol) + "\n" +
                "str1 value is: " + this.str1 + "\n";
        return res;
    }
}
