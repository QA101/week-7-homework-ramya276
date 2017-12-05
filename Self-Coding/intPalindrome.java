import java.util.Arrays;

public class intPalindrome {

	public static void main(String[] args) {
int arr[]= {1,2,3,4,2,1};		
intPalChk(arr);

	}
	public static void intPalChk(int[] intArr) {
	int[] revArr=new int[intArr.length];
	int i, j=0;
		for (i=intArr.length-1;i>=0;i--) {
			revArr[j]=intArr[i];
			System.out.print(revArr[j]);
			j++;
		}
		if(Arrays.equals(revArr, intArr)) 
				{
			System.out.println("Is Palindrome");
				}else {
					System.out.println("Not Palindrome");
				}
			
		
			
		
	}
}
