package gtci.sliding.window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class E03LongestSubstringWithGivenDistinctChars {

    public Integer compute(int distinctCharacters, String input) {
        Set<Character> characterVisited = new HashSet<>(distinctCharacters);
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0 ; i < input.length(); i++) {
            Character c = input.charAt(i);
            if (characterVisited.contains(c)) {
                currentLength++;
            } else {
                if (characterVisited.size() < distinctCharacters) {
                    characterVisited.add(c);
                    currentLength++;

                } else {
                    if (maxLength <= currentLength) {
                        maxLength = currentLength;
                        i = i - currentLength;
                        characterVisited = new HashSet<>(3);
                        currentLength = 0;
                    }
                }
            }
        }
        return maxLength;
    }

    public int computeV2(int MAX_CHARACTERS, String input) {
        int windowStart = 0, currentMaxLength = 0, maxLength = 0;
        Map<Character, Integer> characterFrequencyMap = new HashMap<>(input.length());
        // Add code for input validation
        for (int windowEnd = 0; windowEnd < input.length(); windowEnd++) {
            Character currentCharacter = input.charAt(windowEnd);
            characterFrequencyMap.put(currentCharacter, characterFrequencyMap.getOrDefault(currentCharacter, 0) + 1);
            currentMaxLength += 1;
            while (characterFrequencyMap.size() > MAX_CHARACTERS) {
                Character leftMostCharacter = input.charAt(windowStart++);
                characterFrequencyMap.put(leftMostCharacter, characterFrequencyMap.get(leftMostCharacter) - 1);
                if (characterFrequencyMap.get(leftMostCharacter) == 0) {
                    characterFrequencyMap.remove(leftMostCharacter);
                }
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
