package task1;

public class CloneMethod {

	public static void main(String[] args) {
		
		int[]a= {11,24,46,76};
		int[]b =new int[a.length];
		
		
		b= a.clone();
		b[0]++;
		
		System.out.println("printing array a[]");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("printing array b[]");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
