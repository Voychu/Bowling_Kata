import org.example.Frame;
import org.junit.Test;
import static org.junit.Assert.*;


public class FrameTests {


    @Test
    public void frameCorrectlyCountsTotalPinsWithNumbers() {
        Frame frame = new Frame("53");
        assertEquals(frame.getTotalPins(),8);

        Frame frame2 = new Frame("00");
        assertEquals(frame2.getTotalPins(),0);

        Frame frame3 = new Frame("02");
        assertEquals(frame3.getTotalPins(),2);
    }
}
