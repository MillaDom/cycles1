import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSquares(100,100);
        System.out.println(expected + " == ? == " + actual);


    }
}
