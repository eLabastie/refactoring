public class Base {

    protected int doubleValue(int number) {
        return number + number;
    }
}
class Derived extends Base {
    public static void main(String[] args) {
        Derived subject = new Derived();
        System.out.println("Doubling 21. Result: " + subject.doubleValue(21));
    }
}
