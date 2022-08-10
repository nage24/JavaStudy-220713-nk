package 복습;

public class BreakAddContinue {

	public static void main(String[] args) {
		String[] strArray = new String[] {"a", "b", null, "d", "e", "f", null, "h"};

		for(int i = 0; i < strArray.length; i++) {
			if(strArray[i] == null) {
				strArray[i] = Character.toString((char) (97+i));
			}
			System.out.println("i: " + i + " -> " + strArray[i]);
		}
		
		for(String s : strArray) {
			System.out.println(s);
		}

	}

}
