public class prac5E{
	public static void main(String[] args){
		System.out.println("3つ目の数値の合計，平均を計算します");
		System.out.println("1つ目の数値を入力");
		int a1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("2つ目の数値を入力");
		int a2 = new java.util.Scanner(System.in).nextInt();
		System.out.println("3つ目の数値を入力");
		int a3 = new java.util.Scanner(System.in).nextInt();
		double[] A = {a1, a2, a3};
		calc(A);
	}
		
	public static void calc(double [] X){
		double sum = 0;
		for(int i = 0;i < X.length;i++){
		sum += X[i];
		}
		double ave = sum/X.length;
		System.out.println("合計は" + sum + "で，平均は" + ave + "でした");
	}
}