public class Main {
	public static void main(String[] args) {
		ShopKeeper okuma = new ShopKeeper("大隈");
		CarToy car1 = new CarToy("C001", 500);
		CarToy car2 = new CarToy("C002", 500);
		TrainToy train1 = new TrainToy("T001", 700);

		//価格チェックの実行
		okuma.checkPrice(car1, car2, train1);

		//デモの実行
		okuma.doDemo(car1, car2, train1);
;	}
}
