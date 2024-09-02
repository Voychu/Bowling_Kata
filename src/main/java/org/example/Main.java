package org.example;


public class Main {
    public static void main(String[] args) {

        //INITIALIZE GAME
        Game game = new Game(args);

        System.out.println(game.getTotalScore());
        System.out.println("Koniec");
    }
}