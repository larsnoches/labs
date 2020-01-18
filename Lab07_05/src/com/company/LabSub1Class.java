package com.company;

public class LabSub1Class extends LabSuperClass {
    private int number;

    public LabSub1Class(String textValue, int numberValue)
    {
        super(textValue);
        this.number = numberValue;
    }

    @Override
    public String toString()
    {
        String res = "Sub1Class name: " +
                this.getClass().getSimpleName() + " \n" +
                "sub1 class text value: " + super.getText() + "\n" +
                "sub1 class number value: " + this.number + "\n";
        return res;
    }
}
