package h11;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        "Hello world!\n"
            .chars()
            .mapToObj(i -> (char) i)
            .forEach(System.out::print);
    }
}
