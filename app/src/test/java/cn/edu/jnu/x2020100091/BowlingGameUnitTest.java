package cn.edu.jnu.x2020100091;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    private BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }


    @Test
    public void test20ten() {
        repeatedRoll(10,12);
        assertEquals(300, bowlingGame.score());
    }

    @Test
    public void test20zero() {
        repeatedRoll(0,21);
        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void testcomple() {
        bowlingGame.roll(3);
        bowlingGame.roll(7);
        bowlingGame.roll(6);
        repeatedRoll(0,18);
        assertEquals(22, bowlingGame.score());
    }

    @Test
    public void testcomple1() {
        bowlingGame.roll(10);
        bowlingGame.roll(10);
        bowlingGame.roll(3);
        bowlingGame.roll(5);
        repeatedRoll(0,17);
        assertEquals(49, bowlingGame.score());
    }

    @Test
    public void testcomple2() {
        bowlingGame.roll(3);
        bowlingGame.roll(7);
        bowlingGame.roll(8);
        repeatedRoll(1,17);
        assertEquals(43, bowlingGame.score());
    }

    private void repeatedRoll(int pin, int times) {
        for(int i=0;i<times;i++)
        {
            bowlingGame.roll(pin);
        }
    }
}