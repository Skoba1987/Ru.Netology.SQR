package ru.netology.stats;

public class StatsService {

    public int getSumSales(int[] allSales) {
        int sumSales = 0; 

        for (int i = 0; i < allSales.length; i++) {
            sumSales = sumSales + allSales[i];
        }
        return sumSales;
    }

    public int getMiddleSales(int[] allSales) {
        int sumSales = getSumSales(allSales);
        int middleSales = 0; 

        for (int i = 0; i < allSales.length; i++) {
            middleSales = sumSales / allSales.length;
        }
        return middleSales;
    }

    public int getMaxSalesMonth(int[] allSales) {
        int maxSalesMonth = 0; 

        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] >= allSales[maxSalesMonth])
                maxSalesMonth = i;
        }
        return maxSalesMonth;

    }

    public int getMinSalesMonth(int[] allSales) {
        int minSalesMonth = 0; 

        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] <= allSales[minSalesMonth])
                minSalesMonth = i;
        }
        return minSalesMonth;
    }

    public int getMonthDown(int[] allSales) {
        int monthDown = 0; 

        for (int i = 0;  i < allSales.length; i++) {
            if (allSales[i] < getMiddleSales(allSales))
                monthDown = monthDown + 1;
        }
        return monthDown;
    }

    public int getMonthHigh(int[] allSales) {
        int monthHigh = 0; 

        for (int allSale : allSales) {
            if (getMiddleSales(allSales) < allSale)
                monthHigh = monthHigh + 1;
        }
        return monthHigh;
    }
}
