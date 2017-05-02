package com.example.a15017498.demoexplicitintent;

import java.io.Serializable;

/**
 * Created by 15017498 on 2/5/2017.
 */

public class Hero implements Serializable {

    String name;
    int strenth;
    int technicalProwess;


    public Hero(String name, int strenth, int technicalProwess) {
        this.name = name;
        this.strenth = strenth;
        this.technicalProwess = technicalProwess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrenth() {
        return strenth;
    }

    public void setStrenth(int strenth) {
        this.strenth = strenth;
    }

    public int getTechnicalProwess() {
        return technicalProwess;
    }

    public void setTechnicalProwess(int technicalProwess) {
        this.technicalProwess = technicalProwess;
    }
}
