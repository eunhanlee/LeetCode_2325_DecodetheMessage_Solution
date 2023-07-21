package org.example;

import java.util.*;

public class Solution {
    /**
     * Decodes the given message using the provided key.
     *
     * @param key     The key string containing the character mappings for decoding.
     * @param message The message string to be decoded.
     * @return The decoded message as a String.
     */
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = new HashMap<>();
        map.put(' ', ' ');
        char alphabet = 'a';

        for (char c : key.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, alphabet++);
            }
        }

        for (char c : message.toCharArray()) {
            sb.append(map.get(c));
        }

        return sb.toString();
    }
}