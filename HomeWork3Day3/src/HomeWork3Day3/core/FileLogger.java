package HomeWork3Day3.core;

public class FileLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("Logged to File: " + message);

	}

}
