public class Converter {
    int ONE_STEP = 75;
    int KAL_STEP = 50;
    int KAL_TO_KKAL = 1000;
    int convertToKm(int steps) { //Конвертация общего количества шагов в км.
        return (steps * ONE_STEP / 100000);
    }

    int convertStepsToKilocalories(int steps) { // Подсчёт общего значения количества килокалорий
        return (steps * KAL_STEP / KAL_TO_KKAL);
    }
}