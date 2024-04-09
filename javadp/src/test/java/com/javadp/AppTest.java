package com.javadp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void singletonTests()
    {
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        assertEquals("FOO", singleton.value);
        assertEquals("FOO", anotherSingleton.value);
    }

    @Test
    public void adapterTests()
    {
        Charger adapter = new Iphone4sTo6sAdapter();
        IPhone6s iphone6s = new IPhone6s(adapter);
        iphone6s.OnCharge();
    }

    @Test
    public void builderTests()
    {
        Builder heroBuilder = new Builder("Photographer", "Peter Parker")
            .withHairColor("Black")
            .withWeapon("Web shooters");
        
        Hero spider = heroBuilder.build();

        assertEquals("Photographer", spider.profession);
        assertEquals("Peter Parker", spider.name);
        assertEquals("Black", spider.hairColor);
        assertEquals("Web shooters", spider.weapon);
    }
}
