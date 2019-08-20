package com.QA;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;
    private BlackJackGame blackJackGame;

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


    @Test
    public void blackJackTest(){
        blackJackGame = new BlackJackGame();
        assertEquals(21,blackJackGame.blackJackGameTesting(21,3));
        assertEquals(21,blackJackGame.blackJackGameTesting(3,21));
        assertEquals(21,blackJackGame.blackJackGameTesting(21,21));
        assertEquals(2,blackJackGame.blackJackGameTesting(2,23));
        assertEquals(0,blackJackGame.blackJackGameTesting(23,23));
        assertEquals(0,blackJackGame.blackJackGameTesting(-23,-23));


    }

}


