package org.example;

public class Solution2 {
    /**
     * Decodes the given message using the provided key.
     *
     * @param key     The key string containing the character mappings for decoding.
     * @param message The message string to be decoded.
     * @return The decoded message as a String.
     */
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        char alphabet = 'a';
        char[] mappedKey = new char[26];

        for (char c : key.toCharArray()) {
            if (c != ' ' && mappedKey[c - 'a'] == 0) {
                mappedKey[c - 'a'] = alphabet++;
            }
        }

        for (char c : message.toCharArray()) {
            sb.append(c == ' ' ? ' ' : mappedKey[c - 'a']);
        }

        return sb.toString();
    }
}
