package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateTotalSales() {
        int actual = service.totalOfSales(sales);
        int expected = 180;

        assertEquals(expected, actual);
    }


    @Test
    void shouldFindAverageOfSales() {
        int actual = service.averageAmountOfSales(sales);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindNumberOfMonthMaxSales() {
        int actual = service.monthNumberMaxSale(sales);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void mshouldFindNumberOfMonthMinSales() {
        int actual = service.monthNumberMinSale(sales);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindCountBelowAverage() {
        int actual = service.salesBelowAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void salesBelowAverage() {
        int actual = service.salesAboveAverage(sales);
        int expected = 7;

        assertEquals(expected, actual);
    }
}