package oopWithNLayerApp.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println(data + " Logged the Database");
	}

}
