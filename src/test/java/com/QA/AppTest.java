package com.QA;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;

    @Test
    public void mainTest(){
        app = new App();
        String [] input = new String[]{"a"};
        app.main(input  );
    }


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void notEmpty(){
        app = new App();
        assertNotNull(app.addTwo(5,6));
    }

    @Test
    public void checkSame(){
        app = new App();
        assertEquals(1, app.addTwo(1,5));
    }
}


