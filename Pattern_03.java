package ineuron_pattern;

public class Pattern_03 {

	public static void main(String[] args) {
		int i,j;
		int n=10;
		for (i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==0 ||i==n-1 || i+j<=(n-1)/2 || j-i>=(n)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			

	}

}
