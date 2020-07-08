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
    public void shuffle(int[] indexes) {
        Random random = new Random();
        for(int i = indexes.length - 1; i > 0; i--) {
            int swap = random.nextInt(i + 1);
            if (swap != i) {
                int tmp = indexes[i];
                indexes[i] = indexes[swap];
                indexes[swap] = tmp;
            }
        }
    }
}
