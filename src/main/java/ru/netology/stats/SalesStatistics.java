package ru.netology.stats;

import java.time.Month;

public class SalesStatistics {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        String sumAllSales = String.format("%S: %S;", "Общая сумма продаж", service.totalOfSales(sales));
        System.out.println(sumAllSales);

        String averageOfSales = String.format("%s %s;", "СРЕДНЯЯ СУММА ПРОДАЖ В МЕСЯЦ:", service.averageAmountOfSales(sales));
        System.out.println(averageOfSales);

        int monthNumberMax = service.monthNumberMaxSale(sales);
        String monthName = String.format("%S %s (%s);", "Месяц с максимальной продажей: ", monthNumberMax, Month.of(monthNumberMax));

        int monthNumberMin = service.monthNumberMinSale(sales);
        String monthName2 = String.format("%S %S (%s);", "Месяц с минимальной продажей:", monthNumberMin, Month.of(monthNumberMin));

        String belowAverage = String.format("%S %s;", "Кол-во месяцев с продажами ниже среднего:", service.salesBelowAverage(sales));
        String results = String.format("%S \n%S \n%S", monthName, monthName2, belowAverage);
        System.out.println(results);

        String aboveAverage = String.format("%S %s;", "Кол-во месяцев с продажами выше или равные средним:", service.salesAboveAverage(sales));
        System.out.println(aboveAverage);
    }
}
