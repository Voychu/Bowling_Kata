package org.example;
import java.util.ArrayList;

public class Frame {

    private final ArrayList<Integer> thisFramesThrowsPins;
    private final int totalPins;
    private final boolean spare;
    private final boolean strike;

    public Frame(String frameScore){
        this.thisFramesThrowsPins = countPinsForEachThrow(frameScore);
        this.spare = setSpare(frameScore);
        this.strike = setStrike(frameScore);
        this.totalPins = countTotalPins(this.thisFramesThrowsPins);

    }

    private boolean setSpare(String frameScore){
        if (frameScore.length()>1 && frameScore.charAt(1) == '/')
            return true;
        return false;
    }
    private boolean setStrike(String frameScore){
        if (frameScore.length() == 1 && frameScore.charAt(0) == 'X')
            return true;
        return false;
    }

    //tu wyrzucić Exception?
    private ArrayList<Integer> countPinsForEachThrow(String frameScore){
        ArrayList<Integer> thisFramesThrows = new ArrayList<>();

        for(char s : frameScore.toCharArray()){
            thisFramesThrows.add(charToPin(s));
        }
        if(frameScore.length()>1 && frameScore.charAt(1) == '/'){
            thisFramesThrows.set(1, thisFramesThrows.get(1) - thisFramesThrows.get(0));
        }
        return thisFramesThrows;
    }


    private int charToPin(char pinChar){
        if(pinChar == 'X')
            return 10;
        if(pinChar == '-')
            return 0;
        if(pinChar == '/')
            return 10;
        return Character.getNumericValue(pinChar);
    }

    private int countTotalPins(ArrayList<Integer> thisFramesThrows){
        int totalPins = 0;
        for(int aThrow : thisFramesThrows){
            totalPins += aThrow;
        }
        return totalPins;
    }

    public int getTotalPins(){
        return this.totalPins;
    }

    public int getPinsFromFirstThrow(){
        return thisFramesThrowsPins.get(0);
    }

    public int getPinsFromSecondThrow(){
        return thisFramesThrowsPins.get(1);
    }

    public int getNumberOfThisFramesThrows(){
        return thisFramesThrowsPins.size();
    }

    public boolean isSpare(){
        return this.spare;
    }

    public boolean isStrike(){
        return this.strike;
    }

}
