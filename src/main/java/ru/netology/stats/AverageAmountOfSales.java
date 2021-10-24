package ru.netology.stats;

public class AverageAmountOfSales {
    public int averagePerMonth(long[] sales) {
        TotalOfSales sum = new TotalOfSales();
//        long sum = 0;
//        for (long meaning : sales) {
//             sum = meaning + sum;
//        }
//        int average = (int) sum / sales.length;
        int average = sum.total(sales) / sales.length;
        return (average);
    }
}
