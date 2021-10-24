package ru.netology.stats;

public class TotalOfSales {
    public int total(long[] sales) {
        long sum = 0;
        for (long meaning : sales) {
            sum = meaning + sum;
        }
        return (int) sum;
    }
}
