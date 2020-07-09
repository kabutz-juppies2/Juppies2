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

import java.util.Random;

/**
 *
 * @author heinz
 */
public final class ArrayShuffler {

    private ArrayShuffler() {
    }
    // x = 4 = 0b0100
    // y = 7 = 0b0111

    // x = x + y = 11
    // y = x - y = 11 - 7 = 4
    // x = x - y = 11 - 4 = 7
    // x ^= y = 3
    // y ^= x = 4
    // x ^= y = 7
    public static void shuffle(int[] indexes) {
        Random random = new Random();
        for (int i = indexes.length - 1; i > 0; i--) {
            int swap = random.nextInt(i + 1);
            if (swap != i) {
                indexes[i] ^= indexes[swap];
                indexes[swap] ^= indexes[i];
                indexes[i] ^= indexes[swap];
            }
        }
    }

    public static void shuffle(char[] letters) {
        Random random = new Random();
        for (int i = letters.length - 1; i > 0; i--) {
            int swap = random.nextInt(i + 1);
            if (swap != i) {
                letters[i] ^= letters[swap];
                letters[swap] ^= letters[i];
                letters[i] ^= letters[swap];
            }
        }
    }
}
