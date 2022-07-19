package P001_010;

/**
 * 
 * フィボナッチ数列の項は前の2つの項の和である. 最初の2項を 1, 2 とすれば, 最初の10項は以下の通りである.
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 数列の項の値が400万以下の, 偶数値の項の総和を求めよ.
 * 
 * Note:この問題は最近更新されました. お使いのパラメータが正しいかどうか確認してください.
 * 
 * A.4613732
 * 
 * 
 */
public class P002 {

	int max = 4000000;
	int count = 0;

	P002() {
		
		fibo(0, 1);
	}

	void fibo(int a, int b) {
		if ((a + b) < max) {
			int c = a + b;
			
			if (c % 2 == 0) {
				count += c;
//				System.out.println(c);
			}
			fibo(b, c);
		} else {
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		new P002();
	}
}
