public class advB{
	public static void main(String[] args){
		System.out.println("運試しゲームをしましょう！これから１から８までの数値を設定します");
		System.out.println("私とあなたで数値を予測しあって，近い数値の方が勝ちです！");
		System.out.println("私は予測しました！");
		System.out.println("あなたはどの数値と予測しますか？１から８までで数値を入力してください");
		/*ansが答え、Aがコンピュータ、Bがプレイヤー*/
		/*ansとAに０〜７がランダムで入る*/
		int ans = new java.util.Random().nextInt(8);
		int A = new java.util.Random().nextInt(8);
		/*ansとAを１〜８に変換*/
		ans++;
		A++;
		/*プレイヤー*/
		int B = new java.util.Scanner(System.in).nextInt();
		/*近い方を判別して結果をresultに入れる*/
		String result = "";
		if(Math.abs(ans - A) > Math.abs(ans - B)){
			result = "あなたの勝ち";
		}
		else if(Math.abs(ans - A) < Math.abs(ans - B)){
			result = "あなたの負け";
		}
		else{
			result = "引き分け";
		}
		System.out.println("数値は" + ans + "で，私は" + A + "あなたは" + B + "と予測したので" + result + "です");
	}
}
		