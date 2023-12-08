
public class BmiService {
    public int calculate(double heightM, int weightKg) {
        double bmi = weightKg / (heightM * heightM);
        return (int) bmi;
    }
}
