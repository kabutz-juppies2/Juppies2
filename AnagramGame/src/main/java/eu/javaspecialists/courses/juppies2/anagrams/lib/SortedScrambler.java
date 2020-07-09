/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;

import java.util.Arrays;

public class SortedScrambler implements ScrambledWordLibrary.Scrambler {
    @Override
    public void scramble(char[] letters) {
        Arrays.sort(letters);
    }
}
