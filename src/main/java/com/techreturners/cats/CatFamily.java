package com.techreturners.cats;

abstract class CatFamily implements Cat {

    private boolean isSleeping = false;
    private String setting;
    private int averageHeight;

    public CatFamily(String setting, int averageHeight){
        this.setting = setting;
        this.averageHeight = averageHeight;
    }

    public boolean isAsleep(){
        return isSleeping;
    };

    public void goToSleep(){
        this.isSleeping = true;
    }

    public void wakeUp(){
        this.isSleeping = false;
    }

    public String getSetting(){
        return this.setting;
    }

    public int getAverageHeight(){
        return this.averageHeight;
    }

    public abstract String eat();

}
