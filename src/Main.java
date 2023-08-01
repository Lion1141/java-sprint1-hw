
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();

            int i = scanner.nextInt();
            switch (i) {
                case 1 -> stepTracker.addNewNumberStepsPerDay();
                case 2 -> stepTracker.changeStepGoal();
                case 3 -> stepTracker.printStatistics();
                case 0 -> {
                    System.out.println("Пока!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Такой команды нет");
            }
            }
        }

    static void printMenu() {
              System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Ввести количество шагов за определённый день");
            System.out.println("2 - изменить цель по количеству шагов в день");
            System.out.println("3 - напечатать статистику за определённый месяц"); 
            System.out.println("0 - Выйти из приложения");
        }// Вывод доступных команд
    }