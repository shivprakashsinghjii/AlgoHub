public class ReverseString {

    // Method to reverse a string using a loop
    public static String reverseUsingLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseUsingLoop(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
