public class Box<T> {
    private T number1;
    private T number2;

    //Box<Integer, Integer> box = new Box<>();

    public Box(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public T getNumber1() {
        return number1;
    }

    public T getNumber2() {
        return number2;
    }


}
