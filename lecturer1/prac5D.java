public class prac5D{
	public static void main(String[] args){
		System.out.println("3つ目の数値の合計，平均を計算します");
		System.out.println("1つ目の数値を入力");
		int a1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("2つ目の数値を入力");
		int a2 = new java.util.Scanner(System.in).nextInt();
		System.out.println("3つ目の数値を入力");
		int a3 = new java.util.Scanner(System.in).nextInt();
		int res1 = total(a1,a2,a3);
		double res2 = ave(a1,a2,a3);
		System.out.println("合計は" + res1 + "で，平均は" + res2 + "でした");
	}
		
	public static int total(int x, int y, int z){
		int total = x + y + z;
		return total;
	}
	
	public static int ave(int x, int y, int z){
		int ave = (x + y + z) / 3;
		return ave;
	}
}