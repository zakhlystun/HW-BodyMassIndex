public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.77;
        int weightKg = 99;
        int bmi = service.calculate(heightM, weightKg);
        if (bmi > 30) {
            System.out.println("Ваш индекс массы тела составляет: " + bmi + "\nВам следует обратить внимание на свой вес!");
        } else {
            System.out.println("Ваш индекс массы тела составляет: " + bmi);
        }


    }
}