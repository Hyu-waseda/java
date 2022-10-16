public class task1B{
	public static void main(String[] args){
	System.out.println("あなたの身長は？(cm単位, 小数点以下切り捨て)");
	int height = new java.util.Scanner(System.in).nextInt();
	System.out.println("あなたの体重は？(kg単位, 小数点以下切り捨て)");
	int weight = new java.util.Scanner(System.in).nextInt();
	double height2 = height / 100d;
	double BMI = weight / (height2 * height2);
	System.out.println("あなたの身長は" + height + "で、体重は" + weight + "で、BMIは" + BMI + "です.");
	}
}