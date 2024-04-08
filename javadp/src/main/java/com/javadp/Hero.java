package com.javadp;

public final class Hero {
    public String profession;
    public String name;
    public String hairColor;
    public String weapon;

    public Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.weapon = builder.weapon;
    }
}
