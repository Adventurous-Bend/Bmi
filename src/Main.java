public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massKg = 90;
        double heightM = 1.80;
        int index = service.calculate(massKg, heightM);

        System.out.println(index);
    }
}