package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalTests {

    @Test
    public void shouldCalculateTotalSales() {
        TotalOfSales service = new TotalOfSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.total(sales);
        int expected = 180;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldFindAverageOfSales(){
        AverageAmountOfSales average = new AverageAmountOfSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = average.averagePerMonth(sales);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberOfMonthMaxSales(){
        MonthNumberMaxSale num =new MonthNumberMaxSale();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = num.maxSales(sales);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberOfMonthMinSales(){
        MonthNumberMinSale num = new MonthNumberMinSale();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = num.minSales(sales);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCountBelowAverage(){
        SalesBelowAverage below = new SalesBelowAverage();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = below.belowAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCountAboveAverege(){
        SalesAboveAverage above = new SalesAboveAverage();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = above.aboveAverage(sales);
        int expected = 7;

        assertEquals(expected, actual);
    }
}
