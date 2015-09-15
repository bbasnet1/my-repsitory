import java.util.Scanner;
public class Practice
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("\"Please enter the price: \"");
		double packPrice = in.nextDouble();

		System.out.print("please enter the volume for each can (in ounces): ");
		double canVolume = in.nextDouble();
	}
}
