package ru.netology.stats;

public class SalesAboveAverage {
    public int aboveAverage(long[] sales) {
        AverageAmountOfSales averageSales = new AverageAmountOfSales();
        int aboveAverage = 0;
        for (long sale : sales) {
            if (sale >= averageSales.averagePerMonth(sales)) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}
