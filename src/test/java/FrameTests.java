import org.example.Frame;
import org.junit.Test;
import static org.junit.Assert.*;


public class FrameTests {



    @Test
    public void frameCorrectlyCountsScoresForAllLegalPossibilites(){
        Frame frame = new Frame("X");
        assertEquals(frame.getTotalPins(), 10);
        assertTrue(frame.isStrike());
        assertFalse(frame.isSpare());

        Frame frame2 = new Frame("9/");
        assertEquals(frame.getTotalPins(), 10);
        assertFalse(frame2.isStrike());
        assertTrue(frame2.isSpare());

        Frame frame3 = new Frame("--");
        assertEquals(frame3.getTotalPins(), 0);
        assertFalse(frame3.isStrike());
        assertFalse(frame3.isSpare());

        Frame frame4 = new Frame("-/");
        assertEquals(frame4.getTotalPins(), 10);
        assertFalse(frame4.isStrike());
        assertTrue(frame4.isSpare());

        Frame frame5 = new Frame("9-");
        assertEquals(frame5.getTotalPins(), 9);
        assertFalse(frame5.isStrike());
        assertFalse(frame5.isSpare());

        Frame frame6 = new Frame("-3");
        assertEquals(frame6.getTotalPins(), 3);
        assertFalse(frame6.isStrike());
        assertFalse(frame6.isSpare());

        Frame frame7 = new Frame("53");
        assertEquals(frame7.getTotalPins(),8);
        assertFalse(frame6.isStrike());
        assertFalse(frame6.isSpare());
    }
}
