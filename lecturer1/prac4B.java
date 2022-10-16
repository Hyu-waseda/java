public class prac4B{
	public static void main(String[] args){
		System.out.println("赤と青のどっちかが正解");
		System.out.println("どちらかを入力してね");
		String color = new java.util.Scanner(System.in).nextLine();
		String T = "赤";
		if(T.equals(color)){
			System.out.println("正解");
		}else{
			System.out.println("間違え");
		}
	}
}