import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayı = sc.nextInt();
		
		for (int i =1; i <=10; i++) {
			System.out.println(sayı + " * " + i + " = " + sayı * i);
		}

	}

}
