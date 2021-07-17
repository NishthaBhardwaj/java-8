import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1{
	
	
	public static Integer getKthElement(List<Integer> listOfnumbers, int kth) throws Exception {

		int minValue = Collections.min(listOfnumbers);
		int kthValue = listOfnumbers.get(kth);
		if (kthValue == minValue) return kthValue;
		else return null;

	}
		
		
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Input:- ");
	    System.out.println("(EOF or non-integer to terminate): ");
	    int kthValue = input.nextInt();
		while(input.hasNextInt()) {
			al.add(input.nextInt());
			
		}
		try {
			System.out.println(al);
		System.out.println("output:- "+ getKthElement(al,kthValue));
		}catch(Exception e ) {
		System.out.println("there is error occuerd ");
		}
		
	}
	
	
	
}