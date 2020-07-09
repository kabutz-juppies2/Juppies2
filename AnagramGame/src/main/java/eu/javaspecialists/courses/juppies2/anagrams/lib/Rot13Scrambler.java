/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.lib;


public class Rot13Scrambler implements ScrambledWordLibrary.Scrambler {
    @Override
    public void scramble(char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] >= 'a' && letters[i] <= 'm') letters[i]+=13;
            if (letters[i] >= 'n' && letters[i] <= 'z') letters[i]-=13;
        }
    }
}
