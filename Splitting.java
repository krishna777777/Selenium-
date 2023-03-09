
public class Splitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Please email us at mentor@rahulshettyacademy.com with below template to receive response";
		String[] strArray = null; 
		strArray = s.split("\\s");
		
		for (int i=0;i<strArray.length;i++)
		{
			if (strArray[i].equalsIgnoreCase("mentor@rahulshettyacademy.com")) {
				String s2 = strArray[i];
				
				 System.out.println(s2);
			}
		}
	}

}
