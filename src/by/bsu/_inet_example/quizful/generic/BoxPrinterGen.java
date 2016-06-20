package by.bsu._inet_example.quizful.generic;

public class BoxPrinterGen<T> {
    private T val;

    public BoxPrinterGen(T arg){
        val = arg;
    }

    public String toString(){
        return "{" + val + "}";
    }

    public T getValue(){
        return val;
    }
}

class TestGen {
    public static void main(String[] args) {
        BoxPrinterGen<Integer> value1 = new BoxPrinterGen<Integer>(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        //System.out.println(intValue1);
        BoxPrinterGen<String> value2 = new BoxPrinterGen<String>("Heloo world");
        //System.out.println(value2);

        //Integer intValue2 = value2.getValue();
        String intValue2 = value2.getValue();
        System.out.println(intValue2);
    }
}
