/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;


public abstract class ScrambledWordLibrary implements WordLibrary {
    private final WordLibrary other;

    public ScrambledWordLibrary(WordLibrary other) {
        this.other = other;
    }

    @Override
    public String getWord(int idx) {
        return other.getWord(idx);
    }

    @Override
    public String getScrambledWord(int idx) {
        char[] letters = other.getScrambledWord(idx).toCharArray();
        scramble(letters);
        return new String(letters);
    }

    @Override
    public int getSize() {
        return other.getSize();
    }

    protected abstract void scramble(char[] letters);      
}
