package com.company;

public class LabSuperClass {
    public char symbol;

    public LabSuperClass(char symbolValue)
    {
        this.symbol = symbolValue;
    }

    public LabSuperClass(LabSuperClass copyValue)
    {
        this.symbol = copyValue.symbol;
    }

}
