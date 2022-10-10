public class PatrolCarToy extends CarToy {
	// コンストラクタ
	public PatrolCarToy(String code, int price) {
		super(code, price);
	}

	// 走る
	public void go() {
		System.out.println("ウ〜ウ〜、ブロローッ");
	}
}
