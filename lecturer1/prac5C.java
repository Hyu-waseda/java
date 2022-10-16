public class prac5C{
	public static void main(String[] args){
		System.out.println("引き算します");
		System.out.println("一つ目の数字を入力");
		int a = new java.util.Scanner(System.in).nextInt();
		System.out.println("二つ目の数字を入力");
		int b = new java.util.Scanner(System.in).nextInt();
		int ans = minus(a,b);
		System.out.println(ans);
	}
	public static int minus(int x, int y){
		int ans = x - y;
		return ans;
	}
}