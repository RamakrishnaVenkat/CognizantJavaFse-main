public class SingletonPatternTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Are both logger instances the same? " + (logger1 == logger2));

        logger1.log("This is a log message from logger1.");
        logger2.log("This is a log message from logger2.");
    }
}
