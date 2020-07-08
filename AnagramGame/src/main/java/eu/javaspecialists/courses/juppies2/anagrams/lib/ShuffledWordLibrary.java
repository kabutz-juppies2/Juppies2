/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;

import java.util.Random;


public class ShuffledWordLibrary extends WordLibrary {
    private final WordLibrary other;
    private final int[] indexes;

    public ShuffledWordLibrary(WordLibrary other) {
        this.other = other;
        indexes = new int[other.getSize()];
        for(int i = 0; i < indexes.length; i++) {
            indexes[i] = i;
        }
        
        shuffle(indexes);
    }
    
    @Override
    public String getWord(int idx) {
        int newIdx = indexes[idx];
        return other.getWord(newIdx);
    }

    @Override
    public String getScrambledWord(int idx) {
        int newIdx = indexes[idx];
        return other.getScrambledWord(newIdx);
    }

    @Override
    public int getSize() {
        return other.getSize();
    }

    private void shuffle(int[] indexes) {
        Random random = new Random(0);
        for(int i = indexes.length - 1; i > 0; i--) {
            int swap = random.nextInt(i + 1);
            if (swap != i) {
                int tmp = indexes[i];
                indexes[i] = indexes[swap];
                indexes[swap] = tmp;
            }
        }
    }
    
    
    
}
