public class advC{
	public static void main(String[] args){
		/*自分と敵のHP,攻撃値(attV),防御値(defV)を設定*/
		int HP_my = 10, att_Value_my = 3, def_Value_my = 1, HP_ene = 12, att_Value_ene = 2, def_Value_ene = 2;
		/*どちらかのHPが０になるまで先頭を繰り返す*/
		while(HP_my > 0 && HP_ene > 0){
			/*自分と敵のコマンド(０が攻撃、１が防御)を設定*/
			System.out.println("コマンドを選択してください");
			System.out.println("0.攻撃 1.防御");
			int com_my = new java.util.Scanner(System.in).nextInt();
			int com_ene = new java.util.Random().nextInt(2);
			/*戦闘*/
			HP_ene += def(def_Value_ene, com_ene) - att(att_Value_my, com_my);
			HP_my += def(def_Value_my, com_my) - att(att_Value_ene, com_ene);
			/*残りHPを表示*/
			System.out.println("あなたの残りHPは" + HP_my);
			System.out.println("敵の残りHPは" + HP_ene);
		}
		if(HP_my <= 0){
			System.out.println("あなたの負けです");
		}
		else{
			System.out.println("あなたの勝ちです");
		}
	}
	/*攻撃メソッド*/
	public static int att(int Value, int com){
		/*攻撃選択なら乱数を攻撃(att))に足す*/
		int Ran = 0;
		if(com == 0){
			Ran = new java.util.Random().nextInt(4);
		}
		int att = Value + Ran;
		return att;
	}
	/*防御メソッド*/
	public static int def(int Value, int com){
		/*防御選択なら乱数を防御(def))に足す*/
		int Ran = 0;
		if(com == 1){
			Ran = new java.util.Random().nextInt(2);
		}
		int def = Value + Ran;
		return def;
	}
}