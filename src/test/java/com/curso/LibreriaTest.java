package com.curso;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class LibreriaTest {

    @Test
    public void suma5y8()
    {
        assertTrue( 13 == Libreria.suma(5,8) );
    }
}
