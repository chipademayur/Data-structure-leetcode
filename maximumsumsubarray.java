package simpleprogram;

public class maximumsumsubarray {

	static int maximumsubarray(int a[]) {
		int CurSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			CurSum=CurSum+a[i];
			if(maxSum<CurSum) maxSum=CurSum;
				if(CurSum<0) CurSum=0;
				}
		return maxSum;
		
	}

	public static void main(String[] args) {
		int a[]= {80,  10,-2,7,-6,4,1,-3,8};
		int Mayur=maximumsubarray(a);
		System.out.println(Mayur);

	}

}
