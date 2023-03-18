import java.io.Console;

// Seguindo os vídeos:
// https://www.youtube.com/watch?v=drQK8ciCAjY
// https://www.youtube.com/watch?v=P-_Nzi_mCRo

public class FirstJavaProgram {

	// Será executado tudo que está no método main
	public static void main(String[] args) {

		// O clássico Hello World
		// Sempre usar ponto e vírgula
		System.out.println("Hello world!");
		System.out.println("------------");

		// Tipos primitivos começam com letra minúscula (int, double, char...)
		// Tipos não primitivos são baseados nos primitivos e começam com letra
		// maiúscula (String...)

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
		// javac FirstJavaProject.java
		// java
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
			System.out.println("The command line arguments are:");

			// iterating the args array and printing
			// the command line arguments
			for (String val : args)
				System.out.println(val);
		} else
			System.out.println("No command line " + "arguments found.");

		// Chamando método:
		metodoTeste("Chamei a função depois de printar os args que passei na main!");
		
		System.out.println("------------");
		System.out.println("Consigo acessar métodos estático sem instanciar a classe:");
		Dog.testandoMetodoVoid();
		System.out.println("------------");
		System.out.println("Métodos não estáticos preciso instaciar a classe:");
		Dog cachorro = new Dog();
		cachorro.testandoMetodoNaoVoid();
		System.out.println("------------");
		System.out.println("Nome e idade do doggo:");
		cachorro.name = "Pateta";
		cachorro.age = 1;
		System.out.println("Nome: " + cachorro.name + ", idade: " + cachorro.age);
	}

	// Regra do One rule-of-thumb para saber se faço um método estático ou não
	// https://stackoverflow.com/questions/2671496/when-to-use-static-methods
	private static void metodoTeste(String testandoArgs) {
		System.out.println("------------");
		System.out.println("Passei pelo método testeeee!");
		System.out.println("O argumento passado é:" + testandoArgs);
	}
}
