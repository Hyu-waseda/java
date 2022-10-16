public class prac2D{
	public static void main(String[] args){
		System.out.println("あなたの名前を入力してください");
		
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢は?");
		
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("名前:" + name);
		System.out.println("年齢:" + age);
	}
}