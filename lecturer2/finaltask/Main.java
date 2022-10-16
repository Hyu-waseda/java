public class Main {
	public static void main(String[] args) {
		ShopKeeper okuma = new ShopKeeper("大隈");
		CarToy car1 = new CarToy("C001", 500);
		PatrolCarToy pcar1 = new PatrolCarToy("P001", 600);
		TrainToy train1 = new TrainToy("T001", 700);

		// 価格チェックの実行
		okuma.checkPrice(car1, pcar1, train1);

		// デモの実行
		okuma.doDemo(car1, pcar1, train1);
	}
}