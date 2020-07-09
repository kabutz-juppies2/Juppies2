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
package eu.javaspecialists.courses.juppies2.anagrams.lib;

import eu.javaspecialists.courses.juppies2.anagrams.util.*;

import java.util.*;

public final class ScrambledWordLibrary extends DecoratedWordLibrary {

    private final Scrambler scrambler;

    public ScrambledWordLibrary(WordLibrary other, Scrambler scrambler) {
        super(other);
        this.scrambler = scrambler;
    }

    @Override
    public String getScrambledWord(int idx) {
        char[] letters = super.getScrambledWord(idx).toCharArray();
        scrambler.scramble(letters);
        return new String(letters);
    }

    public static interface Scrambler {

        void scramble(char[] letters);
    }

    public static final Scrambler ORIGINAL_SCRAMBLER
            = letters -> {
                /* do nothing - do not scramble */ };
    public static final Scrambler RANDOM_SCRAMBLER
            = ArrayShuffler::shuffle;
    public static final Scrambler SORTED_SCRAMBLER
            = Arrays::sort;
    public static final Scrambler ROT13_SCRAMBLER
            = letters -> {
                for (int i = 0; i < letters.length; i++) {
                    if (letters[i] >= 'a' && letters[i] <= 'm') {
                        letters[i] += 13;
                    }
                    if (letters[i] >= 'n' && letters[i] <= 'z') {
                        letters[i] -= 13;
                    }
                }
            };
}
