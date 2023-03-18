
public class Dog {
	
	String name;
	int age;
	
	public static void testandoMetodoVoid() {
		System.out.println("Método estático do Dog");
	}

	public void testandoMetodoNaoVoid() {
		System.out.println("Método não estático do Dog");
	}
	
	// Quando usar método estático privado (seria para inicializar uma prop dentro da classe):
	// https://softwareengineering.stackexchange.com/questions/234412/why-have-private-static-methods
}
