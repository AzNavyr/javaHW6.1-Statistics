package ru.netology.stats;

import java.time.Month;

public class StatsService {
    public static void main(String[] args) {
        TotalOfSales service2 = new TotalOfSales();
        AverageAmountOfSales service3 = new AverageAmountOfSales();
        MonthNumberMaxSale service1 = new MonthNumberMaxSale();
        MonthNumberMinSale service = new MonthNumberMinSale();
        SalesBelowAverage service4 = new SalesBelowAverage();
        SalesAboveAverage service5 = new SalesAboveAverage();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

//        int sumAllSales = service2.total(sales);
//        System.out.format("%S: %S;","Общая сумма продаж", sumAllSales);
        String sumAllSales = String.format("%S: %S;", "Общая сумма продаж", service2.total(sales));
        System.out.println(sumAllSales);

        String averageOfSales = String.format("%s %s;", "СРЕДНЯЯ СУММА ПРОДАЖ В МЕСЯЦ:", service3.averagePerMonth(sales));
        System.out.println(averageOfSales);

        int monthNumberMax = service1.maxSales(sales);
        String monthName = String.format("%S %s (%s);", "Месяц с максимальной продажей: ", monthNumberMax, Month.of(monthNumberMax));
//        String monthName1 = String.format("%S %s (%s);", "Месяц с максимальной продажей: ", monthNumberMax, Month.of(monthNumberMax));
//        System.out.println(monthName1);

        int monthNumberMin = service.minSales(sales);
        String monthName2 = String.format("%S %S (%s);", "Месяц с минимальной продажей:", monthNumberMin, Month.of(monthNumberMin));
//        String monthName2 = String.format("%S %S (%s);", "Месяц с минимальной продажей:", monthNumberMin, Month.of(monthNumberMin));
//        System.out.println(monthName2);

        String belowAverage = String.format("%S %s;", "Кол-во месяцев с продажами ниже среднего:", service4.belowAverage(sales));
//        System.out.println(belowAverage);
        String results = String.format("%S \n%S \n%S", monthName, monthName2, belowAverage);
        System.out.println(results);

        String aboveAverage = String.format("%S %s;", "Кол-во месяцев с продажами выше или равные средним:", service5.aboveAverage(sales));
        System.out.println(aboveAverage);
    }
}
