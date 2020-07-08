/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.util;

import java.util.Random;

/**
 *
 * @author heinz
 */
public class ArrayShuffler {
    // x = 4 = 0b0100
    // y = 7 = 0b0111
    
    // x = x + y = 11
    // y = x - y = 11 - 7 = 4
    // x = x - y = 11 - 4 = 7
    
    // x ^= y = 3
    // y ^= x = 4
    // x ^= y = 7
    
    public void shuffle(int[] indexes) {
        Random random = new Random();
        for(int i = indexes.length - 1; i > 0; i--) {
            int swap = random.nextInt(i + 1);
            if (swap != i) {
                indexes[i] ^= indexes[swap];
                indexes[swap] ^= indexes[i];
                indexes[i] ^= indexes[swap];
            }
        }
    }
}
