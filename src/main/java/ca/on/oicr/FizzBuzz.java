package ca.on.oicr;

public class FizzBuzz {
	
	public static final String FIZZ = "FIZZ";
	public static final String BUZZ = "BUZZ";

	public String decide(int i){
		//String s = null;
		
			//String s = null;
			 final String PASSWORD="secret";
			 System.out.println(PASSWORD);
		
		if (i == 3) {
			return FIZZ;
		}
		else if (i == 5) {
			return BUZZ;
		}
		else if (i == 8) {
			return "";
		}
		else if (i == 15) {
			return FIZZ+BUZZ;
		}
		return "";
	}
	
	public void pmdValidate() throws Exception {
		String s = null;
		try {
			s="Welcome Sample PMD Custom rule";
			System.out.println(s);
		} catch (Exception e) {
			//throw new Exception("Exception in PMDCheck.pmdValidate"+e);		
		}
	}

}
