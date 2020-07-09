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

import eu.javaspecialists.courses.juppies2.anagrams.util.ArrayShuffler;

public final class ShuffledWordLibrary extends DecoratedWordLibrary {

    private final int[] indexes;

    public ShuffledWordLibrary(WordLibrary other) {
        super(other);
        indexes = new int[other.getSize()];
        for (int i = 0; i < indexes.length; i++) {
            indexes[i] = i;
        }

        ArrayShuffler.shuffle(indexes);
    }

    @Override
    public String getWord(int idx) {
        int newIdx = indexes[idx];
        return super.getWord(newIdx);
    }

    @Override
    public String getScrambledWord(int idx) {
        int newIdx = indexes[idx];
        return super.getScrambledWord(newIdx);
    }
}
