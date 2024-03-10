package org.demo.montyhallsimulation;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MontyHallGameTest {

    @Test
    public void testSwitchDoor() {
        MontyHallGame game = new MontyHallGame();
        game.setPlayerChoice(0);
        assertTrue(game.switchDoor());
    }

    @Test
    public void testSwitchDoorWhenPlayerChoosesCar() {
        MontyHallGame game = new MontyHallGame();
        game.setPlayerChoice(game.getCarPosition());
        assertFalse(game.switchDoor());
    }

    @Test
    public void testOpenGoatDoorWhenPlayerChoosesCar() {
        MontyHallGame game = new MontyHallGame();
        game.setPlayerChoice(game.getCarPosition());
        assertFalse(game.openGoatDoor());
    }

    @Test
    public void testSwitchDoorWithoutChoosing() {
        MontyHallGame game = new MontyHallGame();
        game.setPlayerChoice(0);
        assertFalse(game.switchDoor());
    }
}