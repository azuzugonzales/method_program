package by.bsu._inet_example.darkraha;

public enum EnumTest {
    RED, GREEN, BLUE, WHITE, BLACK, GRAY, YELLOW;

    boolean isMonochrome(){
        return this == BLACK || this == WHITE || this == GRAY;
    }
}

/*for (EnumTest k : EnumTest.values())
    System.out.println(k);*/
