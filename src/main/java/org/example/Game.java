package org.example;

public class Game {

    private final Frame[] frames;

    private static final int NUMBER_OF_FRAMES = 10;

    public Game(String[] eachFrameScores) {
        this.frames = initializeFrames(eachFrameScores);
    }

    private Frame[] initializeFrames(String[] individualScores){
        Frame[] frames = new Frame[individualScores.length];
            for(int i=0; i<individualScores.length; i++){
                frames[i] = new Frame(individualScores[i]);
            }
        return frames;
    }

    private int calculateTotalScore(Frame[] frames){
        int totalScore = 0;
        for(int i=0; i<frames.length; i++){

            if(i<NUMBER_OF_FRAMES) {
                totalScore += frames[i].getTotalPins();

                if (frames[i].isSpare()) {
                    totalScore += frames[i + 1].getPinsFromFirstThrow();
                }
                if (frames[i].isStrike()) {
                    totalScore += frames[i + 1].getPinsFromFirstThrow();
                    if (frames[i + 1].getNumberOfThisFramesThrows() != 1)
                        totalScore += frames[i + 1].getPinsFromSecondThrow();
                    else
                        totalScore += frames[i + 2].getPinsFromFirstThrow();
                }
            }
        }
        return totalScore;

    }

    public int getTotalScore(){
        return calculateTotalScore(this.frames);
    }
}
