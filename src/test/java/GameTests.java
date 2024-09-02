import org.example.Game;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTests {

    @Test
    public void gameCorrectlyCountsOnlyDigitsScore(){

        String[] scores = {"32", "51", "50", "00", "43", "22", "71", "51", "00", "13"};
        Game game = new Game(scores);
        int score = game.getTotalScore();


        String[] scores2 = {"51", "50", "00", "43", "22", "71", "51", "00", "13"};
        Game game2 = new Game(scores2);
        int score2 = game2.getTotalScore();

        String[] scores3 = {};
        Game game3 = new Game(scores3);
        int score3 = game3.getTotalScore();


        assertNotNull(game);
        assertEquals(score,45);

        assertNotNull(game2);
        assertEquals(score2,40);

        assertNotNull(game3);
        assertEquals(score3,0);

    }
}
