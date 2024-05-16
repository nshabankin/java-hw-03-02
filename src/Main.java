public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); // объект BmiService
        double height = 1.87; // рост в метрах
        int weight = 98; // вес в килограммах
        int index = service.calculate(height, weight); // рассчет индекса массы тела в целых числах
        System.out.println("Рост (м): " + height);
        System.out.println("Вес (кг): " + weight);
        System.out.println("Индекс массы тела: " + index);
    }
}