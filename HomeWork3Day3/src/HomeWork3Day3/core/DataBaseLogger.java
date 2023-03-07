package HomeWork3Day3.core;

public class DataBaseLogger implements ILogger{

	@Override
	public void log(String message) {
		System.out.println("Logged to DataBase: " + message);		
	}

}
