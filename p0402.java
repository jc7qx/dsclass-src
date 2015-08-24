public class p0402{
	public static void main(String[] args){
		int score[];
		score = new int[6];
		score[0] = 100;
		score[1] = 92;
		score[2] = 83;
		score[3] = 74;
		score[5] = 65;
				
		prArray(score);
		int c = insert(score, 0, 99);
		System.out.println("c= "+c);
		
	}
	
	static void prArray(int a[]){
		for (int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	static int insert(int a[], int ip, int num){
		int len = a.length;
		if ((ip<0)||(ip>=len))
			return 0;
		int i=a.length-1;
		while (i>ip){
			a[i] = a[i-1];
			i--;
		}
		a[i] = num;
		prArray(a);
		return 1;
	}
}

