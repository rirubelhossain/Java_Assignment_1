import java.util.Scanner;
public class First_Assignment{
	String name ;
	
	public void getData(String name)
	{
		this.name = name ;
	}
	public void displayMessage()
	{
		System.out.println(name);
		System.out.println("I want to be a Backend Java Developer that's why I am learing Java Programming.");
		System.out.println("My career goal is to become a successful Software Engineer and contribute to building innovative and reliable software solutions.");
	}
	
	public static void main(String[] agrs)
	{	
		First_Assignment message = new First_Assignment();
	
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		message.getData(name);
		message.displayMessage();
		
		
		
	}
}