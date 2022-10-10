public class TrainToy {
	String code_;
	int price_;

	public TrainToy(String code, int price) {
		code_ = code;
		price_ = price;
	}

	// 走る
	public void go() {
		System.out.println("ガタンゴトン");
	}

	// ライトを点ける
	public void light() {
		System.out.println("ブォー！");
	}
}
