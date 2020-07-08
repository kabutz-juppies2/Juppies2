/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;

import eu.javaspecialists.courses.juppies2.anagrams.util.ArrayShuffler;


public class ShuffledWordLibrary implements WordLibrary {
    private final WordLibrary other;
    private final int[] indexes;

    public ShuffledWordLibrary(WordLibrary other) {
        this.other = other;
        indexes = new int[other.getSize()];
        for(int i = 0; i < indexes.length; i++) {
            indexes[i] = i;
        }
        
        ArrayShuffler shuffler = new ArrayShuffler();
        shuffler.shuffle(indexes);
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

    
    
    
}
