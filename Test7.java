import java.util.Vector;

public class Test7{
	
	public static void main(String[]args) {
		long a[] =new long[100];
		Vector<Long> v = new Vector<Long>();
		long j=0 ;
		int k;
		a[0]=2;
		v.add(a[0]);
		int len =1;
		int count=1;
		for(j=3;;j++) {
			int flag =1 ;
			for(k=0;k<len;k++) {
				if(j%v.get(k)==0) {
					flag =0;
					break;
				}
			}
			if(flag==1) {
				v.add(j);

				if(isReNum(v.get(len))) {
					a[count]=v.get(len);
					count++;
				}
				len++;
				if(count==100)break;
			}
		}
	for(k =0 ;k<100;k++) {
			System.out.printf("%l ",a[k]);
			if((k+1)%10==0)System.out.println();
		}
	}
	public static boolean isReNum(long i) {
		String a=i+"";
		int flag =0;
		for(int k =0;k<a.length();k++) {
			if(a.charAt(k)!=a.charAt(a.length()-1-k)) {
				flag =1;
				break;
			}
		}
		if(flag ==1) {
			return false;
		}
		else {
			return true;
		}
	}
}
