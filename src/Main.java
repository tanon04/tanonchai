
public class Main {

	public static void main(String[] args)
	{
		int a, b, c=2;
		double gpa=3.50;
		String firstName = "Tanonchai";
		
		//for(int  i=0; i<10; i++)
		//	if(i % 2 ==0)
		//System.out.println("Hello," + i);
		
		int[] numbers = {1, 1, 2, 3, 5};
		int[] even = new int[20];
		String[] fruits = {"banana", "apple", "melon"};
		
		//for(int i=0; i<fruits.length; i++)
		//System.out.println(fruits[i]);
		
		//for-each loop
		//for(String f : fruits)
		//	System.out.println(f);
		
		//String
		//System.out.println(firstName.charAt(1));
		
		String tel = "053-211-122-1111";
		String[] sp = tel.split("-");
		System.out.println("("+sp[0]+")"+sp[1]);
		
		
	}
	
}
