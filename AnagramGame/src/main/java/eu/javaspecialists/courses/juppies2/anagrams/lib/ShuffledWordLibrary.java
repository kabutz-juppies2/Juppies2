/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;

import eu.javaspecialists.courses.juppies2.anagrams.util.ArrayShuffler;


public class ShuffledWordLibrary extends DecoratedWordLibrary {
    private final int[] indexes;

    public ShuffledWordLibrary(WordLibrary other) {
        super(other);
        indexes = new int[other.getSize()];
        for(int i = 0; i < indexes.length; i++) {
            indexes[i] = i;
        }
        
        ArrayShuffler.shuffle(indexes);
    }
    
    @Override
    public String getWord(int idx) {
        int newIdx = indexes[idx];
        return super.getWord(newIdx);
    }

    @Override
    public String getScrambledWord(int idx) {
        int newIdx = indexes[idx];
        return super.getScrambledWord(newIdx);
    }
}
