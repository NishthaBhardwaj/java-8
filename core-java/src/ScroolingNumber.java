import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ScroolingNumber {
	
	public static void main(String[] args) throws Exception{
		
        BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
        String name = reader.readLine(); 
        
        
        String a[] = name.split(",");
        int num1 =  Integer.parseInt(a[0].trim());
        int num2 =  Integer.parseInt(a[1].trim());
        System.out.println(num1);
        System.out.println(num2);


		findCombinations(num1, num2);
	}

	public static void findCombinations(int a, int b) {

		boolean isFound = false;
		ArrayList<Integer> num = new ArrayList<>();
		for (int c = a; c <= b; c++) {
			final Set<Integer> set = new HashSet<Integer>();
			final Map<Integer, Integer> map = new HashMap<>();
			final String number = String.valueOf(c);
			if (number.contains("0")) {
				continue;
			}
			for (int i = 0; i < number.length(); i++) {
				final int digit = number.charAt(i);
				set.add(digit);
				map.put(digit, i);
			}
			System.out.println(map);System.out.print(set);
			if (number.toCharArray().length != set.size()) {
				continue;
			}

			final int length = number.length();
			int j = 0;
			int k = 1;
			while (k <= length) {
				set.remove((int) number.charAt(j));
				j = (number.charAt(j) + map.get((int) number.charAt(j))) % length;
				k++;
			}
			if (j == 0 && set.size() == 0) {
				System.out.println(number);
				num.add(Integer.parseInt(number));
				isFound = true;
			}

		}
		if (!isFound) {
			System.out.println(-1);
		}
System.out.println(num);
	}
	}


