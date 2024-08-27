package gtci.sliding.window;

import java.util.HashMap;
import java.util.Map;

public class P01PermutationInAString {

    public boolean compute(String pattern, String input) {
        boolean patternFound = false;
        Map<Character, Integer> patternFrequencyMap = new HashMap<>();
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < input.length(); windowEnd++) {
            char rightCharacter = input.charAt(windowEnd);
            if (pattern.lastIndexOf(rightCharacter) < patternFrequencyMap.getOrDefault(rightCharacter, 0)) {
                windowStart = windowEnd + 1;
            } else {
                patternFrequencyMap.put(rightCharacter, pattern.indexOf(rightCharacter));
            }
            if (windowEnd - windowStart + 1 >= pattern.length()) {
                patternFound = true;
                break;
            }
        }
        return patternFound;
    }
}
