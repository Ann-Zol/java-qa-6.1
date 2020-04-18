package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateTotalSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.shouldCalculateTotalSales(sales);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAverageSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 15;
        float actual = service.shouldCalculateAverageSale(sales);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculatePeakSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.shouldCalculatePeakSalesMonth(sales);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMinimumSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.shouldCalculateMinimumSalesMonth(sales);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNumberOfMonthFromBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.shouldCalculateNumberOfMonthFromBelowAverageSales(sales);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNumberOfMontFromAboveAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.shouldCalculateNumberOfMonthFromBelowAverageSales(sales);
        assertEquals(expected,actual);
    }
}