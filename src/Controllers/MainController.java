package Controllers;

import java.io.IOException;

public class MainController {

	public static void main(String[] args) {
		Shell shell = new Shell();
		try {
			shell.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
