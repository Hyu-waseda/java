public class task3B{
	public static void main(String[] args){
		System.out.println("５つの整数値の合計，平均，最大値を計算します");
		double [] A = new double[5];
		for(int i = 0;i < 5;i++){
			A[i] = new java.util.Scanner(System.in).nextDouble();
		}
		System.out.println("1.合計, 2.平均, 3.最大値, 0.終了");
		int a = new java.util.Scanner(System.in).nextInt();
		switch(a){
		case 0:
			break;
		case 1:
			sum(A);
			break;
		case 2:
			ave(A);
			break;
		case 3:
			Max(A);
			break;
		}
	}
	public static void sum(double [] X){
		double ans = 0;
		for(int i = 0;i < 5;i++){
			ans += X[i];
		}
		System.out.println(ans);
	}
	public static void ave(double [] X){
		double sum = 0;
		for(int i = 0;i < 5;i++){
			sum += X[i];
		}
		double ans = sum / 5;
		System.out.println(ans);
	}
	public static void Max(double [] X){
		double max = X[0];
		for(int i = 1;i < 5;i++){
			if(max < X[i]){
				max = X[i];
			}
		}
		System.out.println(max);
	}
}