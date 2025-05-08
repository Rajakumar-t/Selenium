package hw.w3.d1;

public class FindIntersection {

	public static void main(String[] args) {
		int [] a = {3,2,11,4,6,7};
		int lengthOfArray = a.length;
		int [] b = {1,2,8,4,9,7};
		int lengthOfArray1 = b.length;
		for (int i=0; i<lengthOfArray;i++)
		for (int j=0;j<lengthOfArray1;j++){
			if (a[i]==b[j]){
				System.out.println(a[i]);
			}
			}
		
	}

}
