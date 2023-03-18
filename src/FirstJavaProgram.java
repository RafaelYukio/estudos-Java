import java.io.Console;

public class FirstJavaProgram {

	// Será executado tudo que está no método main
	public static void main(String[] args) {

		// O clássico Hello World
		// Sempre usar ponto e vírgula
		System.out.println("Hello world!");
		System.out.println("------------");

		// Método para soma, com input pelo console:
		// https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/
		
		// Só é possível executar no terminal:
		
		Console console = System.console();
		
		System.out.println("Enter first number:");
		int numberA = Integer.parseInt(console.readLine());
		System.out.println("Enter second number:");
		int numberB = Integer.parseInt(console.readLine());
		
		System.out.println("The sum:");
		System.out.println(Integer.toString(numberA + numberB));

		// Executar programa java pelo terminal:
		// https://www.scaler.com/topics/how-to-run-java-program/
		
		// O comando `javac` compila o arquivo .java para que possa ser executado
		// `compiles them into class files that run on the Java Virtual Machine`
		// https://docs.oracle.com/en/java/javase/13/docs/specs/man/javac.html
		
		// Executando código java no terminal e passando os `args` para printar:
		// https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/
		
		// check if length of args array is
        // greater than 0
		System.out.println("------------");
		System.out.println("args da execução do projeto");
        if (args.length > 0) {
            System.out.println(
                "The command line arguments are:");
 
            // iterating the args array and printing
            // the command line arguments
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line "
                               + "arguments found.");
	}

}
