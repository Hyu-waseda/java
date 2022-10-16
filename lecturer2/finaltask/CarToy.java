public class CarToy {
	String code_; // 商品コード
	int price_;

	// コンストラクタ
	public CarToy(String code, int price) {
		code_ = code;
		price_ = price;
	}

	// 走る
	public void go() {
		System.out.println("ブロローッ");
	}

	// ライトを点ける
	public void light() {
		System.out.println("ピカーッ");
	}
}
