public class Main {

    private static Object Number;
    private static Object Box;

    public static void main(String[] args) {

        Box<Number> number1 = new Box<Number>(5.53, 64);
        number1.getNumber1();
        number1.getNumber2();
        System.out.println(number1.getNumber1() + " и " + number1.getNumber2());

        Box<Number> number2 = new Box<Number>(88.9F, 76.1F);
        number2.getNumber1();
        number2.getNumber2();
        System.out.println(number2.getNumber1() + " и " + number2.getNumber2());

        //addition(5.53, 64, 88.9F, 76.1F);

        addition();
        multiplication();
    }


    public static Number addition(Box<? extends Number> number1, Box<? extends Number> number2) {
        return (number1.getNumber1().doubleValue() + number1.getNumber2().intValue() +
                number2.getNumber1().floatValue() + number2.getNumber2().floatValue());
    }

    public static Number multiplication(Box<? extends Number> number1, Box<? extends Number> number2) {
        return (number1.getNumber1().doubleValue() * number1.getNumber2().intValue() *
                number2.getNumber1().floatValue() * number2.getNumber2().floatValue());
    }


}
