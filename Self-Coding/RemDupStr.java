import java.util.ArrayList;
import java.util.Collection;

public class RemDupStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
remDup("ana");
	}

	public static void remDup(String str) {
	ArrayList<Character> dupArr=new ArrayList<Character>();
	char[] feedArr=str.toCharArray();
	for(char ch:feedArr) {
		dupArr.add(ch);	
	}
System.out.println(dupArr);

	for(int i=0;i<=dupArr.size();i++) {
		for(int j=0;j<=i;j++) {
			if(dupArr.get(i)==dupArr.get(j)) {
				System.out.println(dupArr);
				dupArr.remove(j);
			}
		}
		
	}
	System.out.println("final:"+dupArr);
	}
}
