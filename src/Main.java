import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//System.out.println(); --> Sysout + ctrl + space
		/*enter		
			System.out.print("Hello World"); // without enter space
			
			System.out.print("Hello World \n"); //use "\n" for enter space
			System.out.print("Hello World");
			
			System.out.println("Hello World"); // use println for enter space
		*/
		
//--------------------------------------------------------------------------------------------------		
		/*tab
			System.out.println("\tHello World"); //use \t for tab
			System.out.println("Hello World");
		*/
		
//--------------------------------------------------------------------------------------------------	
		/* print Double quotes
			System.out.print("\"Hello World\"") //use \" to print double quotes
		  
		*/

//--------------------------------------------------------------------------------------------------	
		/* print backslash
			System.out.print("\\Hello World") //use \\ to print backslaxh
	  
		*/
	
//--------------------------------------------------------------------------------------------------	
		/*
			int x; //declaration
			x= 123; //assigment
			int y = 123; //initialization
		*/

//--------------------------------------------------------------------------------------------------			
		/*Input(Scanner)
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Input your name: ");
			String name = scanner.nextLine();
			System.out.println("You are " + name);
			System.out.println("Input your age: ");
			int age = scanner.nextInt();
			System.out.println("You are " + age + " years old");
			scanner.nextLine();                            // to fix nextInt -->nextLine
			System.out.println("Input your gender: ");
			String sex = scanner.nextLine();
			System.out.println("Hello " + sex + ". " + name + ", you are " + age + " years old");
		*/
					
//--------------------------------------------------------------------------------------------------	
		/*Simple GUI
			String name = JOptionPane.showInputDialog("Input your name: ");
			JOptionPane.showMessageDialog(null, "Hello " + name);
			
			int age = Integer.parseInt(JOptionPane.showInputDialog("Input your age: "));
			JOptionPane.showMessageDialog(null, "You are " + age + " years old");
			
			double height = Double.parseDouble(JOptionPane.showInputDialog("Input your height: "));
			JOptionPane.showMessageDialog(null, "You are " + height + " cm");
		*/
		
//--------------------------------------------------------------------------------------------------		
	/*Math function
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x value: ");
		x = scanner.nextDouble();
		System.out.println("Enter y value: ");
		y = scanner.nextDouble();
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("The hypotenuse is: " + z); //pythagoras
		
		scanner.close();
	*/
		
//--------------------------------------------------------------------------------------------------
		/*Random class
			Random random = new Random();
			int x = random.nextInt();
			System.out.println(x);
		*/
		
//--------------------------------------------------------------------------------------------------
		/*If...else..
			int a = 80;
			if (a>80) {
				System.out.println("A");
			}else if ((a>70) || (a<=79)){
				System.out.println("B");
			}else if ((a>60) || (a<=69)){
				System.out.println("C");
			}else if ((a>50) || (a<=59)){
				System.out.println("D");
			}
		*/
//--------------------------------------------------------------------------------------------------		
		/*Switch*/
		String day ="Friday";
		switch(day) {
			case "Sunday": System.out.println("it is Sunday");
			break;
			case "Monday": System.out.println("it is Monday");
			break;
			case "Tuesday": System.out.println("it is Tuesday");
			break;
			case "Wednesday": System.out.println("it is Wednesday");
			break;
			case "Thursday": System.out.println("it is Thursday");
			break;
			case "Friday": System.out.println("it is Friday");
			break;
			case "Saturday": System.out.println("it is Saturday");
			break;
			default: System.out.println("not exist");;
			
		}

		
//--------------------------------------------------------------------------------------------------			
	}

}
