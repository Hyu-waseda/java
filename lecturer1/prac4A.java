public class prac4A{
	public static void main(String[] args){
		int a = new java.util.Random().nextInt(99);
		int b = new java.util.Random().nextInt(99);
		if(a <= 30 && b >= 20){
			System.out.println("Aはあたり");
		}else{
			System.out.println("Aはハズレ");
		}
		if(a <= 20 || a >= 40){
			System.out.println("Bはあたり");
		}else{
			System.out.println("Bはハズレ");
		}
	}
}