import java.util.*;


public class SwappingTwoNumber
{
        public static void main(String args[])
		{
			int x,y,Z;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Value for x: ");
			x=sc.nextInt();
			System.out.println("Enter The Value For y: ");
			y=sc.nextInt();
			System.out.println("Before Swapping Number are: "+ x + "," + y );
			Z=x;
			x=y;
			y=Z;
		        System.out.println("After Swapping the Numbers: "+ x + "," +y );
			System.out.println();
		}
}

