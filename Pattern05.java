package ineuron_pattern;

public class Pattern05 {

	public static void main(String[] args) {
		int i,j;
		int n=20;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0 || i==n-1 || i+j<=(n)/2 || i-j>=(n)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
