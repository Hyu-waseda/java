public class advA{
	public static void main(String[] args){
		System.out.println("あなたのBMIと適正体重をお知らせします");
		System.out.println("あなたの身長を入力してください(cmで)");
		double height = new java.util.Scanner(System.in).nextDouble();
		System.out.println("あなたの体重を入力してください(kgで)");
		double weight = new java.util.Scanner(System.in).nextDouble();
		System.out.println(height);
		BMI(weight, height);
	}
	
	public static void BMI(double w, double h){
		double h100 = h/100;
		double BMI = w/(h100*h100);
		String type = "";
		if(BMI < 18.5){
		type = "やせすぎ";
		}
		else if(BMI <25){
		type = "標準";
		}
		else{
		type = "肥満";
		}
		System.out.printf("%s%.2f%s%s%s%n","あなたのBMIは",BMI,"で,",type,"です");
	}
}