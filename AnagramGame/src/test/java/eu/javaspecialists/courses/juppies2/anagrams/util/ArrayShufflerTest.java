/*
 * Copyright 2020 Dr Heinz M. Kabutz <heinz@javaspecialists.eu>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.javaspecialists.courses.juppies2.anagrams.util;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author heinz
 */
public final class ArrayShufflerTest {

    @Test
    public void testShuffleInts() {
        System.out.println("shuffle");
        int[] indexes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String beforeShuffle = Arrays.toString(indexes);
        System.out.println("before shuffle indexes = " + beforeShuffle);
        ArrayShuffler.shuffle(indexes);
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

    @Test
    public void testShuffleChars() {
        String words = "hello world";
        char[] letters = words.toCharArray();
        ArrayShuffler.shuffle(letters);
        String shuffle1 = new String(letters);
        assertNotEquals("Did not shuffle the chars", "hello world", shuffle1);

        letters = words.toCharArray();
        ArrayShuffler.shuffle(letters);
        String shuffle2 = new String(letters);
        assertNotEquals("Shuffling was in a predictable sequence",
                shuffle1, shuffle2);

        Arrays.sort(letters);
        assertEquals("Does not contain the same chars as before", " dehllloorw", new String(letters));
    }
}
