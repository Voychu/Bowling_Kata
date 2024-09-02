package org.example;

public class Frame {
    private final int totalPins;

    public Frame(String frameScore){
        this.totalPins = countTotalPins(frameScore.charAt(0),frameScore.charAt(1));
    }
    private int countTotalPins(char firstThrowScore, char secondThrowScore){
        return Character.getNumericValue(firstThrowScore) + Character.getNumericValue(secondThrowScore);
    }

    public int getTotalPins(){
        return this.totalPins;
    }
}
