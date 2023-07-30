import java.util.Scanner;
class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    MonthData monthData = new MonthData();
    Converter converter = new Converter();

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();

        }
    }

    void addNewNumberStepsPerDay() { //МЕТОД НЕ СОХРАНЯЕТ ШАГИ
        System.out.println("Введите номер месяца");
        int Month = scanner.nextInt();
        while (true) {
            if (Month > 12 || Month < 0) { // ввод и проверка номера месяца
                System.out.println("Некорректно введён номер месяца");
            } else {
                break;
            }
        }

        System.out.println("Введите день от 1 до 30 (включительно)");
        int day = scanner.nextInt();
        while (true) {
            if (day >= 30 || day < 1) { // ввод и проверка дн
                System.out.println("Некорректно введён день");
            } else {
                break;
            }
        }
        System.out.println("Введите количество шагов");
        MonthData monthData = monthToData[Month - 1];
        int stepCount = scanner.nextInt();
        while (true) {
            if (stepCount <= 0) { //ввод и проверка количества шагов
                System.out.println("Некорректно введено количество шагов");
            } else {
                // Сохранение полученных данных
                monthData.days[day - 1] = stepCount;
                break;
            }
        }
        // Получение соответствующего объекта MonthData из массива

    }

    int goalByStepsPerDay = 10000;

    void changeStepGoal() {
        System.out.println("Введите новую цель шагов на день");
        goalByStepsPerDay = scanner.nextInt();
        while (true) {
            if (goalByStepsPerDay <= 0) {
                System.out.println("Некорректно введено количество шагов");
            } else {
                break;
            }
        }

    }

    void printStatistics() {
        System.out.println("Введите число месяца");
        monthData = new MonthData();
        int Month = scanner.nextInt();
        while (true) {
            if (Month > 12 || Month < 0) { // ввод и проверка номера месяца
                System.out.println("Некорректно введён номер месяца");
            } else {
                break;
            }

        }
        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println("Статистика по дням: ");
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Суммарное количество шагов за месяц: " + sumSteps);
        monthData.maxSteps();
        monthData.averageSteps();
        converter.convertToKm(sumSteps);
        converter.convertStepsToKilocalories(sumSteps);
        monthData.bestSeries(goalByStepsPerDay);
        System.out.println();
    }
}