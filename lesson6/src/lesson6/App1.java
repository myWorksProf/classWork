package lesson6;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Начало интервала: \t");
		double start = sc.nextDouble();		
		System.out.print("конец интервала: \t");
		double end = sc.nextDouble();
		System.out.print("число для проверки: \t");
		double number = sc.nextDouble();
		
		if (start  <= number && number <= end ) {
			System.out.println("Попал в интервал");
		}
			
	 else {
		System.err.println("НЕ  Попал в интервал");
	}
		sc.close();
 }
}
