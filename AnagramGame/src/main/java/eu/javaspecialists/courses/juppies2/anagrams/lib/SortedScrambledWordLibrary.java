/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;

import java.util.Arrays;


public class SortedScrambledWordLibrary extends ScrambledWordLibrary {

    public SortedScrambledWordLibrary(WordLibrary other) {
        super(other);
    }

    @Override
    protected void scramble(char[] letters) {
        Arrays.sort(letters);
    }
    
}
