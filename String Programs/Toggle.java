import java.util.Scanner;
class Toggle {
    String str;
    String newstr;
    int len;

    // Constructor to initialize variables
    Toggle() {
        str = "";
        newstr = "";
        len = 0;
    }

    // Method to read input from the user
    void realword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        str = sc.nextLine();
        sc.close(); // Closing the scanner to prevent resource leak
    }

    // Method to toggle the case of characters in the string
    void toggle() {
        len = str.length();
        for (int i = 0; i < len; i++) { // Changed loop condition to iterate correctly
            if (Character.isUpperCase(str.charAt(i)))
                newstr += Character.toLowerCase(str.charAt(i));
            else
                newstr += Character.toUpperCase(str.charAt(i));
        }
    }

    // Method to display the original and toggled strings
    void display() {
        System.out.println("The given word was: " + str);
        System.out.println("The toggled word is: " + newstr);
    }

    // Main method to run the program
    public static void main() { // Added args parameter
        Toggle obj = new Toggle();
        obj.realword();
        obj.toggle();
        obj.display();
    }
}
