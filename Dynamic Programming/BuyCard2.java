import java.util.*;
public class BuyCard2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i=1;i<=n;i++) {
			a[i] = sc.nextInt();
		}
		int[] d = new int[n+1];
		for(int i=1;i<=n;i++) {
			d[i] = 1000*10000;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				d[i] = Math.min(d[i], d[i-j] + a[j]);
			}
		}
		System.out.println(d[n]);
	}

}