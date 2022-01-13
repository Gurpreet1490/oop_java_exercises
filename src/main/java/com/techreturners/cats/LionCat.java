package com.techreturners.cats;

public class LionCat extends CatFamily{

    public LionCat() {
        super("wild", 1100);
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }

}
