package HOMETASK6_COLLECTIONS;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		LIST<Integer> LS=new LIST<Integer>();
		LS.add("a");
        LS.add("b");
        LS.add("c");
        LS.add("d");
        LS.add("e");
        LS.add("f");
        LS.add("g");
        LS.add("h");
        LS.add("i");
        LS.add("j");
        System.out.println("The elements in the list are:");
        LS.print();
	
	while(true)
	{
		System.out.println("\nFor any changes:");
		System.out.println("Enter :\n 1 for Add Element\n 2 for get Element\n 3 for remove Element ");
	//System.out.println("Enter 1 or 2 or 3:");
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	switch(num)
		{
		case 1:
			System.out.println("Enter the number of elements:");
			int number=sc.nextInt();
			System.out.println("Enter the elements:");
			for(int i=0;i<number;i++)
			{
			int num1=sc.nextInt();
			LS.add(num1);
			System.out.println("After Addition");
		     LS.print();
		     System.out.println( );
			}
		     break;
		case 2:
			System.out.println("Enter the index to get element");
			int i=sc.nextInt();
			Object o=LS.get(i);
			System.out.println("The element is: " +o);
			System.out.println( );
			break;
		case 3:
			System.out.println("Enter index  to remove element :");
			int num2=sc.nextInt();
			LS.remove(num2);
			System.out.println();
			System.out.println("Elements after removing:");
			LS.print();
			System.out.println( );
			break;
		default:
			System.out.println("Wrong element");
		}
	}
}
}
