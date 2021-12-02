public class BmiService {
    public int calculate(int height, int weight) {
        int bmi = ((weight * 10_000) / (height * height));
        return bmi;
    }
}
