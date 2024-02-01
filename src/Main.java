public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.78; // рост в метрах
        double weight = 95.5; // вес в килограммах
        int bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}