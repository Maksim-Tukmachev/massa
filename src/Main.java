public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kg= 98;
        double cm= 1.87;
        int bmi = service.calculate( kg, cm);
        System.out.println(bmi);
    }
}