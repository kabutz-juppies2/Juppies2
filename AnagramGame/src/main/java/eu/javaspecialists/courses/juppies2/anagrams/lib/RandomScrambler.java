/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;

import eu.javaspecialists.courses.juppies2.anagrams.util.ArrayShuffler;

public class RandomScrambler implements Scrambler {
    @Override
    public void scramble(char[] letters) {
        ArrayShuffler shuffler = new ArrayShuffler();
        shuffler.shuffle(letters);
    }
}
