package viikko301;

@FunctionalInterface
interface LaskeInt{
	public double laske(int a);
}

public class Tehtävä1 {

	public static void main(String[] args) {
		
		LaskeInt toCelsius = (fahrenheit) -> (fahrenheit-32) * (5.0 / 9);
		LaskeInt area = (radius) -> (Math.PI * radius * radius);
		
		System.out.println(toCelsius.laske(1));
		System.out.println(area.laske(2));
	}
}
