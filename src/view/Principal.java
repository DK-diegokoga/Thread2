package view;

import controller.Thread2;

public class Principal {
	public static void main(String[]args) {
		
		for (int x = 0; x < 3; x ++) {
			Thread thread = new Thread2(x);
			thread.start();
		}	
	}
}
