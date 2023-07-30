public class Converter {
    int stepLength = 75;
    int kal = 50;
    int kalToKkal = 1000;
    void convertToKm(int steps) { //Конвертация общего количества шагов в км.
        int km = steps * stepLength / 100000;
        System.out.println("Вы прошли " + km + " километров");
    }

    void convertStepsToKilocalories(int steps) { // Подсчёт общего значения количества килокалорий
        int kkal = steps * kal / kalToKkal;
        System.out.println("Вы потратили " + kkal + " килокалорий");
    }
}