
public class StrPalindrome {
	static String pal = null;

	public static void main(String[] args) {
	palChkStr("Maddam");
	}
		
	public static void palChkStr(String word) {
		char[] str=word.toCharArray();
		char[] fstHalf=new char[str.length/2];
		char[] secHalf=new char[str.length/2];
		
		if(str.length%2==0) {
			for(int i=0;i<str.length/2;i++) {
				fstHalf[i]=str[i];
				System.out.print(fstHalf[i]);
			}
			for(int j=str.length-1;j>=str.length/2;j--) {
				secHalf[(str.length-1)-j]=str[j];
				System.out.print(secHalf[j]);
			}
		} 
	}
}



