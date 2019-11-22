package com.example.infs3634_appdev;

import java.util.Random;

class Anagram_Data {public static final Random RANDOM = new Random();
    public static final String[] WORDS = {"AREA", "ADD",
            "AGREE", "AFTER", "ALLOW", "BAD", "BAT", "BENCH", "BALLOON", "CAT",
            "CAST", "KITE", "FOLLOW", "GAS", "HUT", "DOG", "ICE", "PERFECT","BAG","SHOP", "BLUE",
            "PROCESS", "STAR", "MONSTER", "LOVE", "FUN", "FANTASTIC", "LEARN", "TEACH",
            "TOMORROW", "ABOUT", "TOGETHER", "WEATHER", "YESTERDAY", "HELLO", "COUNTRY",
            "AUSTRALIA", "SYDNEY", "MONKEY", "EAT", "TALK", "SCHOOL", "INSIDE", "SUGAR","IF", "RED",
            "AT", "IN", "BECAUSE", "YELLOW", "GREEN", "PURPLE", "ORANGE", "APPLE", "FRUIT", "WATER"};

    public static String randomWord() {
        return WORDS[RANDOM.nextInt(WORDS.length)];
    }

    public static String shuffleWord(String word) {
        if (word != null  &&  !"".equals(word)) {
            char a[] = word.toCharArray();

            for (int i = 0; i < a.length; i++) {
                int j = RANDOM.nextInt(a.length);
                char tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }

            return new String(a);
        }

        return word;
    }
}
