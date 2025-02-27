package gtci.sliding.window;

import java.util.HashMap;
import java.util.Map;

public class E05NoRepeatSubString {

    public int compute(String input) {
        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> characterFrequencyMap = new HashMap<>(input.length());
        for (int windowEnd = 0; windowEnd < input.length(); windowEnd ++) {
            Character currentCharacter = input.charAt(windowEnd);
            characterFrequencyMap.put(currentCharacter, characterFrequencyMap.getOrDefault(currentCharacter, 0) + 1);
            if (characterFrequencyMap.get(currentCharacter) > 1) {
                characterFrequencyMap.clear();
                characterFrequencyMap.put(currentCharacter, 1);
                windowStart = windowEnd;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }

    public int computeV2(String input) {
        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> characterFrequencyMap = new HashMap<>(input.length());
        for (int windowEnd = 0; windowEnd < input.length(); windowEnd ++) {
            Character currentCharacter = input.charAt(windowEnd);
            if (characterFrequencyMap.containsKey(currentCharacter)) {
                windowStart = Math.max(windowStart, characterFrequencyMap.get(currentCharacter) + 1);
            }
            characterFrequencyMap.put(currentCharacter, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
