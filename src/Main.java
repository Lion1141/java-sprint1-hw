
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        Converter converter = new Converter();

        while (true) {
            printMenu();

            int i = scanner.nextInt();
            if (i == 1) {
                stepTracker.addNewNumberStepsPerDay();
                // здесь будет логика команды 1
            } else if (i == 2) {
                stepTracker.changeStepGoal();// здесь будет логика команды 2
            } else if (i == 3) {
               stepTracker.printStatistics(); // здесь будет логика команды 3
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
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