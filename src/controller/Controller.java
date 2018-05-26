package controller;

public class Controller {
	private static Controller controller;

	private Controller() {

	}

	public Controller getInstance() {
		if (controller == null)
			controller = new Controller();
		return controller;
	}

	public void initComponents() {

	}

}
