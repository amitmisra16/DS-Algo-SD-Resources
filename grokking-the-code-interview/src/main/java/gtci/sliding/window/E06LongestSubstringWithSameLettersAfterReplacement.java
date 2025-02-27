package gtci.sliding.window;

import java.util.HashMap;
import java.util.Map;

public class E06LongestSubstringWithSameLettersAfterReplacement {

    public int compute(int MAX_LETTERS, String input) {
        int windowStart = 0, maxRepeatLetterCount = 0, maxLength = 0;
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < input.length(); windowEnd++) {
            Character rightCharacter = input.charAt(windowEnd);
            characterFrequencyMap.put(rightCharacter, characterFrequencyMap.getOrDefault(rightCharacter, 0) + 1);
            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, characterFrequencyMap.get(rightCharacter));
            if (windowEnd - windowStart + 1 - maxRepeatLetterCount > MAX_LETTERS) {
                Character leftCharacter = input.charAt(windowStart++);
                characterFrequencyMap.put(leftCharacter, characterFrequencyMap.get(leftCharacter) - 1);
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
