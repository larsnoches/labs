package com.company;

public class LabSubClass extends LabSuperClass {
    public char symbol;

    public LabSubClass(int numberValue, char symbolValue)
    {
        super(numberValue);
        this.symbol = symbolValue;
    }

    public void setValues(int numberValue, char symbolValue)
    {
        super.setValues(numberValue);
        this.symbol = symbolValue;
    }

    @Override
    public String toString()
    {
        String res = "Sub class name: " +
                this.getClass().getSimpleName() + " \n " +
                "number value is: " + String.valueOf(super.number) + "\n" +
                "symbol value is: " + String.valueOf(this.symbol) + "\n";
        return res;
    }
}
