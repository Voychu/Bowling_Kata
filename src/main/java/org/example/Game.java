package org.example;

public class Game {

    private final Frame[] frames;

    //tu singleton ?
    public Game(String[] individualScores){
        this.frames = initializeFrames(individualScores);
    }

    private Frame[] initializeFrames(String[] individualScores){
        Frame[] frames = new Frame[individualScores.length];
        for(int i=0; i<individualScores.length; i++){
            frames[i] = new Frame(individualScores[i]);
        }
        return frames;
    }

    private int countTotalScore(Frame[] frames){
        int totalScore=0;
        for(Frame frame : frames){
            totalScore += frame.getTotalPins();
        }
        return totalScore;
    }

    public int getTotalScore(){
        return countTotalScore(this.frames);
    }


}
