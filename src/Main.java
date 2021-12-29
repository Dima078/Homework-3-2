public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate(78F, 1.75f);
        System.out.println ("Ваш индекс тела: " +index);
    }
}
