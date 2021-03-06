import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class passwordSt {
	
	static Predicate<Character> isDigit = (c -> Character.isDigit(c));
	static Predicate<Character> isUpper = (c -> Character.isUpperCase(c));
	static Predicate<Character> isLowerCase = (c -> Character.isLowerCase(c));
	static Predicate<String> isLenth = (c -> c.length()>=10);
	static Predicate<String> isSpecialCharacter = (c -> { String specialChars =
	 "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
	
	 return c.contains(specialChars); 
	 });
	
	static Predicate<String> isDigit1 = (p -> p.matches(".*\\d.*"));
	static Predicate<String> isLowerCase1 = (p -> p.matches(".*[a-z].*"));
	static Predicate<String> isUpper1 = (p -> p.matches(".*[A-Z].*"));
	static Predicate<String> isSpecialCharacter1 = (p -> p.matches("^[\"~`!@#$%^&*()-_=+\\\\|[{]};:'\\\",<.>/?\"]*$"));
	
	public static void main(String[] args)throws Exception {
		
		//System.out.println(calculatePasswordStrength("Nufu&YM21S"));
		//System.out.println(checkString("Nufu&YM21S"));
		//System.out.println(checkS("NufuYM21S"));
			
	        BufferedReader reader =  
	                new BufferedReader(new InputStreamReader(System.in)); 
	        String name = reader.readLine(); 
	        //System.out.println(checkS(name));
	        System.out.println(checkS(name));
	        
		
	}
	
	static boolean passwordStrength(String pass) {
		boolean flag = false;
		char currentCharacter;

	    for (int i = 0; i < pass.length(); i++) {
			
	        currentCharacter = pass.charAt(i);
	        if(isDigit.or(isUpper).or(isLowerCase).test(currentCharacter) && isLenth.test((pass))) {
	        	flag = true;
	        }else {
	        	return false;
	        }
	    }
	    return flag;
		
	}
	
	static String checkString(String input) {
	    
	    char currentCharacter;
	    String result = null;
	    
		 
    Predicate<String> isLenth = (s -> s.length()>=10 );
	    
	    //Function<String, Pattern>
    boolean flag = false;

	    for (int i = 0; i < input.length(); i++) {
			
	        currentCharacter = input.charAt(i);
	        if(isDigit.or(isUpper).or(isLowerCase).test(currentCharacter) && isLenth.test((input))) {
	        	flag = true;
	        }else {
	        	flag = false;
	        }
	    }
		return result;
	}
	static int calculatePasswordStrength(String password){
	    
	    if( password.matches("^(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{10,}$" ) )
	    	
	        System.out.println(";;;;;;;;;;;");
	        
	    return 0;
	    
	}
	
	
	private static String checkS(String input) {
	    String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
	    char currentCharacter;
	    boolean numberPresent = false;
	    boolean upperCasePresent = false;
	    boolean lowerCasePresent = false;
	    boolean specialCharacterPresent = false;

	    for (int i = 0; i < input.length(); i++) {
	        currentCharacter = input.charAt(i);
	        if (Character.isDigit(currentCharacter)) {
	            numberPresent = true;
	        } else if (Character.isUpperCase(currentCharacter)) {
	            upperCasePresent = true;
	        } else if (Character.isLowerCase(currentCharacter)) {
	            lowerCasePresent = true;
	        } else if (specialChars.contains(String.valueOf(currentCharacter))) {
	            specialCharacterPresent = true;
	        }
	    }
	    
	    if (numberPresent && upperCasePresent && lowerCasePresent && specialCharacterPresent) {
	    	return "strong";
	    	
	    }else if(numberPresent && upperCasePresent && lowerCasePresent && !specialCharacterPresent)
	    	return "medium";
		return "week";

	    
	}
	
	static char maxRepeating(String str) 
    { 
        int n = str.length(); 
        int count = 0; 
        char res = str.charAt(0); 
        int cur_count = 1; 
        // Traverse string except last character 
        for (int i = 0; i < n; i++) 
        { 
            // If current character matches with next 
            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) 
                cur_count++; 
            // If doesn't match, update result 
            // (if required) and reset count 
            else
            { 
                if (cur_count > count) 
                { 
                    count = cur_count; 
                    res = str.charAt(i); 
                } 
                cur_count = 1; 
            } 
        } 
        return res; 
    } 
	
	public static String passwordValidates( String pass ) {
		   int count = 0;
		   String result = null;

		   if( 8 <= pass.length() && pass.length() <= 32  )
		   {
//		      if( pass.matches(".*\\d.*") )
//		         count ++;
//		      if( pass.matches(".*[a-z].*") )
//		         count ++;
//		      if( pass.matches(".*[A-Z].*") )
//		         count ++;
//		      if( pass.matches(".*[*.!@#$%^&(){}[]:;'<>,.?/~`_+-=|\\].*") )
//		         count ++;
			   
			   if(isDigit1.and(isLowerCase1).and(isUpper1).and(isSpecialCharacter1).test(pass)) {
				   result =  "Strong";
			   }
			   else {
				   result =  "week";
			   }
		   }
		return result;

		   
		}

	public static String passValidates( String pass ) {
		   int count = 0;
		   String result = null;

		   if( 8 <= pass.length() && pass.length() <= 32  )
		   {
	      
			   if(isDigit1.and(isLowerCase1).and(isUpper1).and(isSpecialCharacter).test(pass)) {
				   result =  "Strong";
			   }
			   else if(isDigit1.and(isLowerCase1).and(isUpper1).test(pass)) {
				   result =  "medium";
			   }
			   else {
				   result =  "week";
			   }
		   }
		return result;

		   
		}

}
