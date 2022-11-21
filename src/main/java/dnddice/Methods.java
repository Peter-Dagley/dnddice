package dnddice;

import java.util.ArrayList;
import java.util.Random;

public class Methods {
	
	static Random random = new Random();

	// Method for D4
	public static ArrayList<Integer> d4(int num1) {
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		int i;
		for(i = 0; i < num1; i++) {
			rolls.add(random.nextInt(4) + 1);
		}
		return rolls;
	}
	
	// Method for D6
	public static ArrayList<Integer> d6(int num1) {
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		int i;
		for(i = 0; i < num1; i++) {
			rolls.add(random.nextInt(6) + 1);
		}
		return rolls;
	}
	
	// Method for D8
	public static ArrayList<Integer> d8(int num1) {
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		int i;
		for(i = 0; i < num1; i++) {
			rolls.add(random.nextInt(8) + 1);
		}
		return rolls;
	}
	
	// Method for D12
	public static ArrayList<Integer> d12(int num1) {
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		int i;
		for(i = 0; i < num1; i++) {
			rolls.add(random.nextInt(12) + 1);
		}
		return rolls;
	}
	
	// Method for D20
	public static ArrayList<Integer> d20(int num1) {
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		int i;
		for(i = 0; i < num1; i++) {
			rolls.add(random.nextInt(20) + 1);
		}
		return rolls;
	}
	
}
