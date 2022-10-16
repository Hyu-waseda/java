public class prac4E{
	public static void main(String[] args){
		int count = 0;
		while(count == 0){
		System.out.println("1か,2か3を選んで入力してください");
		int num = new java.util.Scanner(System.in).nextInt();
			switch(num){
				case 1:
					System.out.println(1);
					count++;
					break;
				case 2:
					System.out.println(2);
					count++;
					break;
				case 3:
					System.out.println(3);
					count++;
					break;
			}
		}
	}
}