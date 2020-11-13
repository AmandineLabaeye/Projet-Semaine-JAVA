package com.company;

public class MainGame {

    public static void main(String[] args) {

        GameString gameString = new GameString();

        String choice = gameString.Menu();

        switch (choice) {
            case "j":
                gameString.Play();
                break;
            case "q":
                gameString.Leave();
                break;
        }

    }
}
