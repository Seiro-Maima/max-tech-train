
public class ProductMangerApp {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		Product p1 = new Product("java", "Murach's Java Programming", 55.50);
		System.out.println(p1.toString());
		
		Book b1 = new Book("mySql", "Murach's MySql", 54.50, "Joel Murach");
		System.out.println(b1.toString());		
		
		Software s1 = new Software ("eclipse", "STS Esclipse", 0.0, "4.6.1.RELEASE");
		System.out.println(s1);
		
		System.out.println("Byeee!");
		
	}

}
