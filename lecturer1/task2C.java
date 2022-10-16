public class task2C{
	public static void main(String[] args){
		String[] b = {"ラーメン","チャーハン","餃子定食","唐揚げ定食"};
		System.out.println("[メニュー]1:" + b[0] + "2:" + b[1] + "3:" + b[2] + "4:" + b[3]);
		int count = 0;
		while(count == 0){
			System.out.println("数字を入力してメニューを選んでね");
			int i = new java.util.Scanner(System.in).nextInt();
			int menu = i - 1;
			switch(i){
				case 1:
					System.out.println("ラーメンを注文します");
					count++;
					break;
				case 2:
					System.out.println("チャーハンを注文します");
					count++;
					break;
				case 3:
					System.out.println("餃子定食を注文します");
					count++;
					break;
				case 4:
					System.out.println("唐揚げ定食注文します");
					count++;
					break;
			}
		}
	}
}