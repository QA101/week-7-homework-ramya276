
public class SubseqLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr= {1,2,3,4,5,-1,4,5};
		int[] intArr2=new int[intArr.length];
		int j=0, i=0;
		for(i=0;i<=intArr.length;i++) {
			if(intArr[i]<0)
			{
			break;
			} else {
				intArr2[j]=intArr[i];
				System.out.println(intArr2[j]);	
				j++;
			}	
		}
		System.out.println();	
	}
}


