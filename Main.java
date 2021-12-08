/*
* This program test the stack class
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2021-12-07
*/


final class Main {
    /**
    * Constant.
    */
    public static final int FOURTY = 40;
    /**
    * Constant.
    */
    public static final int TWENTY = 20;

    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static void main(final String[] args) {
        MrCoxallStack stack = new MrCoxallStack();

        System.out.println("Inicial Stack:");
        stack.showStack();

        System.out.println("Add 40:");
        stack.push(FOURTY);

        stack.showStack();

        System.out.println("Add 20:");
        stack.push(TWENTY);

        stack.showStack();

        System.out.println("\nDone.");
    }
}
