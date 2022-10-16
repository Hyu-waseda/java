public class prac5B{
	public static void main(String[] args){
		byebye2("鈴木さん");
		System.out.println("あなたの名前を入力してください");
		String Yname = new java.util.Scanner(System.in).nextLine();
		byebye2(Yname);
		
		age1(1);
		System.out.println("年齢を入力してください");
		int Yage = new java.util.Scanner(System.in).nextInt();
		age1(Yage);
	}
	public static void byebye2(String name){
		System.out.println(name + "さん, ばいばいー");
	}
	public static void age1(int age){
		System.out.println("あなたは" + age + "才です");
	}
}
		