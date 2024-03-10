package org.demo.montyhallsimulation;
public class MontyHallGame {

    private int carPosition;
    private int playerChoice;

    public MontyHallGame() {

        carPosition = (int) (Math.random() * 3);
        playerChoice = -1;
    }

    public void setPlayerChoice(int playerChoice) {
        if(playerChoice < 0 || playerChoice > 2) {
            throw new IllegalArgumentException("Неверный выбор игрока. Пожалуйста, выберите дверь от 0 до 2.");
        }
        this.playerChoice = playerChoice;
    }

    public int getCarPosition() {
        return carPosition;
    }

    public boolean openGoatDoor() {
        return playerChoice != carPosition;
    }

    public boolean switchDoor() {
        int newChoice;
        int goatDoor = -1;

        if (playerChoice == carPosition) {
            do {
                goatDoor = (int) (Math.random() * 3);
            } while (goatDoor == carPosition);
            newChoice = 3 - playerChoice - goatDoor;
        } else {
            do {
                goatDoor = (int) (Math.random() * 3);
            } while (goatDoor == playerChoice || goatDoor == carPosition);
            newChoice = 3 - playerChoice - goatDoor; // Меняем на эту строку
        }

        playerChoice = newChoice;
        return playerChoice == carPosition;
    }
}