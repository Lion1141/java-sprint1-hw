class MonthData {
    int[] days = new int[30];
    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i+1) + " день: " + days[i]);
        }
            // Вывод элементов массива в необходимом формате
        }
    int sumStepsFromMonth() { // подсчёт суммы элементов массива days[]
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
           } return sumSteps;
    }
    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            } else {
                System.out.println("Максимальное количество шагов - " + maxSteps + " было пройдено в день " + i);
            }

            // поиск максимального элемента
        }
        return maxSteps;
    }
    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
           if(days[i] > goalByStepsPerDay) {
            currentSeries = currentSeries + 1;
            finalSeries = currentSeries;// поиск максимальной серии
           }
           else {
               finalSeries = 0;
           }
        }
        return finalSeries;
    }
    void averageSteps() {
        int averageSteps = sumStepsFromMonth() / days.length;
    System.out.println("Среднее количество шагов:" + averageSteps);
    }
}
