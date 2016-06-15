package by.bsu.com._inet_example.byteslounge.enums;

public enum EOperator implements Operator {

    SUM{
        @Override
        public int calculate(int firstOperand, int secondOperand) {
            return firstOperand + secondOperand;
        }
    },
    SUBTRACT{
        @Override
        public int calculate(int firstOperand, int secondOperand) {
            return firstOperand - secondOperand;
        }
    }

}
