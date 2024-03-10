package org.demo.montyhallsimulation;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MontyHallGameParameterizedTest {

    private final int playerChoice;
    private final boolean expected;

    public MontyHallGameParameterizedTest(int playerChoice, boolean expected) {
        this.playerChoice = playerChoice;
        this.expected = expected;
    }

    @Parameters(name = "{index}: Player's choice={0}, Expected={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0, true},
                {1, true},
                {2, true}
        });
    }

    @Test
    public void testSwitchDoor() {
        MontyHallGame game = new MontyHallGame();
        game.setPlayerChoice(playerChoice);
        assertEquals(expected, game.switchDoor());
    }
}