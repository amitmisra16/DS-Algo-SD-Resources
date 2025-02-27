package gtci.sliding.window;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class E04FruitsIntoBasket {
    public Integer compute(Character[] fruits) {
        // Add validation code here
        if (fruits.length < 2) {
            throw new IllegalArgumentException("input should have at least two elements");
        }
        int lastBucketUsed = -1;
        Character[] trees = new Character[2];
        int currentMaxCount = 0;
        int maxCount = 0;
        for (Character currentFruit : fruits) {
            // Add current fruit to either bucket
            // Check bucket one first
            if (lastBucketUsed == -1) {
                trees[0] = currentFruit;
                currentMaxCount++;
                lastBucketUsed = 0;
            } else if (trees[0].equals(currentFruit)) {
                currentMaxCount++;
                lastBucketUsed = 0;
            } else if (trees[1] == null) {
                trees[1] = currentFruit;
                currentMaxCount++;
                lastBucketUsed = 1;
            } else if (trees[1].equals(currentFruit)) {
                currentMaxCount++;
                lastBucketUsed = 1;
            } else {
                currentMaxCount = 2;
                lastBucketUsed = (lastBucketUsed + 1) % 2;
                trees[lastBucketUsed] = currentFruit;
            }
            if (maxCount < currentMaxCount) {
                maxCount = currentMaxCount;
            }
        }
        return maxCount;
    }

    public int computeV2(int distinctFruits, Character[] input) {
        int windowStart = 0,windowEnd, maxLength=0;
        Map<Character, Integer> characterFrequencyMap = new HashMap<>(input.length);
        for(windowEnd = 0; windowEnd < input.length; windowEnd++) {
            Character currentCharacter = input[windowEnd];
            characterFrequencyMap.put(currentCharacter, characterFrequencyMap.getOrDefault(currentCharacter, 0) + 1);
            while (characterFrequencyMap.size() > distinctFruits) {
                Character startingCharacter = input[windowStart];
                characterFrequencyMap.put(startingCharacter, characterFrequencyMap.get(startingCharacter) - 1);
                if (characterFrequencyMap.get(startingCharacter) == 0) {
                    characterFrequencyMap.remove(startingCharacter);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
