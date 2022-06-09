package lesson6;

import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите x:\t");
		int x = sc.nextInt();
		System.out.print("Введите y:\t");
		int y = sc.nextInt();
		System.out.print("Введите z:\t");
		int z = sc.nextInt();
		
		int max = (x > y ? (x > z ? x : z) : (y > z ? y : z));
		System.out.println("max тернарный- " + max);
		if (x > y && x > z) {
			max  = x;
		} else if (y > z) {
			max = y;
		} else {
			max = z;
		}
		System.out.println("max if- " + max);
		
		sc.close();
	}

}

// 123   +  +  +
// 132   +  +  + 
// 213   +  +  +
// 231   +  +  +
// 312   +  +  +
// 321   +  +  
