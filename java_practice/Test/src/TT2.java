import java.util.Scanner;

public class TT2 {
	
	public static void main(String[]args) {
		double [][]a;
		a = new double[5][5];
		Scanner in = new Scanner(System.in);
		int col,row;
		col = in.nextInt();
		row = in.nextInt();
		int i;
		int j ;
		int cols=0,rows=0;
		double max=-65536 ;
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				a[i][j]=in.nextDouble();
				if(max<a[i][j]) {
					max = a[i][j];
					cols = i;
					rows = j;
				}
			}
		}
		System.out.printf("The location of the largest element is %.1f at (%d, %d)\n",
				max,rows,cols);
	}
}
