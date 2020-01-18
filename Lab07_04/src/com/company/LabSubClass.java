package com.company;

public class LabSubClass extends LabSuperClass {
    public String text;

    public LabSubClass(char symbolValue, String textValue)
    {
        super(symbolValue);
        this.text = textValue;
    }

    public LabSubClass(LabSubClass copyValue)
    {
        super(copyValue.symbol);
        this.text = copyValue.text;
    }
}
