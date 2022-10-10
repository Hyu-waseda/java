public class ShopKeeper {
	String name_; // 名前

	// コンストラクタ
	public ShopKeeper(String name) {
		name_ = name;
	}

	// 価格をチェックする
	public void checkPrice(CarToy auto1, PatrolCarToy pcar1, TrainToy rail1) {
		System.out.println("店長の" + name_ + "です。これから価格をチェックします。");
		System.out.println("商品コード：" + auto1.code_ + "の価格は" + auto1.price_ + "円です。");
		System.out.println("商品コード：" + pcar1.code_ + "の価格は" + pcar1.price_ + "円です。");
		System.out.println("商品コード：" + rail1.code_ + "の価格は" + rail1.price_ + "円です。");
		System.out.println();
	}

	// デモする
	public void doDemo(CarToy auto1, PatrolCarToy pcar1, TrainToy rail1) {
		System.out.println("店長の" + name_ + "です。これからデモします。");
		System.out.println("クルマ1を走らせます。");
		auto1.go();
		System.out.println("パトカーを走らせます。");
		pcar1.go();
		System.out.println("電車を走らせます。");
		rail1.go();
		System.out.println();
	}
}
