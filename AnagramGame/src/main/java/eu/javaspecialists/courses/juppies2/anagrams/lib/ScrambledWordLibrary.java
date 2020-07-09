/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;

import eu.javaspecialists.courses.juppies2.anagrams.util.*;

import java.util.*;

public class ScrambledWordLibrary implements WordLibrary {

    private final WordLibrary other;
    private final Scrambler scrambler;

    public ScrambledWordLibrary(WordLibrary other, Scrambler scrambler) {
        this.other = other;
        this.scrambler = scrambler;
    }

    @Override
    public String getWord(int idx) {
        return other.getWord(idx);
    }

    @Override
    public String getScrambledWord(int idx) {
        char[] letters = other.getScrambledWord(idx).toCharArray();
        scrambler.scramble(letters);
        return new String(letters);
    }

    @Override
    public int getSize() {
        return other.getSize();
    }

    /**
     *
     * @author heinz
     */
    public static interface Scrambler {

        void scramble(char[] letters);
    }

    public static final Scrambler ORIGINAL_SCRAMBLER
            = letters -> {
                /* do nothing - do not scramble */ };
    public static final Scrambler RANDOM_SCRAMBLER
            = ArrayShuffler::shuffle;
    public static final Scrambler SORTED_SCRAMBLER
            = Arrays::sort;
    public static final Scrambler ROT13_SCRAMBLER
            = letters -> {
                for (int i = 0; i < letters.length; i++) {
                    if (letters[i] >= 'a' && letters[i] <= 'm') {
                        letters[i] += 13;
                    }
                    if (letters[i] >= 'n' && letters[i] <= 'z') {
                        letters[i] -= 13;
                    }
                }
            };
}
