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

    void addNewNumberStepsPerDay() {
                    System.out.println("Введите номер месяца от 1 до 12 (включительно). Введите 0 если хотите прервать операцию:");
                int month = scanner.nextInt();
                if (month < 0 || month > 12) {
                    while(month < 1 || month > 12) {
                        System.out.println("Неверно указан номер месяца! " + "Нумерация месяцев начинается от 1 до 12(пример: 1 - январь). Введите номер месяца повторно.");
                        month = scanner.nextInt();
                    }
                } else if (month == 0) return;
                System.out.println("Введите день от 1 до 30 (включительно). Введите 0 если хотите прервать операцию:");
                int day = scanner.nextInt();
                if (day < 0 || day > 30) {  // ввод и проверка дней
                    while (day < 1 || day > 30) {
                        System.out.println("Неверно указан день! " + " Нумерация дней начинается от 1 до 30. Введите номер дня повторно.");
                        day = scanner.nextInt();
                    }
                } else if (day == 0) return;
                monthData = monthToData[month-1];
                System.out.println("Введите количество шагов:");
                int stepCount = scanner.nextInt();
                while (stepCount < 0) {
                    System.out.println("Некорректно введено количество шагов");
                    stepCount = scanner.nextInt();
                }
                monthData.days[day-1] = stepCount; // Сохранение полученных данных
            }
        // Получение соответствующего объекта MonthData из массива


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
        System.out.println("Введите число месяца от 1 до 12 (включительно):");
        int month = scanner.nextInt();
        while (true) {
            if (month > 12 || month < 1) { // ввод и проверка номера месяца
                System.out.println("Некорректно введён номер месяца");
            } else {
                break;
            }
        }
        monthData = monthToData[month-1];
        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println("Статистика по дням: ");
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Суммарное количество шагов за месяц: " + sumSteps);
        monthData.maxSteps();
        System.out.println("Среднее количество шагов:" + monthData.averageSteps());
        System.out.println("Вы прошли " + converter.convertToKm(sumSteps) + " километров");
        System.out.println("Вы потратили " + converter.convertStepsToKilocalories(sumSteps) + " килокалорий");
        monthData.bestSeries(goalByStepsPerDay);
        System.out.println();
    }
}