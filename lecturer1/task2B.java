public class task2B {
	public static void main(String[] args) {
		System.out.println("変数aはどれくらい？");
		int ans = new java.util.Random().nextInt(9);
		for(int i = 0;i < 5;i++){
			System.out.println("0から9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt(); 
			if(ans == num){
				System.out.println("あたり");
				break;
			}
			else{
				System.out.println("違うよー");
			}
		}
	}
}