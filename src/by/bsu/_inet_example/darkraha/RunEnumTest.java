package by.bsu._inet_example.darkraha;

public class RunEnumTest {
    public static void main(String[] args) {
        EnumTest e = EnumTest.BLACK;
        System.out.println(e);
        System.out.println(e.isMonochrome());

        System.out.println("==============");
        e = EnumTest.GREEN;
        switch (e){
            case RED:
                System.out.println("1 - " + e);
                break;
            case GREEN:
                System.out.println("2 - " + e);
                break;
            case BLUE:
                System.out.println("3 - " + e);
                break;
            default:
                System.out.println("non rgb color");
        }
    }
}
