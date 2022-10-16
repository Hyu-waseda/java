public class task3C{
	public static void main(String[] args){
		System.out.println("じゃんけんをしましょう");
		System.out.println("0.ぐー,1.ちょき,2.ぱー");
		int a = new java.util.Scanner(System.in).nextInt();
		int b = new java.util.Random().nextInt(3);
		janken(a, b);
	}
	public static void janken(int a, int b){
		/*出す手を表示*/
		switch(a){
			case 0:
				System.out.println("あなたはぐー");
				break;
			case 1:
				System.out.println("あなたはちょき");
				break;
			case 2:
				System.out.println("あなたはぱー");
				break;
		}
		switch(b){
			case 0:
				System.out.println("あいてはぐー");
				break;
			case 1:
				System.out.println("あいてはちょき");
				break;
			case 2:
				System.out.println("あいてはぱー");
				break;
		}
		/*勝敗を表示*/
		if(a == b){
			System.out.println("あいこ");
		}
		else if(a - b == 1 || a - b == -2){
			System.out.println("あいての勝ち");
		}
		else{
			System.out.println("あなたの勝ち");
		}
	}
}
