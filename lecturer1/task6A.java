public class task6A{
	public static void main(String[] args){
		mail();
	}
	public static void mail(){
		System.out.println("メールを作成します");
		System.out.println("送り先のアドレスを入力してください");
		String address = new java.util.Scanner(System.in).nextLine();
		System.out.println("件名を入力してください");
		String title = new java.util.Scanner(System.in).nextLine();
		System.out.println("本文を入力してください");
		String mail = new java.util.Scanner(System.in).nextLine();
		System.out.println(address + "に以下のメールを送りました");
		System.out.println("タイトル：" + title);
		System.out.println("本文：" + mail);
	}
}