import java.util.Scanner;

public class AreaOfCircle {
	
	   public static void main(String args[]){

		      Scanner input = new Scanner(System.in);

		      System.out.print("Enter the radius of the circle: ");
		      double radius = input.nextDouble();
		      
		      double area = Math.PI * Math.pow(radius, 2); //area = PI*radius*radius
		      System.out.println("The area of circle is: " + area);    
		   }
}
