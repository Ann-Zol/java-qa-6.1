package ru.netology.stats;

public class StatsService {

    public int shouldCalculateTotalSales(int[] salesOfMonth) {//Сумма всех продаж
        int totalSales = 0;
        for (int i : salesOfMonth) {
            totalSales += i;
        }
        return totalSales;
    }

    public float shouldCalculateAverageSale(int[] salesOfMonth) {//Средняя сумма продаж
        float averageAmountOfSales = shouldCalculateTotalSales(salesOfMonth) / salesOfMonth.length;
        return averageAmountOfSales;
    }

    public int shouldCalculatePeakSalesMonth(int[] salesOfMonth){//Номер месяца, в котором был пик продаж
        int month = 0;
        int peakSale = -1_000_000;
        int peakMonth = month;
        for (int currentSale : salesOfMonth){
            month++;
            if(peakSale <= currentSale){
                peakSale = currentSale;
                peakMonth = month;
            }
        }
        return peakMonth;
    }

    public int shouldCalculateMinimumSalesMonth(int[] salesOfMonth){//Номер месяца, в котором был минимум продаж
        int month = 0;
        int minSale = 1_000_000;
        int minMonth = month;
        for (int currentSale : salesOfMonth){
            month++;
            if(minSale >= currentSale){
                minSale = currentSale;
                minMonth = month;
            }
        }
        return minMonth;
    }

    public int shouldCalculateNumberOfMonthFromBelowAverageSales(int[] salesOfMonth){//Кол-во месяцев, в которых продажи были ниже среднего
        int numberOfMonth = 0;
        float averageSale = shouldCalculateAverageSale(salesOfMonth);
        for(int currentSale : salesOfMonth){
            if (currentSale < averageSale){
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }

    public int shouldCalculateNumberOfMontFromAboveAverageSales(int[] salesOfMonth){//Кол-во месяцев, в которых продажи были выше среднего
        int numberOfMonth = 0;
        float averageSale = shouldCalculateAverageSale(salesOfMonth);
        for(int currentSale : salesOfMonth){
            if (currentSale > averageSale){
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }

}
