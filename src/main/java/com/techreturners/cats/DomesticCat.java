package com.techreturners.cats;

public class DomesticCat extends CatFamily{

    public DomesticCat() {
        super("domestic", 23);
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }

}
