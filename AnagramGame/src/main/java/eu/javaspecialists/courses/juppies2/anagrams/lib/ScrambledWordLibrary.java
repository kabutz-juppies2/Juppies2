/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;


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

    public static final Scrambler ORIGINAL_SCRAMBLER = new OriginalScrambler();
    public static final Scrambler RANDOM_SCRAMBLER = new RandomScrambler();
    public static final Scrambler ROT13_SCRAMBLER = new Rot13Scrambler();
    public static final Scrambler SORTED_SCRAMBLER = new SortedScrambler();

}
