package by.bsu.com._inet_example.quizful.generic;

public class BoxPrinter {
    private Object val;

    public BoxPrinter(Object arg){
        val = arg;
    }

    public String toString(){
        return "{" + val + "}";
    }

    public Object getValue(){
        return val;
    }
}

class Test {
    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = (Integer) value1.getValue();
        //System.out.println(intValue1);
        BoxPrinter value2 = new BoxPrinter("Hello wold");
        System.out.println(value2);

        Integer intValue2 = (Integer) value2.getValue();
        System.out.println(intValue2);
    }
}
