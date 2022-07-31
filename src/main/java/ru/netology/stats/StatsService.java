package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int countBelowAvg(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < average(sale)) {
                count++;
            }
        }
        return count;
    }
}