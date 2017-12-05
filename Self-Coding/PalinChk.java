
public class PalinChk {
	public static void main(String[] args) {
		palChk("malayalam");
	}

	public static void palChk(String wrd) {
		int halfLen = wrd.length()/2;
		int wordLen = wrd.length();
		System.out.println(halfLen+" "+wordLen);
		String fHalfStr = wrd.substring(0, halfLen);
		System.out.println("1st Half:" + fHalfStr);
		String sHalfStr1;
		if (halfLen%2==0)
			sHalfStr1 = wrd.substring(halfLen+1, wrd.length());
		else
			sHalfStr1 = wrd.substring(halfLen, wrd.length());
		
		System.out.println("Sec Half:" + sHalfStr1);

		char[] wrdArr = sHalfStr1.toCharArray();
		char[] revHalfStr = new char[wrdArr.length];
		int j = 0;
		for (int i = wrdArr.length - 1; i >= 0; i--) {
			revHalfStr[j] = wrdArr[i];
			System.out.print(revHalfStr[j]);
			j++;
		}
		String revStr = String.copyValueOf(revHalfStr);
		System.out.println(revStr);

		if (fHalfStr.equalsIgnoreCase(revStr)) {
			System.out.println("is palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

	
}
