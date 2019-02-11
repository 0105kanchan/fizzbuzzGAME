package Fizzbuzzgame;

import java.util.Scanner;

public class Fizzbuzzgame {

	public static void main(String[] args) {

		System.out.println("FizzBuzzゲーム！！");
		System.out.println("好きな数字を入力してください。");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("あなたが入力した数字は"+ num +"です。");

		for(int i=1;i<num+1;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if(i%5==0){
				System.out.println("Fizz");
			}else if(i%3==0){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	}

}
