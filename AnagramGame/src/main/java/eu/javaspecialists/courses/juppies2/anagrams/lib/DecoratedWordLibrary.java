/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;

// This is a decorator - look at the decorator pattern
public abstract class DecoratedWordLibrary implements WordLibrary {
    private final WordLibrary other;

    public DecoratedWordLibrary(WordLibrary other) {
        this.other = other;
    }

    @Override
    public String getWord(int idx) {
        return other.getWord(idx);
    }

    @Override
    public String getScrambledWord(int idx) {
        return other.getScrambledWord(idx);
    }

    @Override
    public int getSize() {
        return other.getSize();
    }
}
