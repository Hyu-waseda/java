public class prac3E{
	public static void main(String[] args){
		System.out.println("あなたの今日の運勢は？");
		int fortune = new java.util.Random().nextInt(3);
		System.out.println("占いの結果が出ました！");
		switch(fortune){
		case 0:
			System.out.println("大吉");
			break;
		case 1:
			System.out.println("中吉");
			break;
		case 2:
			System.out.println("吉");
			break;
		case 3:
			System.out.println("凶");
			break;
		}
	}
}