class MonthData {
    int[] days = new int[30];
    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i+1) + " день: " + days[i]);
        }  // Вывод элементов массива в необходимом формате
    }

    int sumStepsFromMonth() { // подсчёт суммы элементов массива days[]
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
           } return sumSteps;
    }

    int maxSteps() {             // поиск максимального элемента
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
                System.out.println("Максимальное количество шагов - " + maxSteps + " было пройдено в день " + (i+1));
            } else {
                break;
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
           if(days[i] >= goalByStepsPerDay) {
            currentSeries = currentSeries + 1;
            finalSeries = currentSeries;// поиск максимальной серии
           }
           else {
               finalSeries = 0;
           }
        }
        System.out.println("Ваша лучшая серия: " + currentSeries);
        return finalSeries;
    }

    int averageSteps() {
        return (sumStepsFromMonth() / days.length);
    }
}
