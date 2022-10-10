public class lasttask {
	public static void main(String[] args) {
		// 参考にしたものなどは＊ ＊で表記
		// 表示を見やすくするために改行を用いている
		// 授業外の内容でbooleanを用いている ＊boolean型はhttps://www.sejuku.net/blog/41241を参考＊

		// ステータス（HP,MP,攻撃値,防御値）を設定 ＊配列にステータスを入れる方法は第１５回講義発展課題Cの回答例を参考にした＊
		int player[][] = { { 10, 0, 3, 1 }, { 15, 2, 6, 4 }, { 20, 6, 11, 6 }, { 25, 10, 15, 10 }, { 30, 15, 20, 11 } };
		int enemy[][] = { { 6, 2, 2, 1 }, { 15, 5, 6, 5 }, { 30, 8, 9, 7 }, { 40, 10, 14, 9 }, { 55, 2, 13, 13 } };
		// 試合数カウント（０で初期化）
		int count_game = 0;
		// プレイヤーのレベル（０で初期化）
		int level = 0;
		// プレイヤー敗北でループを抜ける用のフラグ変数
		boolean flag_player = false;
		// 説明
		System.out.println("闘技場へようこそ");
		System.out.println("あなたの名前を教えてください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("5回勝てば優勝です");
		for (int i = 0; i < 5; i++) {
			// 試合数とレベルを合わせる
			count_game = i + 1;
			level = i + 1;
			// 進行
			System.out.println("");
			System.out.println("");
			System.out.println("第" + count_game + "戦はじめ!!!");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("敵が現れた");
			// 戦闘
			while (true) {
				// 不可能な選択で最初のコマンド選択に戻すフラグ
				boolean frag_return = false;
				// 味方：レベル、HP、MPの表示
				// 敵：HPの表示
				System.out.println("");
				System.out.println("-------------------------");
				System.out.println(name + "　レベル" + level + " HP " + player[i][0] + " MP " + player[i][1]);
				System.out.println("");
				System.out.println("敵　          HP " + enemy[i][0]);
				System.out.println("-------------------------");
				/* プレイヤーのターン */
				System.out.println("コマンドを選択してください");
				System.out.println("0.攻撃 1.防御 2.魔法");
				// プレイヤーから入力を受け取る変数、入力
				int comand_player = new java.util.Scanner(System.in).nextInt();
				// 不可能な選択で最初のコマンド選択に戻す
				if (comand_player != 0 && comand_player != 1 && comand_player != 2) {
					System.out.println("");
					System.out.println("選択肢から選んでください");
					continue;
				}
				// 防御を選択した時、ターン終了時に防御値を戻す用のフラグ変数と変数
				boolean flag_def = false;
				int def = 0;
				// プレイヤーの行動
				switch (comand_player) {
					case 0:
						// 攻撃
						int damage = attack(player[i][2], enemy[i][3]);
						enemy[i][0] -= damage;
						System.out.println("");
						System.out.println(name + "の攻撃");
						System.out.println("敵に" + damage + "のダメージを与えた");
						break;
					case 1:
						// 防御
						flag_def = true;
						def = defence();
						player[i][3] += def;
						System.out.println("");
						System.out.println(name + "は防御の構えをとった");
						break;
					case 2:
						// 魔法
						// ヒール（消費MP２、レベル２で習得）、ファイヤ（消費MP３、レベル４で習得）
						// 魔法の選択コマンド用の変数（０で初期化）
						int comand_magic = 0;
						// 魔法の表示
						if (i == 0) {
							System.out.println("");
							System.out.println(name + "はまだ魔法を覚えていない");
							frag_return = true;
							break;
						} else if (i < 3) {
							System.out.println("");
							System.out.println("使用する魔法を選択してください");
							System.out.println("0.ヒール");
						} else {
							System.out.println("");
							System.out.println("使用する魔法を選択してください");
							System.out.println("0.ヒール 1.ファイヤ");
						}
						// 呪文の選択を入力
						comand_magic = new java.util.Scanner(System.in).nextInt();
						// 選択肢にない入力への対処(選択肢は必ず０か１であり、i <=４まではcomand_magic==0のみ）
						if (comand_magic != 0 && comand_magic != 1) {
							System.out.println("");
							System.out.println("選択肢から選んでください");
							frag_return = true;
							break;
						} else if (i < 3 && comand_magic == 1) {
							System.out.println("");
							System.out.println("選択肢から選んでください");
							frag_return = true;
							break;
						}
						// MP不足への対処（comand_magicが0でMP2消費、comand_magicが１でMP3消費)
						if ((player[i][1] < 2) || (comand_magic == 1 && player[i][1] < 3)) {
							System.out.println("");
							System.out.println("MPが足りません");
							frag_return = true;
							break;
						}
						// 呪文の実行
						switch (comand_magic) {
							case 0:
								// 回復魔法
								int heal = magic_heal();
								player[i][0] += heal;
								player[i][1] -= 2;
								System.out.println("");
								System.out.println(name + "はヒールを唱えた");
								System.out.println("HPが" + heal + "回復した");
								break;
							case 1:
								// 攻撃魔法
								int fire = magic_attack();
								enemy[i][0] -= fire;
								player[i][1] -= 3;
								System.out.println("");
								System.out.println(name + "はファイヤーを唱えた");
								System.out.println(fire + "のダメージを与えた");
								break;
						}
				}
				// フラグ変数で、選択肢にない選択で最初に戻るの実行
				if (frag_return) {
					continue;
				}
				// 勝敗判定
				if (enemy[i][0] <= 0) {
					System.out.println("");
					System.out.println("");
					System.out.println("敵を倒した");
					System.out.println("");
					System.out.println(name + "はレベルが上がった");
					if (i == 0) {
						System.out.println("");
						System.out.println(name + "はヒールを覚えた");
					}
					if (i == 3) {
						System.out.println("");
						System.out.println(name + "はファイヤーを覚えた");
					}
					break;
				}

				/* 敵のターン */
				// 敵の行動を決定
				int comand_enemy = new java.util.Random().nextInt(i + 1);
				// 敵の行動
				switch (comand_enemy) {
					case 0:
						// 攻撃
						int damage = attack(enemy[i][2], player[i][3]);
						player[i][0] -= damage;
						System.out.println("");
						System.out.println("敵の攻撃");
						System.out.println(name + "は" + damage + "のダメージを受けた");
						break;
					case 1:
						// 攻撃
						int damage1 = attack(enemy[i][2], player[i][3]);
						player[i][0] -= damage1;
						System.out.println("");
						System.out.println("敵の攻撃");
						System.out.println(name + "は" + damage1 + " のダメージを受けた");
						break;
					case 2:
						// 魔法攻撃
						int damage2 = magic_attack();
						player[i][0] -= damage2;
						System.out.println("");
						System.out.println("敵の魔法攻撃");
						System.out.println(name + "は" + damage2 + "のダメージを受けた");
						break;
					case 3:
						// 回復魔法
						int heal = magic_heal();
						enemy[i][0] += heal;
						System.out.println("");
						System.out.println("敵はヒールを唱えた");
						System.out.println("敵は" + heal + "回復した");
						break;
					case 4:
						// 弱体化魔法
						int debafu = magic_debafu();
						player[i][3] -= debafu;
						System.out.println("");
						System.out.println("敵は弱体化魔法を唱えた");
						System.out.println(name + "の防御力が" + debafu + "下がった");
						break;
				}

				// 勝敗判定
				if (player[i][0] <= 0) {
					flag_player = true;
					System.out.println("");
					System.out.println(name + "は負けてしまった");
					break;
				}

				// 防御選択時の防御値を戻す
				if (flag_def) {
					player[i][3] -= def;
					System.out.println("");
					System.out.println(name + "は防御の構えをやめた");
				}
			}
			// プレイヤーが敗北でループから抜ける
			if (flag_player) {
				break;
			}
		}

		// 最後の表示
		if (count_game == 5 && player[4][0] > 0) {
			System.out.println("");
			System.out.println("優勝おめでとうございます");
		} else {
			System.out.println("");
			System.out.println(name + "は第" + count_game + "戦目で敗退です");
			System.out.println("またの挑戦をお待ちしております");
		}
	}

	// ＊メソッドの作り方は第１５回講義発展課題Cの回答例を参考にした＊
	/* 攻撃メソッド */
	public static int attack(int att, int def) {
		int Ran = new java.util.Random().nextInt(4);
		int damage = att + Ran - def;
		if (damage > 0) {
			return damage;
		} else {
			return 0;
		}
	}

	// 防御メソッド
	public static int defence() {
		int Ran = new java.util.Random().nextInt(3);
		int def = 8 + Ran;
		return def;
	}

	// 攻撃魔法メソッド
	public static int magic_attack() {
		int Ran = new java.util.Random().nextInt(6);
		int damage = 5 + Ran;
		return damage;
	}

	// 回復魔法メソッド
	public static int magic_heal() {
		int Ran = new java.util.Random().nextInt(3);
		int heal = 10 + Ran;
		return heal;
	}

	// 弱体化魔法メソッド
	public static int magic_debafu() {
		int Ran = new java.util.Random().nextInt(4);
		int debafu = 4 + Ran;
		return debafu;
	}

}