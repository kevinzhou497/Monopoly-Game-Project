
import java.awt.IllegalComponentStateException;

public class GameRunner {
	public static void main(String[] args)
	{
		try {
		StartingWindow sw = new StartingWindow();
		}
		catch (IllegalComponentStateException ie) {	}
	}
}
