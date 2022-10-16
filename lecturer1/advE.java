public class advE{
	public static void main(String[] args){
		System.out.println("質問を出します");
		
		/*クイズ*/
		String[][] quiz = new String[3][3];
		/*１問目*/
		quiz[0][0] = "現早稲田大学総長の本名は?";
		quiz[0][1] = "1.らぶじ 2.田中愛治 3.Love治";
		quiz[0][2] = "2";
		/*2問目*/
		quiz[1][0] = "早稲田大学が空調設備にかけた金額は?";
		quiz[1][1] = "1.１.５億円 2.２.５億円 3.７.５億円";
		quiz[1][2] = "3";
		/*3問目*/
		quiz[2][0] = "今何問目";
		quiz[2][1] = "1.１問目 2.２問目 3.３問目";
		quiz[2][2] = "3";
		
		int count = 0;
		for(int i = 0;i < 3;i++){
			/*問題文と選択肢の表示*/
			System.out.println(i + 1 + "問目");
			System.out.println(quiz[i][0]);
			System.out.println(quiz[i][1]);
			/*回答の読み取りと正誤判定*/
			String ans = new java.util.Scanner(System.in).nextLine();
			if(ans.equals(quiz[i][2])){
				System.out.println("正解");
				count++;
			}
			else{
				System.out.println("不正解");
			}	
		}
		System.out.println("あなたの正解数は" + count);
	}
}