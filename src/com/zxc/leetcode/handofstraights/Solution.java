package com.zxc.leetcode.handofstraights;

import java.util.TreeMap;

/**
 * @author xiaoye
 * @create 2021-03-10 21:44
 */
public class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        TreeMap<Integer, Integer> cards = new TreeMap<>();

        for (int card : hand) {
            if (!cards.containsKey(card)) {
                cards.put(card, 1);
            } else {
                cards.replace(card, cards.get(card) + 1);
            }
        }

        while (cards.size() > 0) {
            Integer firstCard = cards.firstKey();
            for (int i = firstCard; i < firstCard + W; i++) {
                if (!cards.containsKey(i)) {
                    return false;
                } else {
                    if (cards.get(i) == 1) {
                        cards.remove(i);
                    } else {
                        cards.replace(i, cards.get(i) - 1);
                    }
                }
            }
        }
        return true;
    }
}
