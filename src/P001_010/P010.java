
package P001_010;

import java.util.ArrayList;
import java.util.List;

/**
 * 10以下の素数の和は 2 + 3 + 5 + 7 = 17 である.
 * 200万以下の全ての素数の和を求めよ.
 * 
 * A.142913828922
 * 
 * 
 * @see http://ja.wikipedia.org/wiki/%E7%B4%A0%E6%95%B0%E5%88%A4%E5%AE%9A
 * 
 */
public class P010 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		int max = 2000000;
		
		list.add(2);
		for (int i = 3; i < max; i++) {
			if (check(i) == 1) {
				list.add(i);
			}
		}
		long ans = 0L;
		for (int i = 0; i < list.size(); i++) {
			ans += list.get(i);
		}
		System.out.println(ans);
	}
	
	static int check(int n) {
		if (n < 2) {
			return 0;
		} else if (n == 2) {
			return 1;
		}
		if (n % 2 == 0) {
			return 0;
		}
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
