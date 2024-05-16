public class BmiService {
    public int calculate(double heightInMeters, int weightInKilograms) {
        // вес в килограммах разделить на квадрат роста в метрах
        return (int) (weightInKilograms / (heightInMeters*heightInMeters));
    }
}