package com.javadp;

public class Builder {
    public final String profession;
    public final String name;
    public String hairColor;
    public String weapon;

    public Builder(String profession, String name) {
        if (profession == null || name == null) {
            throw new IllegalArgumentException("profession and name can not be null");
        }
        this.profession = profession;
        this.name = name;
    }

    public Builder withHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public Builder withWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public Hero build() {
        return new Hero(this);
    }
}
