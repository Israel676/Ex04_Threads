package view;

import controller.SapoController;

public class Main {

	public static void main(String[] args) {
		
		Thread sapo0 = new SapoController(20);
		Thread sapo1 = new SapoController(20);
		Thread sapo2 = new SapoController(20);
		Thread sapo3 = new SapoController(20);
		Thread sapo4 = new SapoController(20);
		
		sapo0.start();
		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		
	}

}
