package com.javadp;

import static org.junit.Assert.assertFalse;
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
        RoundHole roundHole = new RoundHole(5);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        assertFalse(roundHole.fits(largeSqPegAdapter));
    }
}
