public class BmiService {
    public double calculate(double heightInMeters, int weightInKilograms) {
        // вес в килограммах разделить на квадрат роста в метрах
        return weightInKilograms / (heightInMeters*heightInMeters);
    }
}

