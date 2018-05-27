package test;

import controller.Controller;

public class RunContoller {
	public static void main(String[] args) {
		Controller controller =  Controller.getInstance();
		controller.initComponents();
		controller.addDepartment();
	}
}
