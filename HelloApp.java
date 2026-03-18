public class HelloApp {
    public static void main(String[] args) {		
		
		StringBuilder nameBuilder = new StringBuilder();

     for (int i = 0; i < args.length; i++) {
    nameBuilder.append(args[i]);

        if (i < args.length - 1) {
        nameBuilder.append(", ");
    }
}

     String name = nameBuilder.toString();
		if (args.length > 0){
			name = args[0];
		}
        System.out.println("Hello," + name + "!");
    }
}