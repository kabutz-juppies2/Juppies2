/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;

import eu.javaspecialists.courses.juppies2.anagrams.util.ArrayShuffler;
import java.util.Arrays;


public class RandomScrambledWordLibrary extends ScrambledWordLibrary {

    public RandomScrambledWordLibrary(WordLibrary other) {
        super(other);
    }

    @Override
    protected void scramble(char[] letters) {
        ArrayShuffler shuffler = new ArrayShuffler();
        shuffler.shuffle(letters);
    }
    
}
