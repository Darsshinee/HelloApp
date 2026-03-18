public class HelloApp {
    public static void main(String[] args) {
        // Initialize a StringBuilder to efficiently concatenate strings
        StringBuilder nameBuilder = new StringBuilder();
        
        // Loop through each argument passed from the command line
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }
        
        String finalNames = "";
        
        // If arguments were provided, remove the trailing comma and space
        if (nameBuilder.length() > 0) {
            finalNames = nameBuilder.substring(0, nameBuilder.length() - 2); 
        }
        
        // Output the result
        if (finalNames.isEmpty()) {
            System.out.println("Hello!");
        } else {
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}