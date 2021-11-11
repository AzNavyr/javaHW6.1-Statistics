package ru.netology.stats;

public class StatsService {
    public int totalOfSales(long[] sales) {
        long sum = 0;
        for (long meaning : sales) {
            sum = meaning + sum;
        }
        return (int) sum;
    }

    public int averageAmountOfSales(long[] sales) {
        StatsService service = new StatsService();
        int average = service.totalOfSales(sales) / sales.length;
        return (average);
    }

    public int monthNumberMaxSale(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int monthNumberMinSale(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesAboveAverage(long[] sales) {
        StatsService service = new StatsService();
        int aboveAverage = 0;
        for (long sale : sales) {
            if (sale >= service.averageAmountOfSales(sales)) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

    public int salesBelowAverage(long[] sales) {
        StatsService service = new StatsService();
        int belowAverage = 0;
        for (long sale : sales) {
            if (sale < service.averageAmountOfSales(sales)) {
                belowAverage++;
            }
        }
        return belowAverage;
    }
}
