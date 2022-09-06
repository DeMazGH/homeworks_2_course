public class HogwartsService {

    protected static void checkParametrValue(String parametrName, int parametrValue) {
        int minValue = 0;
        int maxValue = 100;
        if (parametrValue < minValue || parametrValue > maxValue) {
            throw new IllegalArgumentException("Значение параметра " + parametrName + " может быть от 0 до 100");
        }
    }
}
