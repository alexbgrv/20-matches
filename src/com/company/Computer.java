package com.company;

public class Computer {
    private int[] numLose = {1,5,9,13,17};

    public int bot(int countMatches) {
        for(int i: numLose) {
            if ((countMatches - i) <= 3) {
                return countMatches - i;
            }
        }
        return 0;
    }
}
