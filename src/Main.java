public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 180;
        int weight = 75;
        int bmi = service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}
