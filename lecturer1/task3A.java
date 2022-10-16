public class task3A{
	public static void main(String[] args){
		System.out.println("メールを作成します");
		System.out.println("送り先のアドレスを入力してください");
		String address = new java.util.Scanner(System.in).nextLine();
		System.out.println("件名を入力してください");
		String title = new java.util.Scanner(System.in).nextLine();
		System.out.println("本文を入力してください");
		String mail = new java.util.Scanner(System.in).nextLine();
		hyouji(address, title, mail);
}
	public static void hyouji(String x, String y, String z){
		System.out.println(x + "に以下のメールを送りました");
		System.out.println("タイトル：" + y);
		System.out.println("本文：" + z);
	}
}