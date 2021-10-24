package ru.netology.stats;

public class SalesBelowAverage {
    public int belowAverage(long[] sales) {
        AverageAmountOfSales averageSales = new AverageAmountOfSales();
        int belowAverage = 0;
        for (long sale : sales) {
            if (sale < averageSales.averagePerMonth(sales)) {
                belowAverage++;
            }
        }
        return belowAverage;
    }
}
