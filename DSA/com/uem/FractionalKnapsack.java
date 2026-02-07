package com.uem;

import java.util.*;

public class FractionalKnapsack {

    static class Item {
        int value, weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };

        int capacity = 50;

        // sort items by value/weight ratio (descending)
        Arrays.sort(items, (a, b) -> {
            double r1 = (double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;
            return Double.compare(r2, r1);
        });

        double totalValue = 0.0;

        for (Item item : items) {
            if (capacity >= item.weight) {
                // take full item
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                // take fractional part
                totalValue += item.value * ((double) capacity / item.weight);
                break;
            }
        }

        System.out.println("Maximum value = " + totalValue);
    }
}
