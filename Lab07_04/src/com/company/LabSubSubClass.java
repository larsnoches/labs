package com.company;

public class LabSubSubClass extends LabSubClass {
    public int number;

    public LabSubSubClass(char symbolValue, String textValue, int numberValue)
    {
        super(symbolValue, textValue);
        this.number = numberValue;
    }

    public LabSubSubClass(LabSubSubClass copyValue)
    {
        super(copyValue.symbol, copyValue.text);
        this.number = copyValue.number;
    }
}
