public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); // объект BmiService
        double height = 1.87; // рост в метрах
        int weight = 98; // вес в килограммах
        int index = (int) service.calculate(height, weight); // рассчет индекса массы тела в целых числах
        System.out.println(index);
    }
}