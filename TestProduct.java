import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		
		
		Product product=new Product();
		
		System.out.println("Enter Product Name:");     
		Scanner scanner = new Scanner(System.in);
	    product.ProductName=scanner.nextLine();
		System.out.println(product.ProductName);
		
		System.out.println("Enter Brand Name:");
		product.Brand=scanner.nextLine();
		System.out.println(product.Brand);
		
		System.out.println("Enter Colour:");
		product.Colour=scanner.nextLine();
		System.out.println(product.Colour);
		
		System.out.println("Enter Size:");
		//Scanner scanner1 = new Scanner(System.in);
		product.size=scanner.nextInt();
		System.out.println(product.size);
		
		System.out.println("Enter Price:");
		product.Price=scanner.nextInt();
		System.out.println(product.Price);
		
		
	}
}
