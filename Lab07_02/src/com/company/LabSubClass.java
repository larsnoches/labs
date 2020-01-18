package com.company;

public class LabSubClass extends LabSuperClass {
    public int number;

    public LabSubClass(int numberValue, String str1Value)
    {
        super(str1Value);
        this.number = numberValue;
    }

    @Override
    public void setValues()
    {
        super.setValues();
        this.number = 1;
    }

    @Override
    public void setValues(String str1Value)
    {
        super.setValues(str1Value);
        this.number = 2;
    }

    public void setValues(int numberValue)
    {
        this.number = numberValue;
    }

    public void setValues(String str1Value, int numberValue)
    {
        super.setValues(str1Value);
        this.number = numberValue;
    }
}
