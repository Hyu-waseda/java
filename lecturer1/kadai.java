//自作ヌメロン
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class kadai{
  public static void main(String[] args){
    numeron();

  }
  // 任意の桁のヌメロンを行う。
  public static void numeron(){
    //桁数に基づき、乱数の範囲を調整する。
    System.out.println("ヌメロンを開始。桁数を入力。");
    Scanner scanner = new Scanner(System.in);
    int DIGIT = scanner.nextInt();
    int MAX = pow(10, DIGIT);
    int MIN = pow(10, DIGIT - 1);

     //桁が重複しないDIGIT桁の整数を生成する。
    Random r = new Random();
    int ans = 0;
    do{
      ans = r.nextInt(MAX - MIN) + MIN;
    }while(check(ans, DIGIT));
    System.out.println("解答の生成が完了。");
    String[] ans_Array = convert_to_S_array(ans);

    //正解するまで繰り返す。回答数をカウントし、正解時に表示する。
    int cnt = 0;
    while (true){
      int your_ans = 0;
      do{
        System.out.println(DIGIT+"桁の答えを入力。数字の重複は禁止。");
        your_ans = scanner.nextInt();
      }while(check(your_ans, DIGIT));
      
      String [] your_ans_Array = convert_to_S_array(your_ans);
      int eat = 0;
      int bite = 0;
      for (int i = 0; i < your_ans_Array.length; i++){
        if (your_ans_Array[i].equals(ans_Array[i])){
          eat += 1;
        }else if(Arrays.asList(ans_Array).contains(your_ans_Array[i])){
          bite += 1;
        }
      }
      System.out.println(eat+"EAT, "+bite+"BITE");
      cnt += 1;
      if (eat == ans_Array.length){
        System.out.println("正解、正解までの回数は"+cnt+"回。");
        if(DIGIT >= 3 && cnt >= DIGIT*5){
          System.out.println("知能の程度を懸念。");
        }else if(DIGIT >= 3 && cnt >= DIGIT*3){
          System.out.println("平凡な知能。");
        }else if(DIGIT >= 3){
          System.out.println("優秀な知能。");
        }else {
          System.out.println(DIGIT+"桁で楽しいのか疑問。");
        }
        
        break;
      }
    }
    
  }
  // 文字列を一文字ずつ配列にする方法。
  // https://yuu.1000quu.com/java_string_to_array　の「charAtを使ったもっと便利なやり方」を参照。
  public static String[] convert_to_S_array(int x){
    String x_Str = String.valueOf(x);
    String [] x_Array = new String[x_Str.length()];
    for (int i = 0; i < x_Str.length(); i++){
      x_Array[i] = String.valueOf(x_Str.charAt(i));
    }
    return x_Array;
  }
  //整数aの整数b乗を返す関数
  public static int pow(int a, int b){
    int x = a;
    if(b == 0){
      return 1;
    }
    for (int i = 1; i < b; i++){
      x *= a;
    }
    return x;
  }
  //整数の桁数が合っているか、桁の重複がないか、を確認する関数
  //桁の重複の確認は、https://programmer-life.work/java/array-duplicate-checkの「重複をカウントする」を参照。
  public static boolean check(int a, int b){
    boolean bool = false;
    String[] a_array = convert_to_S_array(a);
    int duplicate = 0;
    for (int i = 0; i < a_array.length; i++) {
        for (int k = 0; k < a_array.length; k++) {
            if (k != i && a_array[k].equals(a_array[i])){
                duplicate++;
            }
        }
    }
    if(duplicate >= 2) {
      bool = true;
    }
    if(String.valueOf(a).length() != b){
      bool = true;
    }
    return bool;
  }

}
