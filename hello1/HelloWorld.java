import edu.duke.*;

public class HelloWorld {
	public void runHello () {
		URLResource rs = new URLResource("https://nytimes.com");
		for (String line : rs.lines()) {
			System.out.println(line);
		}
	}
}
