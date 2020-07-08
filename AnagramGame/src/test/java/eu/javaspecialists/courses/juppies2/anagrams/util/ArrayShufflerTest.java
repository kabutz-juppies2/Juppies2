/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.javaspecialists.courses.juppies2.anagrams.util;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author heinz
 */
public class ArrayShufflerTest {
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        int[] indexes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String beforeShuffle = Arrays.toString(indexes);
        System.out.println("before shuffle indexes = " + beforeShuffle);
        ArrayShuffler instance = new ArrayShuffler();
        instance.shuffle(indexes);
        String afterShuffle = Arrays.toString(indexes);
        System.out.println("after shuffle indexes = " + afterShuffle);
        Arrays.sort(indexes);
        String sorted = Arrays.toString(indexes);
        System.out.println("sorted = " + sorted);

        assertNotEquals("Shuffling did not do anything", 
                "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", afterShuffle);
        assertNotEquals("Shuffling was in a predictable sequence", 
                "[4, 8, 9, 6, 3, 5, 2, 1, 7, 0]", afterShuffle);
        
        assertEquals("Does not contain the same values as before", 
                "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", sorted);
    }
}
