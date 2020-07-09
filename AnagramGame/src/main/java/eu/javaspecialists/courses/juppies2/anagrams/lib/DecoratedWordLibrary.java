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

// This is a decorator - look at the decorator pattern
public abstract class DecoratedWordLibrary implements WordLibrary {

    private final WordLibrary other;

    public DecoratedWordLibrary(WordLibrary other) {
        this.other = other;
    }

    @Override
    public String getWord(int idx) {
        return other.getWord(idx);
    }

    @Override
    public String getScrambledWord(int idx) {
        return other.getScrambledWord(idx);
    }

    @Override
    public int getSize() {
        return other.getSize();
    }
}
