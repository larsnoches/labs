package com.company;

public class LabSub2Class extends LabSuperClass {
    private char symbol;

    public LabSub2Class(String textValue, char symbolValue)
    {
        super(textValue);
        this.symbol = symbolValue;
    }

    @Override
    public String toString()
    {
        String res = "Sub2Class name: " +
                this.getClass().getSimpleName() + " \n" +
                "sub2 class text value: " + super.getText() + "\n" +
                "sub2 class symbol value: " + String.valueOf(this.symbol) + "\n";
        return res;
    }
}
