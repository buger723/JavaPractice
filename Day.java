import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner input =new Scanner(System.in);
		int h;
		int m,q,j,k,y;
		y = input.nextInt();
		m = input.nextInt();
		if(m==1) {
			m = 13;
		}
		if(m==2) {
			m=14;
		}
		q =input.nextInt();
		k = y%100;
		j= y/100;
		h = (q+ 26* (m + 1) / 10 + k + k / 4 + j / 4 + 5* j) % 7;
		switch(h) {
			case 0:
				System.out.println("Saturday");
				break;
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
		}
	}
}