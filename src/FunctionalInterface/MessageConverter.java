package FunctionalInterface;

@java.lang.FunctionalInterface
interface MessageConverter {
    String convert(String message);
}

class FunctionalInterface {
    public static void main(String[] args) {
    MessageConverter toUpper = msg -> msg.toUpperCase();
    System.out.println(toUpper.convert("Ayan Khan"));
    }
}
