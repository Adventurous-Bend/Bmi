public class BmiService {
    public int calculate(int massKg, double heightM) {
        int bmi = (int) (massKg / (heightM * heightM));
        return bmi;
    }
}
